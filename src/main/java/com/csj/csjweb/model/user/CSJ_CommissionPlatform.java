package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_commission_platform")
public class CSJ_CommissionPlatform {
    @Id
    private Integer id;

    /**
     * 订单ID
     */
    private Integer oid;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

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
     * 佣金状态:0：佣金冻结，即订单未完成,1：正常佣金记录,-1:退款冻结
     */
    @Column(name = "commission_status")
    private Integer commissionStatus;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 卖出的用户ID
     */
    @Column(name = "sale_user_id")
    private Integer saleUserId;

    /**
     * 产品标题
     */
    @Column(name = "product_title")
    private String productTitle;

    private Integer type;

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
     * 获取佣金状态:0：佣金冻结，即订单未完成,1：正常佣金记录,-1:退款冻结
     *
     * @return commission_status - 佣金状态:0：佣金冻结，即订单未完成,1：正常佣金记录,-1:退款冻结
     */
    public Integer getCommissionStatus() {
        return commissionStatus;
    }

    /**
     * 设置佣金状态:0：佣金冻结，即订单未完成,1：正常佣金记录,-1:退款冻结
     *
     * @param commissionStatus 佣金状态:0：佣金冻结，即订单未完成,1：正常佣金记录,-1:退款冻结
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
     * 获取卖出的用户ID
     *
     * @return sale_user_id - 卖出的用户ID
     */
    public Integer getSaleUserId() {
        return saleUserId;
    }

    /**
     * 设置卖出的用户ID
     *
     * @param saleUserId 卖出的用户ID
     */
    public void setSaleUserId(Integer saleUserId) {
        this.saleUserId = saleUserId;
    }

    /**
     * 获取产品标题
     *
     * @return product_title - 产品标题
     */
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * 设置产品标题
     *
     * @param productTitle 产品标题
     */
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}