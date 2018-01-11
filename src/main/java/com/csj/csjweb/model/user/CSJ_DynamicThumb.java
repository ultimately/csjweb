package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_dynamic_thumb")
public class CSJ_DynamicThumb {
    @Id
    private Integer id;

    /**
     * 动态ID
     */
    private Integer did;

    /**
     * 大图
     */
    private String path;

    /**
     * 缩略图
     */
    @Column(name = "thumb_path")
    private String thumbPath;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 类型0：图片；1：视频
     */
    @Column(name = "pic_type")
    private Integer picType;

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
     * 获取动态ID
     *
     * @return did - 动态ID
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置动态ID
     *
     * @param did 动态ID
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取大图
     *
     * @return path - 大图
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置大图
     *
     * @param path 大图
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取缩略图
     *
     * @return thumb_path - 缩略图
     */
    public String getThumbPath() {
        return thumbPath;
    }

    /**
     * 设置缩略图
     *
     * @param thumbPath 缩略图
     */
    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取类型0：图片；1：视频
     *
     * @return pic_type - 类型0：图片；1：视频
     */
    public Integer getPicType() {
        return picType;
    }

    /**
     * 设置类型0：图片；1：视频
     *
     * @param picType 类型0：图片；1：视频
     */
    public void setPicType(Integer picType) {
        this.picType = picType;
    }
}