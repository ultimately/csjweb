package com.csj.csjweb.model.order;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class CSJ_Orders {
    @Id
    private Integer id;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    private BigDecimal discount;

    @Column(name = "discount_reduction")
    private BigDecimal discountReduction;

    private Integer point;

    @Column(name = "point_redution")
    private BigDecimal pointRedution;

    @Column(name = "payment_amount")
    private BigDecimal paymentAmount;

    @Column(name = "user_id")
    private Integer userId;

    private String province;

    private String city;

    private String county;

    private String street;

    private String address;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "is_pay")
    private Byte isPay;

    @Column(name = "pay_type")
    private String payType;

    @Column(name = "pay_time")
    private Date payTime;

    @Column(name = "delivery_time")
    private Date deliveryTime;

    @Column(name = "user_notes")
    private String userNotes;

    @Column(name = "customer_service_notes")
    private String customerServiceNotes;

    @Column(name = "order_from")
    private String orderFrom;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "is_split_single")
    private Byte isSplitSingle;

    private String coupon;

    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

    private String express;

    @Column(name = "express_amount")
    private BigDecimal expressAmount;

    private String receiver;

    @Column(name = "receiver_mobile")
    private String receiverMobile;

    @Column(name = "express_no")
    private String expressNo;

    @Column(name = "receive_time")
    private Date receiveTime;

    @Column(name = "is_delete")
    private Byte isDelete;

    @Column(name = "sale_id")
    private Integer saleId;

    @Column(name = "pay_no")
    private String payNo;

    @Column(name = "is_cancel")
    private Byte isCancel;

    @Column(name = "certificate_amount")
    private BigDecimal certificateAmount;

    private Integer item1;

    private String item3;

    private String item4;

    private BigDecimal item5;

    private BigDecimal item6;

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
     * @return total_amount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
     * @return discount_reduction
     */
    public BigDecimal getDiscountReduction() {
        return discountReduction;
    }

    /**
     * @param discountReduction
     */
    public void setDiscountReduction(BigDecimal discountReduction) {
        this.discountReduction = discountReduction;
    }

    /**
     * @return point
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * @return point_redution
     */
    public BigDecimal getPointRedution() {
        return pointRedution;
    }

    /**
     * @param pointRedution
     */
    public void setPointRedution(BigDecimal pointRedution) {
        this.pointRedution = pointRedution;
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
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return is_pay
     */
    public Byte getIsPay() {
        return isPay;
    }

    /**
     * @param isPay
     */
    public void setIsPay(Byte isPay) {
        this.isPay = isPay;
    }

    /**
     * @return pay_type
     */
    public String getPayType() {
        return payType;
    }

    /**
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * @return pay_time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * @return delivery_time
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * @param deliveryTime
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * @return user_notes
     */
    public String getUserNotes() {
        return userNotes;
    }

    /**
     * @param userNotes
     */
    public void setUserNotes(String userNotes) {
        this.userNotes = userNotes;
    }

    /**
     * @return customer_service_notes
     */
    public String getCustomerServiceNotes() {
        return customerServiceNotes;
    }

    /**
     * @param customerServiceNotes
     */
    public void setCustomerServiceNotes(String customerServiceNotes) {
        this.customerServiceNotes = customerServiceNotes;
    }

    /**
     * @return order_from
     */
    public String getOrderFrom() {
        return orderFrom;
    }

    /**
     * @param orderFrom
     */
    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    /**
     * @return order_time
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return is_split_single
     */
    public Byte getIsSplitSingle() {
        return isSplitSingle;
    }

    /**
     * @param isSplitSingle
     */
    public void setIsSplitSingle(Byte isSplitSingle) {
        this.isSplitSingle = isSplitSingle;
    }

    /**
     * @return coupon
     */
    public String getCoupon() {
        return coupon;
    }

    /**
     * @param coupon
     */
    public void setCoupon(String coupon) {
        this.coupon = coupon;
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
     * @return express_amount
     */
    public BigDecimal getExpressAmount() {
        return expressAmount;
    }

    /**
     * @param expressAmount
     */
    public void setExpressAmount(BigDecimal expressAmount) {
        this.expressAmount = expressAmount;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * @return receiver_mobile
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * @param receiverMobile
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
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
     * @return receive_time
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * @param receiveTime
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * @return is_delete
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return sale_id
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     * @param saleId
     */
    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    /**
     * @return pay_no
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * @param payNo
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * @return is_cancel
     */
    public Byte getIsCancel() {
        return isCancel;
    }

    /**
     * @param isCancel
     */
    public void setIsCancel(Byte isCancel) {
        this.isCancel = isCancel;
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
     * @return item1
     */
    public Integer getItem1() {
        return item1;
    }

    /**
     * @param item1
     */
    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    /**
     * @return item3
     */
    public String getItem3() {
        return item3;
    }

    /**
     * @param item3
     */
    public void setItem3(String item3) {
        this.item3 = item3;
    }

    /**
     * @return item4
     */
    public String getItem4() {
        return item4;
    }

    /**
     * @param item4
     */
    public void setItem4(String item4) {
        this.item4 = item4;
    }

    /**
     * @return item5
     */
    public BigDecimal getItem5() {
        return item5;
    }

    /**
     * @param item5
     */
    public void setItem5(BigDecimal item5) {
        this.item5 = item5;
    }

    /**
     * @return item6
     */
    public BigDecimal getItem6() {
        return item6;
    }

    /**
     * @param item6
     */
    public void setItem6(BigDecimal item6) {
        this.item6 = item6;
    }
}