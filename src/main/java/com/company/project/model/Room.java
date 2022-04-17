package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_room")
public class Room {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 地址表id
     */
    @Column(name = "address_id")
    private Long addressId;

    /**
     * 室
     */
    @Column(name = "room_no")
    private String roomNo;

    /**
     * 人数
     */
    @Column(name = "user_count")
    private Integer userCount;

    /**
     * 顺序
     */
    private Integer sort;

    /**
     * 插入时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取地址表id
     *
     * @return address_id - 地址表id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 设置地址表id
     *
     * @param addressId 地址表id
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取室
     *
     * @return room_no - 室
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置室
     *
     * @param roomNo 室
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * 获取人数
     *
     * @return user_count - 人数
     */
    public Integer getUserCount() {
        return userCount;
    }

    /**
     * 设置人数
     *
     * @param userCount 人数
     */
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * 获取顺序
     *
     * @return sort - 顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置顺序
     *
     * @param sort 顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取插入时间
     *
     * @return create_time - 插入时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置插入时间
     *
     * @param createTime 插入时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}