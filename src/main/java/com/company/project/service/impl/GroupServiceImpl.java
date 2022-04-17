package com.company.project.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.company.project.core.AbstractService;
import com.company.project.dao.GroupMapper;
import com.company.project.model.Group;
import com.company.project.service.GroupService;
import com.company.project.service.OrderService;
import com.company.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;


/**
 * Created by chenZiMing on 2022/04/17.
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


    @Value("${excel.parent.path}")
    private String parentPath;

    @Override
    @Transactional
    public Group importExcelData() {
        String filePath = parentPath + "套餐.xlsx";
        File file = FileUtil.file(filePath);
        ExcelReader reader = ExcelUtil.getReader(file, 4);
        List<Group> groupList = reader.readAll(Group.class);
        Group group = groupList.get(0);
        this.save(groupList);
        productService.importExcelProductData(filePath, group);
        orderService.importExcelOrderData(filePath, group);
        return group;

    }
}
