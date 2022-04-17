package com.company.project.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderVo implements Serializable {
    /**
     * 房间表编号
     */

    private Long roomId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单用户
     */
    private Long userId;

    /**
     * 团购数量
     */
    private Integer productCount;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 团购产品编号
     */
    private String productNo;

    /**
     * 房间编号
     */
    private String roomNo;

    /**
     * 弄
     */
    private String addressNo;

    /**
     * 楼
     */
    private String floorNo;


    /**
     * 是否收到
     */
    private Integer getFlag;

    /**
     * 是否付款
     */
    private Integer payFlag;
    /**
     * 封控类型
     */
    private Integer lockFlag;


    /**
     * 排序
     */
    private Integer sort;

    /**
     * 楼栋顺序
     */
    private Integer buildNo;
    /**
     * 备注
     */
    private String remark;
    /**
     * 备注
     */
    private String productName;
}