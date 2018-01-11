package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_user_cart_detail")
public class CSJ_UserCartDetail {
    @Id
    private Integer id;

    @Column(name = "product_price")
    private BigDecimal productPrice;

    @Column(name = "product_number")
    private Integer productNumber;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    private String remark;

    @Column(name = "cart_id")
    private Integer cartId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "batch_number")
    private String batchNumber;

    @Column(name = "certificate_authority")
    private String certificateAuthority;

    @Column(name = "certificate_amount")
    private BigDecimal certificateAmount;

    @Column(name = "certificate_id")
    private Integer certificateId;

    @Column(name = "certificate_num")
    private String certificateNum;

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
     * @return product_number
     */
    public Integer getProductNumber() {
        return productNumber;
    }

    /**
     * @param productNumber
     */
    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return cart_id
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * @param cartId
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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
}