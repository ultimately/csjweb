package com.csj.csjweb.model.order;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "csj_order_infos")
public class CSJ_OrderInfos {
    @Id
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_price")
    private BigDecimal productPrice;

    private Integer quantity;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_pic")
    private String productPic;

    private BigDecimal discount;

    @Column(name = "discount_price")
    private BigDecimal discountPrice;

    @Column(name = "batch_number")
    private String batchNumber;

    @Column(name = "pay_product_price")
    private BigDecimal payProductPrice;

    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

    @Column(name = "certificate_authority")
    private String certificateAuthority;

    @Column(name = "certificate_amount")
    private BigDecimal certificateAmount;

    @Column(name = "certificate_id")
    private Integer certificateId;

    @Column(name = "certificate_num")
    private String certificateNum;

    /**
     * 供应商折扣
     */
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
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return product_price
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
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
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return product_pic
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * @param productPic
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    /**
     * @return discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * @param discount
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * @return discount_price
     */
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    /**
     * @param discountPrice
     */
    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * @return batch_number
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * @param batchNumber
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * @return pay_product_price
     */
    public BigDecimal getPayProductPrice() {
        return payProductPrice;
    }

    /**
     * @param payProductPrice
     */
    public void setPayProductPrice(BigDecimal payProductPrice) {
        this.payProductPrice = payProductPrice;
    }

    /**
     * @return coupon_amount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * @param couponAmount
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * @return certificate_authority
     */
    public String getCertificateAuthority() {
        return certificateAuthority;
    }

    /**
     * @param certificateAuthority
     */
    public void setCertificateAuthority(String certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * @return certificate_amount
     */
    public BigDecimal getCertificateAmount() {
        return certificateAmount;
    }

    /**
     * @param certificateAmount
     */
    public void setCertificateAmount(BigDecimal certificateAmount) {
        this.certificateAmount = certificateAmount;
    }

    /**
     * @return certificate_id
     */
    public Integer getCertificateId() {
        return certificateId;
    }

    /**
     * @param certificateId
     */
    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * @return certificate_num
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * @param certificateNum
     */
    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    /**
     * 获取供应商折扣
     *
     * @return supplier_discount - 供应商折扣
     */
    public BigDecimal getSupplierDiscount() {
        return supplierDiscount;
    }

    /**
     * 设置供应商折扣
     *
     * @param supplierDiscount 供应商折扣
     */
    public void setSupplierDiscount(BigDecimal supplierDiscount) {
        this.supplierDiscount = supplierDiscount;
    }
}