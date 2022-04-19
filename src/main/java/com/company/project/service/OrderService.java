package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.Group;
import com.company.project.model.Order;
import com.company.project.model.OrderVo;

import java.util.List;


/**
 * Created by author on 2022/04/16.
 */
public interface OrderService extends Service<Order> {

    void importList();

    String importExcelProductData();

    /**
     * 根据团购信息，导入订单数据
     *
     * @param filePath
     * @param group
     * @param index
     */
    void importExcelOrderData(String filePath, Group group, Integer index);

    /**
     * 根据订单编号查询
     *
     * @param productNo
     * @return
     */
    List<OrderVo> getByProductNo(String productNo);

    /**
     * 根据团购 查询
     *
     * @param group
     * @return
     */
    List<OrderVo> getByGroup(Group group);


    void exportToExcel(Group group, List<OrderVo> result);
}
