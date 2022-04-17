package com.company.project.model;

import lombok.Data;

@Data
public class ProductImportDto {

    private Long id;

    private String productNo;

    private String title;
    private String productName;
    private String productSpecs;
    private String groupNo;
    private String productCategory;
    private Integer saleNum;

  //  团购标题	所属团长	商品	商品ID	商品编码	规格	分类	总库存	当前库存（总库存-销售数量）	销售数量	团当前单价	商品总金额	商品成本价	商品利润粗估



}