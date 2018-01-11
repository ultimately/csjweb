package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_commission_cash")
public class CSJ_CommissionCash {
    /**
     * 用户ID
     */
    @Id
    private Integer id;

    private Integer uid;

    /**
     * 提现金额
     */
    @Column(name = "cashwithdrawal_amount")
    private BigDecimal cashwithdrawalAmount;

    /**
     * 提现时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 提现状态0：申请提现1：财务审核通过 2：财务审核不通过3：老板审核通过4：老板审核不通过5：打款完成6：提交打款完成7: 打款失败
     */
    private Integer status;

    /**
     * 信息
     */
    private String msg;

    /**
     * 提现方式
     */
    @Column(name = "withdraws_type")
    private String withdrawsType;

    /**
     * 提现账户
     */
    @Column(name = "withdraws_account")
    private String withdrawsAccount;

    /**
     * 财务审核
     */
    @Column(name = "audit_finance")
    private String auditFinance;

    /**
     * 财务审核时间
     */
    @Column(name = "finance_audit_time")
    private Date financeAuditTime;

    /**
     * 老板审核
     */
    @Column(name = "audit_boss")
    private String auditBoss;

    /**
     * 老板审核时间
     */
    @Column(name = "boss_audit_time")
    private Date bossAuditTime;

    /**
     * 银行分行
     */
    @Column(name = "band_name")
    private String bandName;

    /**
     * 提现用户名
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 银行预留手机号码
     */
    @Column(name = "account_phone")
    private String accountPhone;

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
     * 获取提现金额
     *
     * @return cashwithdrawal_amount - 提现金额
     */
    public BigDecimal getCashwithdrawalAmount() {
        return cashwithdrawalAmount;
    }

    /**
     * 设置提现金额
     *
     * @param cashwithdrawalAmount 提现金额
     */
    public void setCashwithdrawalAmount(BigDecimal cashwithdrawalAmount) {
        this.cashwithdrawalAmount = cashwithdrawalAmount;
    }

    /**
     * 获取提现时间
     *
     * @return add_time - 提现时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置提现时间
     *
     * @param addTime 提现时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取提现状态0：申请提现1：财务审核通过 2：财务审核不通过3：老板审核通过4：老板审核不通过5：打款完成6：提交打款完成7: 打款失败
     *
     * @return status - 提现状态0：申请提现1：财务审核通过 2：财务审核不通过3：老板审核通过4：老板审核不通过5：打款完成6：提交打款完成7: 打款失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置提现状态0：申请提现1：财务审核通过 2：财务审核不通过3：老板审核通过4：老板审核不通过5：打款完成6：提交打款完成7: 打款失败
     *
     * @param status 提现状态0：申请提现1：财务审核通过 2：财务审核不通过3：老板审核通过4：老板审核不通过5：打款完成6：提交打款完成7: 打款失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取信息
     *
     * @return msg - 信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置信息
     *
     * @param msg 信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取提现方式
     *
     * @return withdraws_type - 提现方式
     */
    public String getWithdrawsType() {
        return withdrawsType;
    }

    /**
     * 设置提现方式
     *
     * @param withdrawsType 提现方式
     */
    public void setWithdrawsType(String withdrawsType) {
        this.withdrawsType = withdrawsType;
    }

    /**
     * 获取提现账户
     *
     * @return withdraws_account - 提现账户
     */
    public String getWithdrawsAccount() {
        return withdrawsAccount;
    }

    /**
     * 设置提现账户
     *
     * @param withdrawsAccount 提现账户
     */
    public void setWithdrawsAccount(String withdrawsAccount) {
        this.withdrawsAccount = withdrawsAccount;
    }

    /**
     * 获取财务审核
     *
     * @return audit_finance - 财务审核
     */
    public String getAuditFinance() {
        return auditFinance;
    }

    /**
     * 设置财务审核
     *
     * @param auditFinance 财务审核
     */
    public void setAuditFinance(String auditFinance) {
        this.auditFinance = auditFinance;
    }

    /**
     * 获取财务审核时间
     *
     * @return finance_audit_time - 财务审核时间
     */
    public Date getFinanceAuditTime() {
        return financeAuditTime;
    }

    /**
     * 设置财务审核时间
     *
     * @param financeAuditTime 财务审核时间
     */
    public void setFinanceAuditTime(Date financeAuditTime) {
        this.financeAuditTime = financeAuditTime;
    }

    /**
     * 获取老板审核
     *
     * @return audit_boss - 老板审核
     */
    public String getAuditBoss() {
        return auditBoss;
    }

    /**
     * 设置老板审核
     *
     * @param auditBoss 老板审核
     */
    public void setAuditBoss(String auditBoss) {
        this.auditBoss = auditBoss;
    }

    /**
     * 获取老板审核时间
     *
     * @return boss_audit_time - 老板审核时间
     */
    public Date getBossAuditTime() {
        return bossAuditTime;
    }

    /**
     * 设置老板审核时间
     *
     * @param bossAuditTime 老板审核时间
     */
    public void setBossAuditTime(Date bossAuditTime) {
        this.bossAuditTime = bossAuditTime;
    }

    /**
     * 获取银行分行
     *
     * @return band_name - 银行分行
     */
    public String getBandName() {
        return bandName;
    }

    /**
     * 设置银行分行
     *
     * @param bandName 银行分行
     */
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    /**
     * 获取提现用户名
     *
     * @return account_name - 提现用户名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置提现用户名
     *
     * @param accountName 提现用户名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取银行预留手机号码
     *
     * @return account_phone - 银行预留手机号码
     */
    public String getAccountPhone() {
        return accountPhone;
    }

    /**
     * 设置银行预留手机号码
     *
     * @param accountPhone 银行预留手机号码
     */
    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }
}