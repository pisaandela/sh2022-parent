package com.company.project.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderConfirmVo implements Serializable {

    /**
     * 订单编号
     */
    private String orderNo;


    /**
     * 团购数量
     */
    private Integer productCount;


    /**
     * 团购产品编号
     */
    private String productNo;




    /**
     * 是否收到
     */
    private Integer getFlag;



    /**
     * 排序
     */
    private Integer sort;

    private String orderTitle;
    private String orderCount;
    private String addressNo;
    private String floorNo;
    private List<OrderVo> orderList;

}