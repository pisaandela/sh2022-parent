package com.company.project.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.company.project.core.AbstractService;
import com.company.project.dao.ProductMapper;
import com.company.project.model.Group;
import com.company.project.model.Product;
import com.company.project.model.ProductImportDto;
import com.company.project.service.ProductService;
import org.apache.commons.compress.utils.Lists;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by chenZiMing on 2022/04/16.
 */
@Service
@Transactional
public class ProductServiceImpl extends AbstractService<Product> implements ProductService {
    @Resource
    private ProductMapper tProductMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void importExcelProductData(String filePath, Group group) {
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file(filePath), 3);
        List<ProductImportDto> productImportDtoList = reader.readAll(ProductImportDto.class);
        List<Product> products = Lists.newArrayList();
        productImportDtoList.forEach(dto -> {
            Product product = new Product();
            product.setProductNo(dto.getProductNo());
            product.setProductName(dto.getProductName());
            product.setProductNum(dto.getSaleNum());
            product.setGroupNo(group.getGroupNo());
            product.setProductSpecs(dto.getProductSpecs());
            product.setProductCategory(dto.getProductCategory());
            products.add(product);

        });
        this.save(products);
        //products.forEach(System.out::println);
    }

    @Override
    public List<Product> findByGroup(Group group) {
        String groupNo = group.getGroupNo();
        Product product = new Product();
        product.setGroupNo(groupNo);
        List<Product> result = tProductMapper.select(product);
        return result;
    }
}
