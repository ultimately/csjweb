package com.csj.csjweb.model;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Ads {
    @Id
    private Integer id;

    private String title;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "is_lock")
    private Byte isLock;

    /**
     * 外部网页地址
     */
    private String url;

    /**
     * 广告类型1外部网页,2：内置页面一,3：内置页面二
     */
    private Integer type;

    /**
     * 主图
     */
    @Column(name = "img_logo")
    private String imgLogo;

    /**
     * 广告位1:首页广告图，2首页公告；3,App首页推荐横图
     */
    @Column(name = "ads_map")
    private Integer adsMap;

    private Integer sort;

    @Column(name = "ad_start_time")
    private Date adStartTime;

    @Column(name = "ad_end_time")
    private Date adEndTime;

    /**
     * App广告主图
     */
    @Column(name = "img_logo_app")
    private String imgLogoApp;

    /**
     * 0:琥珀 1:和田玉 2:翡翠 3：绿松石
     */
    @Column(name = "ads_type")
    private Integer adsType;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * @return is_lock
     */
    public Byte getIsLock() {
        return isLock;
    }

    /**
     * @param isLock
     */
    public void setIsLock(Byte isLock) {
        this.isLock = isLock;
    }

    /**
     * 获取外部网页地址
     *
     * @return url - 外部网页地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置外部网页地址
     *
     * @param url 外部网页地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取广告类型1外部网页,2：内置页面一,3：内置页面二
     *
     * @return type - 广告类型1外部网页,2：内置页面一,3：内置页面二
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置广告类型1外部网页,2：内置页面一,3：内置页面二
     *
     * @param type 广告类型1外部网页,2：内置页面一,3：内置页面二
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取主图
     *
     * @return img_logo - 主图
     */
    public String getImgLogo() {
        return imgLogo;
    }

    /**
     * 设置主图
     *
     * @param imgLogo 主图
     */
    public void setImgLogo(String imgLogo) {
        this.imgLogo = imgLogo;
    }

    /**
     * 获取广告位1:首页广告图，2首页公告；3,App首页推荐横图
     *
     * @return ads_map - 广告位1:首页广告图，2首页公告；3,App首页推荐横图
     */
    public Integer getAdsMap() {
        return adsMap;
    }

    /**
     * 设置广告位1:首页广告图，2首页公告；3,App首页推荐横图
     *
     * @param adsMap 广告位1:首页广告图，2首页公告；3,App首页推荐横图
     */
    public void setAdsMap(Integer adsMap) {
        this.adsMap = adsMap;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return ad_start_time
     */
    public Date getAdStartTime() {
        return adStartTime;
    }

    /**
     * @param adStartTime
     */
    public void setAdStartTime(Date adStartTime) {
        this.adStartTime = adStartTime;
    }

    /**
     * @return ad_end_time
     */
    public Date getAdEndTime() {
        return adEndTime;
    }

    /**
     * @param adEndTime
     */
    public void setAdEndTime(Date adEndTime) {
        this.adEndTime = adEndTime;
    }

    /**
     * 获取App广告主图
     *
     * @return img_logo_app - App广告主图
     */
    public String getImgLogoApp() {
        return imgLogoApp;
    }

    /**
     * 设置App广告主图
     *
     * @param imgLogoApp App广告主图
     */
    public void setImgLogoApp(String imgLogoApp) {
        this.imgLogoApp = imgLogoApp;
    }

    /**
     * 获取0:琥珀 1:和田玉 2:翡翠 3：绿松石
     *
     * @return ads_type - 0:琥珀 1:和田玉 2:翡翠 3：绿松石
     */
    public Integer getAdsType() {
        return adsType;
    }

    /**
     * 设置0:琥珀 1:和田玉 2:翡翠 3：绿松石
     *
     * @param adsType 0:琥珀 1:和田玉 2:翡翠 3：绿松石
     */
    public void setAdsType(Integer adsType) {
        this.adsType = adsType;
    }
}