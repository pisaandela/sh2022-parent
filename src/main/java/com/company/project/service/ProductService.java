package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.Group;
import com.company.project.model.Product;

import java.util.List;


/**
 * Created by author on 2022/04/16.
 */
public interface ProductService extends Service<Product> {

    /**
     * 根据团购信息，导入产品信息
     *
     * @param filePath
     * @param group
     * @param index
     */
    void importExcelProductData(String filePath, Group group, Integer index);

    /**
     * 根据团购信息查找产品
     *
     * @param group
     * @return
     */
    List<Product> findByGroup(Group group);
}
