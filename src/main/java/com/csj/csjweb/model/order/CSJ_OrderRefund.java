package com.csj.csjweb.model.order;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_order_refund")
public class CSJ_OrderRefund {
    @Id
    private Integer id;

    @Column(name = "payment_amount")
    private BigDecimal paymentAmount;

    private Integer status;

    @Column(name = "return_type")
    private String returnType;

    @Column(name = "receiving_state")
    private String receivingState;

    @Column(name = "refund_reason")
    private String refundReason;

    @Column(name = "refund_amount")
    private BigDecimal refundAmount;

    @Column(name = "refund_desc")
    private String refundDesc;

    @Column(name = "refund_url")
    private String refundUrl;

    @Column(name = "order_no")
    private String orderNo;

    private String express;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "express_no")
    private String expressNo;

    private String mobile;

    @Column(name = "last_check_date")
    private Date lastCheckDate;

    @Column(name = "refound_time")
    private Date refoundTime;

    @Column(name = "refound_num")
    private String refoundNum;

    @Column(name = "notify_time")
    private Date notifyTime;

    private Integer quantity;

    @Column(name = "supply_id")
    private Integer supplyId;

    @Column(name = "user_is_delete")
    private Integer userIsDelete;

    @Column(name = "supply_is_delete")
    private Integer supplyIsDelete;

    @Column(name = "is_certificate")
    private Integer isCertificate;

    @Column(name = "certificate_amount")
    private BigDecimal certificateAmount;

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
     * @return payment_amount
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return return_type
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * @param returnType
     */
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    /**
     * @return receiving_state
     */
    public String getReceivingState() {
        return receivingState;
    }

    /**
     * @param receivingState
     */
    public void setReceivingState(String receivingState) {
        this.receivingState = receivingState;
    }

    /**
     * @return refund_reason
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * @param refundReason
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    /**
     * @return refund_amount
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * @param refundAmount
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * @return refund_desc
     */
    public String getRefundDesc() {
        return refundDesc;
    }

    /**
     * @param refundDesc
     */
    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    /**
     * @return refund_url
     */
    public String getRefundUrl() {
        return refundUrl;
    }

    /**
     * @param refundUrl
     */
    public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
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
     * @return express
     */
    public String getExpress() {
        return express;
    }

    /**
     * @param express
     */
    public void setExpress(String express) {
        this.express = express;
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
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return express_no
     */
    public String getExpressNo() {
        return expressNo;
    }

    /**
     * @param expressNo
     */
    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return last_check_date
     */
    public Date getLastCheckDate() {
        return lastCheckDate;
    }

    /**
     * @param lastCheckDate
     */
    public void setLastCheckDate(Date lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }

    /**
     * @return refound_time
     */
    public Date getRefoundTime() {
        return refoundTime;
    }

    /**
     * @param refoundTime
     */
    public void setRefoundTime(Date refoundTime) {
        this.refoundTime = refoundTime;
    }

    /**
     * @return refound_num
     */
    public String getRefoundNum() {
        return refoundNum;
    }

    /**
     * @param refoundNum
     */
    public void setRefoundNum(String refoundNum) {
        this.refoundNum = refoundNum;
    }

    /**
     * @return notify_time
     */
    public Date getNotifyTime() {
        return notifyTime;
    }

    /**
     * @param notifyTime
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
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
     * @return supply_id
     */
    public Integer getSupplyId() {
        return supplyId;
    }

    /**
     * @param supplyId
     */
    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    /**
     * @return user_is_delete
     */
    public Integer getUserIsDelete() {
        return userIsDelete;
    }

    /**
     * @param userIsDelete
     */
    public void setUserIsDelete(Integer userIsDelete) {
        this.userIsDelete = userIsDelete;
    }

    /**
     * @return supply_is_delete
     */
    public Integer getSupplyIsDelete() {
        return supplyIsDelete;
    }

    /**
     * @param supplyIsDelete
     */
    public void setSupplyIsDelete(Integer supplyIsDelete) {
        this.supplyIsDelete = supplyIsDelete;
    }

    /**
     * @return is_certificate
     */
    public Integer getIsCertificate() {
        return isCertificate;
    }

    /**
     * @param isCertificate
     */
    public void setIsCertificate(Integer isCertificate) {
        this.isCertificate = isCertificate;
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
}