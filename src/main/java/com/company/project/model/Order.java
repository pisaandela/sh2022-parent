package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class Order {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 房间表编号
     */
    @Column(name = "room_id")
    private Long roomId;

    /**
     * 订单编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 订单用户
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 团购数量
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 用户电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 团购产品编号
     */
    @Column(name = "product_no")
    private String productNo;

    /**
     * 房间编号
     */
    @Column(name = "room_no")
    private String roomNo;

    /**
     * 弄
     */
    @Column(name = "address_no")
    private String addressNo;
 /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 楼
     */
    @Column(name = "floor_no")
    private String floorNo;

    /**
     * 插入时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否收到
     */
    @Column(name = "get_flag")
    private Integer getFlag;

    /**
     * 是否付款
     */
    @Column(name = "pay_flag")
    private Integer payFlag;
    /**
     * 是否付款
     */
    @Column(name = "order_no")
    private String orderNo;
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
     * 获取房间表编号
     *
     * @return room_id - 房间表编号
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置房间表编号
     *
     * @param roomId 房间表编号
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置订单编号
     *
     * @param groupNo 订单编号
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * 获取订单用户
     *
     * @return user_id - 订单用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置订单用户
     *
     * @param userId 订单用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取团购数量
     *
     * @return product_count - 团购数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置团购数量
     *
     * @param productCount 团购数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取用户电话
     *
     * @return user_phone - 用户电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户电话
     *
     * @param userPhone 用户电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取团购产品编号
     *
     * @return product_no - 团购产品编号
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * 设置团购产品编号
     *
     * @param productNo 团购产品编号
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * 获取房间编号
     *
     * @return room_no - 房间编号
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置房间编号
     *
     * @param roomNo 房间编号
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
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
     * 获取是否收到
     *
     * @return get_flag - 是否收到
     */
    public Integer getGetFlag() {
        return getFlag;
    }

    /**
     * 设置是否收到
     *
     * @param getFlag 是否收到
     */
    public void setGetFlag(Integer getFlag) {
        this.getFlag = getFlag;
    }

    /**
     * 获取是否付款
     *
     * @return pay_flag - 是否付款
     */
    public Integer getPayFlag() {
        return payFlag;
    }

    /**
     * 设置是否付款
     *
     * @param payFlag 是否付款
     */
    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }
}