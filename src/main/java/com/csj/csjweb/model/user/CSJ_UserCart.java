package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_user_cart")
public class CSJ_UserCart {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TotalPrice")
    private BigDecimal totalprice;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "Discount")
    private BigDecimal discount;

    @Column(name = "OrderTime")
    private Date ordertime;

    @Column(name = "State")
    private Integer state;

    @Column(name = "UserId")
    private Integer userid;

    @Column(name = "CertificateAmount")
    private BigDecimal certificateamount;

    /**
     * @return ID
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
     * @return TotalPrice
     */
    public BigDecimal getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice
     */
    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return CreateTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return Discount
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
     * @return OrderTime
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * @param ordertime
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * @return State
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return UserId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return CertificateAmount
     */
    public BigDecimal getCertificateamount() {
        return certificateamount;
    }

    /**
     * @param certificateamount
     */
    public void setCertificateamount(BigDecimal certificateamount) {
        this.certificateamount = certificateamount;
    }
}