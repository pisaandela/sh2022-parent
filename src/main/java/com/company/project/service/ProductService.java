package com.company.project.service;

import com.company.project.model.Group;
import com.company.project.model.Product;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by chenZiMing on 2022/04/16.
 */
public interface ProductService extends Service<Product> {

    void importExcelProductData(String filePath, Group group);

    List<Product> findByGroup(Group group);
}
