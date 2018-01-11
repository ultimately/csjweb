package com.csj.csjweb.model.user;

import javax.persistence.*;

public class CSJ_Areas {
    @Id
    private Integer id;

    /**
     * 主播ID/关注人ID
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 手机号码
     */
    @Column(name = "area_code")
    private String areaCode;

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
     * 获取主播ID/关注人ID
     *
     * @return area_name - 主播ID/关注人ID
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置主播ID/关注人ID
     *
     * @param areaName 主播ID/关注人ID
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取手机号码
     *
     * @return area_code - 手机号码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置手机号码
     *
     * @param areaCode 手机号码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}