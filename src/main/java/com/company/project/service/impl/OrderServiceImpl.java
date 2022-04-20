package com.company.project.service.impl;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.company.project.core.AbstractService;
import com.company.project.core.ProjectConstant;
import com.company.project.dao.OrderMapper;
import com.company.project.model.*;
import com.company.project.service.*;
import org.apache.commons.compress.utils.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Created by author on 2022/04/16.
 */
@Service
@Transactional
public class OrderServiceImpl extends AbstractService<Order> implements OrderService {
    @Resource
    private OrderMapper tOrderMapper;
    @Resource
    private ProductService productService;
    @Resource
    private GroupService groupService;
    @Resource
    private UserService userService;
    @Resource
    private RoomService roomService;

    @Override
    public void importList() {

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String importExcelProductData() {
        //ExcelReader reader = ExcelUtil.getReader(FileUtil.file(parentPath+"套餐.xlsx"), 3);
        //List<ProductImportDto> productImportDtoList = reader.readAll(ProductImportDto.class);
        //List<Product> products = Lists.newArrayList();
        //productImportDtoList.forEach(dto -> {
        //    Product product = new Product();
        //    product.setProductNo(dto.getProductNo());
        //    product.setProductName(dto.getProductName());
        //    product.setProductNum(dto.getSaleNum());
        //    products.add(product);
        //
        //});
        //productService.save(products);
        //return products.get(0).getProductNo();
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void importExcelOrderData(String filePath, Group group, Integer index) {
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file(filePath), index);
        List<OrderImportDto> orderList = reader.readAll(OrderImportDto.class);
        List<Order> orders = Lists.newArrayList();
        // 根据团购订单编号找到商品集合

        String groupNo = group.getGroupNo();
        List<Product> productList = productService.findByGroup(group);
        Map<String, Product> productMap = productList.stream().collect(
                Collectors.toMap(product -> product.getProductName() + (StrUtil.isEmpty(product.getProductSpecs()) ? "" : "(" + product.getProductSpecs() + ")"),
                        Function.identity(),
                        (k1, k2) -> k1)
        );
        // 拆分订单数据，用户与订单，数量，订单与门牌号
        orderList.forEach(dto -> {
            String userPhone = dto.getUserPhone();
            String addressNo = dto.getAddressNo();
            String floorNo = dto.getFloorNo();
            String roomNo = dto.getRoomNo();
            String userName = dto.getUserName();
            //String productName = StrUtil.sub(dto.getProductName(),0,StrUtil.indexOf(dto.getProductName(),'('));
            String productName = dto.getProductName();
            String productNo = productMap.get(productName).getProductNo();
            String orderNo = dto.getOrderNo();
            Integer productCount = dto.getProductCount();

            Order order = new Order();
            order.setGroupNo(groupNo);
            order.setOrderNo(orderNo);
            order.setProductCount(productCount);
            order.setUserName(userName);
            order.setUserPhone(userPhone);
            order.setAddressNo(addressNo);
            order.setFloorNo(floorNo);
            order.setRoomNo(roomNo);
            order.setProductNo(productNo);
            //phoneUserSet.add(dto);

            orders.add(order);

        });

        this.save(orders);
    }

    @Override
    public List<OrderVo> getByProductNo(String productNo) {
        List<OrderVo> result = tOrderMapper.getByProductNo(productNo);
        return result;
    }

    @Override
    public List<OrderVo> getByGroup(Group group) {
        List<OrderVo> result = tOrderMapper.getByGroupNo(group);
        return result;
    }

    @Override
    public void exportToExcel(Group group, List<OrderVo> result) {

        // 通过工具类创建writer
        String groupName = StrUtil.replace(group.getGroupName(), "/", "-");
        ExcelWriter writer = ExcelUtil.getWriter(ProjectConstant.EXPORT_PATH + File.separator + System.currentTimeMillis() + groupName + ".xlsx");
        //自定义标题别名
        writer.addHeaderAlias("buildNo", "楼栋顺序");
        writer.addHeaderAlias("sort", "配送顺序");
        writer.addHeaderAlias("addressNo", "弄");
        writer.addHeaderAlias("floorNo", "楼");
        writer.addHeaderAlias("roomNo", "室");
        writer.addHeaderAlias("productCount", "数量");
        writer.addHeaderAlias("productName", "商品名称");
        writer.addHeaderAlias("userPhone", "电话");
        writer.addHeaderAlias("userName", "姓名");
        writer.addHeaderAlias("getFlag", "是否送达");
        writer.addHeaderAlias("lockFlag", "封控类型");

        // 默认的，未添加alias的属性也会写出，如果想只写出加了别名的字段，可以调用此方法排除之
        writer.setOnlyAlias(true);

        // 合并单元格后的标题行，使用默认标题样式
        writer.merge(10, groupName + ": " + group.getProductCount() + "份");
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(result, true);
        // 关闭writer，释放内存
        writer.close();
    }
}
