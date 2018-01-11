package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_commission_record")
public class CSJ_CommissionRecord {
    @Id
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 订单ID
     */
    private Integer oid;

    /**
     * 产品ID
     */
    private Integer pid;

    /**
     * 产品实际支付金额
     */
    @Column(name = "actual_payment_amount")
    private BigDecimal actualPaymentAmount;

    /**
     * 用户赚取的佣金
     */
    @Column(name = "user_commission")
    private BigDecimal userCommission;

    /**
     * 佣金状态0：佣金冻结，即订单未完成，1：正常佣金记录，2：提现中，3：提现成功，-1:退款冻结
     */
    @Column(name = "commission_status")
    private Integer commissionStatus;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 下级用户ID
     */
    @Column(name = "sub_user_id")
    private Integer subUserId;

    /**
     * 下级用户姓名
     */
    @Column(name = "sub_user_name")
    private String subUserName;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 区分佣金或者收益0为佣金，1为收益
     */
    private Integer type;

    /**
     * 提现表ID
     */
    @Column(name = "cash_id")
    private Integer cashId;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

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
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取订单ID
     *
     * @return oid - 订单ID
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置订单ID
     *
     * @param oid 订单ID
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 获取产品ID
     *
     * @return pid - 产品ID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置产品ID
     *
     * @param pid 产品ID
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取产品实际支付金额
     *
     * @return actual_payment_amount - 产品实际支付金额
     */
    public BigDecimal getActualPaymentAmount() {
        return actualPaymentAmount;
    }

    /**
     * 设置产品实际支付金额
     *
     * @param actualPaymentAmount 产品实际支付金额
     */
    public void setActualPaymentAmount(BigDecimal actualPaymentAmount) {
        this.actualPaymentAmount = actualPaymentAmount;
    }

    /**
     * 获取用户赚取的佣金
     *
     * @return user_commission - 用户赚取的佣金
     */
    public BigDecimal getUserCommission() {
        return userCommission;
    }

    /**
     * 设置用户赚取的佣金
     *
     * @param userCommission 用户赚取的佣金
     */
    public void setUserCommission(BigDecimal userCommission) {
        this.userCommission = userCommission;
    }

    /**
     * 获取佣金状态0：佣金冻结，即订单未完成，1：正常佣金记录，2：提现中，3：提现成功，-1:退款冻结
     *
     * @return commission_status - 佣金状态0：佣金冻结，即订单未完成，1：正常佣金记录，2：提现中，3：提现成功，-1:退款冻结
     */
    public Integer getCommissionStatus() {
        return commissionStatus;
    }

    /**
     * 设置佣金状态0：佣金冻结，即订单未完成，1：正常佣金记录，2：提现中，3：提现成功，-1:退款冻结
     *
     * @param commissionStatus 佣金状态0：佣金冻结，即订单未完成，1：正常佣金记录，2：提现中，3：提现成功，-1:退款冻结
     */
    public void setCommissionStatus(Integer commissionStatus) {
        this.commissionStatus = commissionStatus;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取下级用户ID
     *
     * @return sub_user_id - 下级用户ID
     */
    public Integer getSubUserId() {
        return subUserId;
    }

    /**
     * 设置下级用户ID
     *
     * @param subUserId 下级用户ID
     */
    public void setSubUserId(Integer subUserId) {
        this.subUserId = subUserId;
    }

    /**
     * 获取下级用户姓名
     *
     * @return sub_user_name - 下级用户姓名
     */
    public String getSubUserName() {
        return subUserName;
    }

    /**
     * 设置下级用户姓名
     *
     * @param subUserName 下级用户姓名
     */
    public void setSubUserName(String subUserName) {
        this.subUserName = subUserName;
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
     * 获取区分佣金或者收益0为佣金，1为收益
     *
     * @return type - 区分佣金或者收益0为佣金，1为收益
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置区分佣金或者收益0为佣金，1为收益
     *
     * @param type 区分佣金或者收益0为佣金，1为收益
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取提现表ID
     *
     * @return cash_id - 提现表ID
     */
    public Integer getCashId() {
        return cashId;
    }

    /**
     * 设置提现表ID
     *
     * @param cashId 提现表ID
     */
    public void setCashId(Integer cashId) {
        this.cashId = cashId;
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
}