package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_plant")
public class CSJ_ProductPlant {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String mobile;

    private String content;

    @Column(name = "time_requirement")
    private Date timeRequirement;

    private String material;

    private String specifications;

    private String theme;

    private String grade;

    private Integer number;

    private Integer uid;

    @Column(name = "pic_url")
    private String picUrl;

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

    @Column(name = "plant_type")
    private Integer plantType;

    @Column(name = "response_speed")
    private Integer responseSpeed;

    @Column(name = "match_demand")
    private Integer matchDemand;

    @Column(name = "service_attitude")
    private Integer serviceAttitude;

    private String theme1;

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
     * @return time_requirement
     */
    public Date getTimeRequirement() {
        return timeRequirement;
    }

    /**
     * @param timeRequirement
     */
    public void setTimeRequirement(Date timeRequirement) {
        this.timeRequirement = timeRequirement;
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
     * @return specifications
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * @param specifications
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    /**
     * @return theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
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

    /**
     * @return plant_type
     */
    public Integer getPlantType() {
        return plantType;
    }

    /**
     * @param plantType
     */
    public void setPlantType(Integer plantType) {
        this.plantType = plantType;
    }

    /**
     * @return response_speed
     */
    public Integer getResponseSpeed() {
        return responseSpeed;
    }

    /**
     * @param responseSpeed
     */
    public void setResponseSpeed(Integer responseSpeed) {
        this.responseSpeed = responseSpeed;
    }

    /**
     * @return match_demand
     */
    public Integer getMatchDemand() {
        return matchDemand;
    }

    /**
     * @param matchDemand
     */
    public void setMatchDemand(Integer matchDemand) {
        this.matchDemand = matchDemand;
    }

    /**
     * @return service_attitude
     */
    public Integer getServiceAttitude() {
        return serviceAttitude;
    }

    /**
     * @param serviceAttitude
     */
    public void setServiceAttitude(Integer serviceAttitude) {
        this.serviceAttitude = serviceAttitude;
    }

    /**
     * @return theme1
     */
    public String getTheme1() {
        return theme1;
    }

    /**
     * @param theme1
     */
    public void setTheme1(String theme1) {
        this.theme1 = theme1;
    }
}