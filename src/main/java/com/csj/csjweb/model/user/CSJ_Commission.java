package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import javax.persistence.*;

public class CSJ_Commission {
    /**
     * 用户ID
     */
    @Id
    private Integer id;

    private Integer uid;

    /**
     * 佣金/收益总金额
     */
    @Column(name = "total_commission_amount")
    private BigDecimal totalCommissionAmount;

    /**
     * 提现总金额
     */
    @Column(name = "total_cashwithdrawal")
    private BigDecimal totalCashwithdrawal;

    /**
     * 冻结金额，即还不能提现的金额，例如：订单未完成
     */
    @Column(name = "freezing_amount")
    private BigDecimal freezingAmount;

    /**
     * 可提现金额
     */
    @Column(name = "total_amount_available")
    private BigDecimal totalAmountAvailable;

    /**
     * 区分佣金或者收益0为佣金,1为收益
     */
    private Integer type;

    /**
     * 消费总金额
     */
    @Column(name = "total_consumption_amount")
    private BigDecimal totalConsumptionAmount;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取佣金/收益总金额
     *
     * @return total_commission_amount - 佣金/收益总金额
     */
    public BigDecimal getTotalCommissionAmount() {
        return totalCommissionAmount;
    }

    /**
     * 设置佣金/收益总金额
     *
     * @param totalCommissionAmount 佣金/收益总金额
     */
    public void setTotalCommissionAmount(BigDecimal totalCommissionAmount) {
        this.totalCommissionAmount = totalCommissionAmount;
    }

    /**
     * 获取提现总金额
     *
     * @return total_cashwithdrawal - 提现总金额
     */
    public BigDecimal getTotalCashwithdrawal() {
        return totalCashwithdrawal;
    }

    /**
     * 设置提现总金额
     *
     * @param totalCashwithdrawal 提现总金额
     */
    public void setTotalCashwithdrawal(BigDecimal totalCashwithdrawal) {
        this.totalCashwithdrawal = totalCashwithdrawal;
    }

    /**
     * 获取冻结金额，即还不能提现的金额，例如：订单未完成
     *
     * @return freezing_amount - 冻结金额，即还不能提现的金额，例如：订单未完成
     */
    public BigDecimal getFreezingAmount() {
        return freezingAmount;
    }

    /**
     * 设置冻结金额，即还不能提现的金额，例如：订单未完成
     *
     * @param freezingAmount 冻结金额，即还不能提现的金额，例如：订单未完成
     */
    public void setFreezingAmount(BigDecimal freezingAmount) {
        this.freezingAmount = freezingAmount;
    }

    /**
     * 获取可提现金额
     *
     * @return total_amount_available - 可提现金额
     */
    public BigDecimal getTotalAmountAvailable() {
        return totalAmountAvailable;
    }

    /**
     * 设置可提现金额
     *
     * @param totalAmountAvailable 可提现金额
     */
    public void setTotalAmountAvailable(BigDecimal totalAmountAvailable) {
        this.totalAmountAvailable = totalAmountAvailable;
    }

    /**
     * 获取区分佣金或者收益0为佣金,1为收益
     *
     * @return type - 区分佣金或者收益0为佣金,1为收益
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置区分佣金或者收益0为佣金,1为收益
     *
     * @param type 区分佣金或者收益0为佣金,1为收益
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取消费总金额
     *
     * @return total_consumption_amount - 消费总金额
     */
    public BigDecimal getTotalConsumptionAmount() {
        return totalConsumptionAmount;
    }

    /**
     * 设置消费总金额
     *
     * @param totalConsumptionAmount 消费总金额
     */
    public void setTotalConsumptionAmount(BigDecimal totalConsumptionAmount) {
        this.totalConsumptionAmount = totalConsumptionAmount;
    }
}