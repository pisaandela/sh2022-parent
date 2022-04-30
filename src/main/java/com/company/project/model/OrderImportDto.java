package com.company.project.model;

import lombok.Data;

@Data
public class OrderImportDto {

    private Long id;
    private Long roomId;

    private String groupNo;
    private String orderNo;

    private Long userId;
    private Integer productCount;
    private String productName;
    private String productNo;
    private String userName;
    private String userPhone;
    private String roomNo;
    private String floorNo;
    private String addressNo;
    private String memberRemark;
    private String groupRemark;

  //  跟团号	下单人	数量	收货人	联系电话	房号（如606）	楼号（如10）	弄号（如168）



}