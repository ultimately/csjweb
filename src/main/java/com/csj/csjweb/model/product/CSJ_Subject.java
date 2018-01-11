package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Subject {
    @Id
    private Integer id;

    private String title;

    @Column(name = "sub_start_time")
    private Date subStartTime;

    @Column(name = "sub_end_time")
    private Date subEndTime;

    @Column(name = "sub_map")
    private Integer subMap;

    @Column(name = "img_logo")
    private String imgLogo;

    @Column(name = "img_logo_app")
    private String imgLogoApp;

    private Integer type;

    private String url;

    @Column(name = "is_lock")
    private Integer isLock;

    private Integer sort;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "user_id")
    private Integer userId;

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
     * @return sub_start_time
     */
    public Date getSubStartTime() {
        return subStartTime;
    }

    /**
     * @param subStartTime
     */
    public void setSubStartTime(Date subStartTime) {
        this.subStartTime = subStartTime;
    }

    /**
     * @return sub_end_time
     */
    public Date getSubEndTime() {
        return subEndTime;
    }

    /**
     * @param subEndTime
     */
    public void setSubEndTime(Date subEndTime) {
        this.subEndTime = subEndTime;
    }

    /**
     * @return sub_map
     */
    public Integer getSubMap() {
        return subMap;
    }

    /**
     * @param subMap
     */
    public void setSubMap(Integer subMap) {
        this.subMap = subMap;
    }

    /**
     * @return img_logo
     */
    public String getImgLogo() {
        return imgLogo;
    }

    /**
     * @param imgLogo
     */
    public void setImgLogo(String imgLogo) {
        this.imgLogo = imgLogo;
    }

    /**
     * @return img_logo_app
     */
    public String getImgLogoApp() {
        return imgLogoApp;
    }

    /**
     * @param imgLogoApp
     */
    public void setImgLogoApp(String imgLogoApp) {
        this.imgLogoApp = imgLogoApp;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return is_lock
     */
    public Integer getIsLock() {
        return isLock;
    }

    /**
     * @param isLock
     */
    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
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
}