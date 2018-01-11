package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_distribution")
public class CSJ_ProductDistribution {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private Integer status;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "batch_no")
    private String batchNo;

    @Column(name = "last_update_price_time")
    private Date lastUpdatePriceTime;

    @Column(name = "pro_dis_status")
    private Integer proDisStatus;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "shop_price")
    private BigDecimal shopPrice;

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
     * @return batch_no
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * @return last_update_price_time
     */
    public Date getLastUpdatePriceTime() {
        return lastUpdatePriceTime;
    }

    /**
     * @param lastUpdatePriceTime
     */
    public void setLastUpdatePriceTime(Date lastUpdatePriceTime) {
        this.lastUpdatePriceTime = lastUpdatePriceTime;
    }

    /**
     * @return pro_dis_status
     */
    public Integer getProDisStatus() {
        return proDisStatus;
    }

    /**
     * @param proDisStatus
     */
    public void setProDisStatus(Integer proDisStatus) {
        this.proDisStatus = proDisStatus;
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
     * @return shop_price
     */
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    /**
     * @param shopPrice
     */
    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }
}