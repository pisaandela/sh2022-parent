package com.company.project.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.company.project.core.AbstractService;
import com.company.project.core.ProjectConstant;
import com.company.project.dao.GroupMapper;
import com.company.project.model.Group;
import com.company.project.service.GroupService;
import com.company.project.service.OrderService;
import com.company.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;


/**
 * Created by author on 2022/04/17.
 */
@Service
@Transactional
public class GroupServiceImpl extends AbstractService<Group> implements GroupService {
    @Resource
    private GroupMapper tGroupMapper;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    /**
     * 根据表名导入团购信息
     *
     * @param excelName
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Group importExcelData(String excelName) {
        String filePath = ProjectConstant.EXPORT_PATH + File.separator + excelName + ".xlsx";
        File file = FileUtil.file(filePath);
        ExcelReader reader = ExcelUtil.getReader(file, 4);
        List<Group> groupList = reader.readAll(Group.class);

        Group group = groupList.get(0);
        // 导入团购信息表
        this.save(groupList);
        // 导入产品
        productService.importExcelProductData(filePath, group, 3);
        // 导入订单
        orderService.importExcelOrderData(filePath, group, 2);
        return group;

    }
}
