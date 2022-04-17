package com.company.project.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.company.project.model.Product;
import com.company.project.model.ProductImportDto;
import com.company.project.service.OrderService;
import com.company.project.service.ProductService;
import com.conpany.project.Tester;
import org.apache.commons.compress.utils.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImplTest extends Tester {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    @Test
    public void testImportOrderList() {
        String no = "1133374156766";
        //orderService.importExcelOrderData(filePath, group);
    }

    @Test
    public void testImportProductList() {
        System.out.println("product");

        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("套餐.xlsx"), 3);
        List<ProductImportDto> productImportDtoList = reader.readAll(ProductImportDto.class);
        List<Product> products = Lists.newArrayList();
        productImportDtoList.forEach(dto -> {
            Product product = new Product();
            product.setProductNo(dto.getProductNo());
            product.setProductName(dto.getProductName());
            product.setProductNum(dto.getSaleNum());
            products.add(product);

        });
        productService.save(products);
        System.out.println("product");

    }
}