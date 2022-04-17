package com.company.project.enums;

public enum ExcelIndexEnum {
    GROUP_INDEX(4, "group"),
    PRODUCT_INDEX(3, "product"),
    ORDER_INDEX(2, "order");

    private String index;
    private int i;

    ExcelIndexEnum(int i, String index) {
        this.index = index;
        this.i = i;
    }
}
