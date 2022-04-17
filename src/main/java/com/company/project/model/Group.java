package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_group")
public class Group {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 团购编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 团购名称
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 产品总数
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 开团日期
     */
    @Column(name = "group_date")
    private Date groupDate;

    /**
     * 插入时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 订单总数
     */
    @Column(name = "order_count")
    private Integer orderCount;

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
     * 获取团购编号
     *
     * @return group_no - 团购编号
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置团购编号
     *
     * @param groupNo 团购编号
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * 获取团购名称
     *
     * @return group_name - 团购名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置团购名称
     *
     * @param groupName 团购名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取产品总数
     *
     * @return product_count - 产品总数
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置产品总数
     *
     * @param productCount 产品总数
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取开团日期
     *
     * @return group_date - 开团日期
     */
    public Date getGroupDate() {
        return groupDate;
    }

    /**
     * 设置开团日期
     *
     * @param groupDate 开团日期
     */
    public void setGroupDate(Date groupDate) {
        this.groupDate = groupDate;
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
     * 获取订单总数
     *
     * @return order_count - 订单总数
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * 设置订单总数
     *
     * @param orderCount 订单总数
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }
}