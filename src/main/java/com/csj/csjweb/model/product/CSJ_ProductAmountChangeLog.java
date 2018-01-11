package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_amount_change_log")
public class CSJ_ProductAmountChangeLog {
    @Id
    private Integer id;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品批次号
     */
    @Column(name = "erp_batch_no")
    private String erpBatchNo;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 改价类型  0：商品改价 1：订单改价,2:聊天改价
     */
    @Column(name = "c_type")
    private Integer cType;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 原价
     */
    @Column(name = "sale_price")
    private BigDecimal salePrice;

    /**
     * 标签价
     */
    @Column(name = "product_amount")
    private BigDecimal productAmount;

    /**
     * 改价后标签价
     */
    @Column(name = "change_product_amount")
    private BigDecimal changeProductAmount;

    /**
     * 折扣
     */
    private BigDecimal discount;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取商品批次号
     *
     * @return erp_batch_no - 商品批次号
     */
    public String getErpBatchNo() {
        return erpBatchNo;
    }

    /**
     * 设置商品批次号
     *
     * @param erpBatchNo 商品批次号
     */
    public void setErpBatchNo(String erpBatchNo) {
        this.erpBatchNo = erpBatchNo;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取改价类型  0：商品改价 1：订单改价,2:聊天改价
     *
     * @return c_type - 改价类型  0：商品改价 1：订单改价,2:聊天改价
     */
    public Integer getcType() {
        return cType;
    }

    /**
     * 设置改价类型  0：商品改价 1：订单改价,2:聊天改价
     *
     * @param cType 改价类型  0：商品改价 1：订单改价,2:聊天改价
     */
    public void setcType(Integer cType) {
        this.cType = cType;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取原价
     *
     * @return sale_price - 原价
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 设置原价
     *
     * @param salePrice 原价
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 获取标签价
     *
     * @return product_amount - 标签价
     */
    public BigDecimal getProductAmount() {
        return productAmount;
    }

    /**
     * 设置标签价
     *
     * @param productAmount 标签价
     */
    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    /**
     * 获取改价后标签价
     *
     * @return change_product_amount - 改价后标签价
     */
    public BigDecimal getChangeProductAmount() {
        return changeProductAmount;
    }

    /**
     * 设置改价后标签价
     *
     * @param changeProductAmount 改价后标签价
     */
    public void setChangeProductAmount(BigDecimal changeProductAmount) {
        this.changeProductAmount = changeProductAmount;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}