package com.company.project.model;

import lombok.Data;

@Data
public class RoomDto {

    /**
     * 顺序
     */
    private Integer sort;
    /**
     * 弄
     */

    private String addressNo;
    /**
     * 楼栋
     */

    private String buildNo;
    /**
     * 单元楼
     */

    private String floorNo;

    /**
     * 室
     */

    private String roomNo;

    /**
     * 人数
     */

    private Integer userCount;
    /**
     * 楼id
     */
    private Integer addressId;
    /**
     * 房间id
     */
    private Integer roomId;



}