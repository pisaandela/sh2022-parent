package com.company.project.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_address")
public class Address {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 弄
     */
    @Column(name = "address_no")
    private String addressNo;

    /**
     * 楼
     */
    @Column(name = "floor_no")
    private String floorNo;

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
     * 配送顺序
     */
    private Integer sort;

    /**
     * 楼栋
     */
    @Column(name = "build_no")
    private String buildNo;

    /**
     * 插入时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 封控类型，123
     */
    @Column(name = "lock_flag")
    private Integer lockFlag;

    /**
     * 小区编号
     */
    @Column(name = "village_no")
    private String villageNo;

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
     * 获取弄
     *
     * @return address_no - 弄
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * 设置弄
     *
     * @param addressNo 弄
     */
    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    /**
     * 获取楼
     *
     * @return floor_no - 楼
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * 设置楼
     *
     * @param floorNo 楼
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
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
     * 获取配送顺序
     *
     * @return sort - 配送顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置配送顺序
     *
     * @param sort 配送顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取楼栋
     *
     * @return build_no - 楼栋
     */
    public String getBuildNo() {
        return buildNo;
    }

    /**
     * 设置楼栋
     *
     * @param buildNo 楼栋
     */
    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
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

    /**
     * 获取封控类型，123
     *
     * @return lock_flag - 封控类型，123
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * 设置封控类型，123
     *
     * @param lockFlag 封控类型，123
     */
    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }

    /**
     * 小区编号
     *
     * @return
     */
    public String getVillageNo() {
        return villageNo;
    }

    public void setVillageNo(String villageNo) {
        this.villageNo = villageNo;
    }

}