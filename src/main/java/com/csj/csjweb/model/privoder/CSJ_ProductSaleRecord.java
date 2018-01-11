package com.csj.csjweb.model.privoder;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_sale_record")
public class CSJ_ProductSaleRecord {
    @Id
    private Integer id;

    private Integer pid;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_type")
    private String productType;

    private Integer uid;

    @Column(name = "order_no")
    private String orderNo;

    private Integer oid;

    @Column(name = "product_amount")
    private BigDecimal productAmount;

    @Column(name = "actual_payment_amount")
    private BigDecimal actualPaymentAmount;

    @Column(name = "sale_status")
    private Integer saleStatus;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "user_no")
    private String userNo;

    @Column(name = "with_drawas_id")
    private Integer withDrawasId;

    private Integer quantity;

    @Column(name = "platform_fee_discount")
    private BigDecimal platformFeeDiscount;

    @Column(name = "supplier_discount")
    private BigDecimal supplierDiscount;

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
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return product_title
     */
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * @param productTitle
     */
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * @return product_type
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return oid
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * @param oid
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * @return product_amount
     */
    public BigDecimal getProductAmount() {
        return productAmount;
    }

    /**
     * @param productAmount
     */
    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    /**
     * @return actual_payment_amount
     */
    public BigDecimal getActualPaymentAmount() {
        return actualPaymentAmount;
    }

    /**
     * @param actualPaymentAmount
     */
    public void setActualPaymentAmount(BigDecimal actualPaymentAmount) {
        this.actualPaymentAmount = actualPaymentAmount;
    }

    /**
     * @return sale_status
     */
    public Integer getSaleStatus() {
        return saleStatus;
    }

    /**
     * @param saleStatus
     */
    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * @return add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * @return user_no
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return with_drawas_id
     */
    public Integer getWithDrawasId() {
        return withDrawasId;
    }

    /**
     * @param withDrawasId
     */
    public void setWithDrawasId(Integer withDrawasId) {
        this.withDrawasId = withDrawasId;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return platform_fee_discount
     */
    public BigDecimal getPlatformFeeDiscount() {
        return platformFeeDiscount;
    }

    /**
     * @param platformFeeDiscount
     */
    public void setPlatformFeeDiscount(BigDecimal platformFeeDiscount) {
        this.platformFeeDiscount = platformFeeDiscount;
    }

    /**
     * @return supplier_discount
     */
    public BigDecimal getSupplierDiscount() {
        return supplierDiscount;
    }

    /**
     * @param supplierDiscount
     */
    public void setSupplierDiscount(BigDecimal supplierDiscount) {
        this.supplierDiscount = supplierDiscount;
    }
}