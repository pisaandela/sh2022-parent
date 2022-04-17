package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_product")
public class Product {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "product_no")
    private String productNo;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 总数
     */
    @Column(name = "product_num")
    private Integer productNum;

    /**
     * 插入时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 团购订单编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 规格
     */
    @Column(name = "product_specs")
    private String productSpecs;

    /**
     * 产品分类
     */
    @Column(name = "product_category")
    private String productCategory;

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
     * 获取订单编号
     *
     * @return product_no - 订单编号
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * 设置订单编号
     *
     * @param productNo 订单编号
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取总数
     *
     * @return product_num - 总数
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * 设置总数
     *
     * @param productNum 总数
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
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
     * 获取团购订单编号
     *
     * @return group_no - 团购订单编号
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置团购订单编号
     *
     * @param groupNo 团购订单编号
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * 获取规格
     *
     * @return product_specs - 规格
     */
    public String getProductSpecs() {
        return productSpecs;
    }

    /**
     * 设置规格
     *
     * @param productSpecs 规格
     */
    public void setProductSpecs(String productSpecs) {
        this.productSpecs = productSpecs;
    }

    /**
     * 获取产品分类
     *
     * @return product_category - 产品分类
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * 设置产品分类
     *
     * @param productCategory 产品分类
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}