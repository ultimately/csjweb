package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_repair")
public class CSJ_ProductRepair {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String mobile;

    private String content;

    private Integer uid;

    @Column(name = "pic_url")
    private String picUrl;

    private String material;

    private Integer number;

    @Column(name = "create_time")
    private Date createTime;

    private Integer state;

    @Column(name = "handle_admin_id")
    private Integer handleAdminId;

    @Column(name = "handle_time")
    private Date handleTime;

    private BigDecimal offer;

    @Column(name = "cs_tracking")
    private String csTracking;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return pic_url
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * @param picUrl
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
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
     * @return state
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
     * @return handle_admin_id
     */
    public Integer getHandleAdminId() {
        return handleAdminId;
    }

    /**
     * @param handleAdminId
     */
    public void setHandleAdminId(Integer handleAdminId) {
        this.handleAdminId = handleAdminId;
    }

    /**
     * @return handle_time
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * @param handleTime
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * @return offer
     */
    public BigDecimal getOffer() {
        return offer;
    }

    /**
     * @param offer
     */
    public void setOffer(BigDecimal offer) {
        this.offer = offer;
    }

    /**
     * @return cs_tracking
     */
    public String getCsTracking() {
        return csTracking;
    }

    /**
     * @param csTracking
     */
    public void setCsTracking(String csTracking) {
        this.csTracking = csTracking;
    }
}