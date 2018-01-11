package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Dynamic {
    @Id
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 浏览数量
     */
    @Column(name = "view_count")
    private Integer viewCount;

    /**
     * 点赞数量
     */
    @Column(name = "like_count")
    private Integer likeCount;

    private Integer isdelete;

    /**
     * 内容
     */
    @Column(name = "dynamic_content")
    private String dynamicContent;

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
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
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
     * 获取浏览数量
     *
     * @return view_count - 浏览数量
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * 设置浏览数量
     *
     * @param viewCount 浏览数量
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * 获取点赞数量
     *
     * @return like_count - 点赞数量
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * 设置点赞数量
     *
     * @param likeCount 点赞数量
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * @return isdelete
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取内容
     *
     * @return dynamic_content - 内容
     */
    public String getDynamicContent() {
        return dynamicContent;
    }

    /**
     * 设置内容
     *
     * @param dynamicContent 内容
     */
    public void setDynamicContent(String dynamicContent) {
        this.dynamicContent = dynamicContent;
    }
}