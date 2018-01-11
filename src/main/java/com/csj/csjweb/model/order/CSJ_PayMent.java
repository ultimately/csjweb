package com.csj.csjweb.model.order;

import java.math.BigDecimal;
import javax.persistence.*;

public class CSJ_PayMent {
    @Id
    private Integer id;

    private String title;

    @Column(name = "img_url")
    private String imgUrl;

    private String remark;

    private Integer type;

    @Column(name = "poundage_type")
    private Integer poundageType;

    @Column(name = "poundage_amount")
    private BigDecimal poundageAmount;

    private Integer sort;

    @Column(name = "is_lock")
    private Byte isLock;

    @Column(name = "api_path")
    private String apiPath;

    @Column(name = "is_default")
    private Byte isDefault;

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
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
     * @return poundage_type
     */
    public Integer getPoundageType() {
        return poundageType;
    }

    /**
     * @param poundageType
     */
    public void setPoundageType(Integer poundageType) {
        this.poundageType = poundageType;
    }

    /**
     * @return poundage_amount
     */
    public BigDecimal getPoundageAmount() {
        return poundageAmount;
    }

    /**
     * @param poundageAmount
     */
    public void setPoundageAmount(BigDecimal poundageAmount) {
        this.poundageAmount = poundageAmount;
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
     * @return api_path
     */
    public String getApiPath() {
        return apiPath;
    }

    /**
     * @param apiPath
     */
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    /**
     * @return is_default
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }
}