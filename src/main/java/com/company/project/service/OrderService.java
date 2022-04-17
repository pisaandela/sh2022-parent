package com.company.project.service;
import com.company.project.model.Group;
import com.company.project.model.Order;
import com.company.project.core.Service;
import com.company.project.model.OrderVo;

import java.util.List;


/**
 * Created by chenZiMing on 2022/04/16.
 */
public interface OrderService extends Service<Order> {

    void importList();

    String importExcelProductData();

    void importExcelOrderData(String filePath, Group group);

    List<OrderVo> getByProductNo(String productNo);

    List<OrderVo> getByGroupNo(String groupNo);
}
