package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Modules {
    @Id
    private Integer id;

    private String title;

    private String code;

    @Column(name = "create_time")
    private Date createTime;

    private String logo;

    private String href;

    @Column(name = "is_active")
    private Byte isActive;

    @Column(name = "parent_id")
    private Integer parentId;

    private Integer sort;

    private Integer layer;

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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return is_active
     */
    public Byte getIsActive() {
        return isActive;
    }

    /**
     * @param isActive
     */
    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
     * @return layer
     */
    public Integer getLayer() {
        return layer;
    }

    /**
     * @param layer
     */
    public void setLayer(Integer layer) {
        this.layer = layer;
    }
}