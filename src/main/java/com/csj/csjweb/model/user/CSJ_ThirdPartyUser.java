package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_thirdparty_user")
public class CSJ_ThirdPartyUser {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "open_id")
    private String openId;

    private String type;

    @Column(name = "create_time")
    private Date createTime;

    private String city;

    private String country;

    @Column(name = "is_yellow_year_vip")
    private String isYellowYearVip;

    @Column(name = "yellow_vip_level")
    private String yellowVipLevel;

    private String unionid;

    private String level;

    private String vip;

    private String ret;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "user_head_img")
    private String userHeadImg;

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
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return is_yellow_year_vip
     */
    public String getIsYellowYearVip() {
        return isYellowYearVip;
    }

    /**
     * @param isYellowYearVip
     */
    public void setIsYellowYearVip(String isYellowYearVip) {
        this.isYellowYearVip = isYellowYearVip;
    }

    /**
     * @return yellow_vip_level
     */
    public String getYellowVipLevel() {
        return yellowVipLevel;
    }

    /**
     * @param yellowVipLevel
     */
    public void setYellowVipLevel(String yellowVipLevel) {
        this.yellowVipLevel = yellowVipLevel;
    }

    /**
     * @return unionid
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * @param unionid
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return vip
     */
    public String getVip() {
        return vip;
    }

    /**
     * @param vip
     */
    public void setVip(String vip) {
        this.vip = vip;
    }

    /**
     * @return ret
     */
    public String getRet() {
        return ret;
    }

    /**
     * @param ret
     */
    public void setRet(String ret) {
        this.ret = ret;
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return user_head_img
     */
    public String getUserHeadImg() {
        return userHeadImg;
    }

    /**
     * @param userHeadImg
     */
    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }
}