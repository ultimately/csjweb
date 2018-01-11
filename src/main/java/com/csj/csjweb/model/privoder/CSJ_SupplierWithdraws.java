package com.csj.csjweb.model.privoder;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_supplier_withdraws")
public class CSJ_SupplierWithdraws {
    @Id
    private Integer id;

    @Column(name = "u_id")
    private Integer uId;

    @Column(name = "withdrawas_amount")
    private BigDecimal withdrawasAmount;

    @Column(name = "withdraws_type")
    private String withdrawsType;

    @Column(name = "withdraws_account")
    private String withdrawsAccount;

    @Column(name = "add_time")
    private Date addTime;

    private Integer status;

    private String msg;

    @Column(name = "audit_finance")
    private String auditFinance;

    @Column(name = "finance_audit_time")
    private String financeAuditTime;

    @Column(name = "audit_boss")
    private String auditBoss;

    @Column(name = "boss_audit_time")
    private String bossAuditTime;

    @Column(name = "card_num")
    private String cardNum;

    @Column(name = "fk_supplier_cards_id")
    private Integer fkSupplierCardsId;

    @Column(name = "card_id")
    private Integer cardId;

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
     * @return u_id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * @return withdrawas_amount
     */
    public BigDecimal getWithdrawasAmount() {
        return withdrawasAmount;
    }

    /**
     * @param withdrawasAmount
     */
    public void setWithdrawasAmount(BigDecimal withdrawasAmount) {
        this.withdrawasAmount = withdrawasAmount;
    }

    /**
     * @return withdraws_type
     */
    public String getWithdrawsType() {
        return withdrawsType;
    }

    /**
     * @param withdrawsType
     */
    public void setWithdrawsType(String withdrawsType) {
        this.withdrawsType = withdrawsType;
    }

    /**
     * @return withdraws_account
     */
    public String getWithdrawsAccount() {
        return withdrawsAccount;
    }

    /**
     * @param withdrawsAccount
     */
    public void setWithdrawsAccount(String withdrawsAccount) {
        this.withdrawsAccount = withdrawsAccount;
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
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return audit_finance
     */
    public String getAuditFinance() {
        return auditFinance;
    }

    /**
     * @param auditFinance
     */
    public void setAuditFinance(String auditFinance) {
        this.auditFinance = auditFinance;
    }

    /**
     * @return finance_audit_time
     */
    public String getFinanceAuditTime() {
        return financeAuditTime;
    }

    /**
     * @param financeAuditTime
     */
    public void setFinanceAuditTime(String financeAuditTime) {
        this.financeAuditTime = financeAuditTime;
    }

    /**
     * @return audit_boss
     */
    public String getAuditBoss() {
        return auditBoss;
    }

    /**
     * @param auditBoss
     */
    public void setAuditBoss(String auditBoss) {
        this.auditBoss = auditBoss;
    }

    /**
     * @return boss_audit_time
     */
    public String getBossAuditTime() {
        return bossAuditTime;
    }

    /**
     * @param bossAuditTime
     */
    public void setBossAuditTime(String bossAuditTime) {
        this.bossAuditTime = bossAuditTime;
    }

    /**
     * @return card_num
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * @param cardNum
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    /**
     * @return fk_supplier_cards_id
     */
    public Integer getFkSupplierCardsId() {
        return fkSupplierCardsId;
    }

    /**
     * @param fkSupplierCardsId
     */
    public void setFkSupplierCardsId(Integer fkSupplierCardsId) {
        this.fkSupplierCardsId = fkSupplierCardsId;
    }

    /**
     * @return card_id
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }
}