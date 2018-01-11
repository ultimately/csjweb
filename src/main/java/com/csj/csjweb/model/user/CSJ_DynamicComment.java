package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_dynamic_comment")
public class CSJ_DynamicComment {
    @Id
    private Integer id;

    /**
     * 发现ID
     */
    private Integer did;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 评论
     */
    private String comment;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 图像
     */
    private String logo;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 目标用户ID
     */
    @Column(name = "target_user_id")
    private Integer targetUserId;

    /**
     * 昵称
     */
    @Column(name = "target_nick_name")
    private String targetNickName;

    /**
     * 图像
     */
    @Column(name = "target_logo")
    private String targetLogo;

    /**
     * parentId
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 状态： 0显示 1：不显示
     */
    private Integer state;

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
     * 获取发现ID
     *
     * @return did - 发现ID
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置发现ID
     *
     * @param did 发现ID
     */
    public void setDid(Integer did) {
        this.did = did;
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
     * 获取评论
     *
     * @return comment - 评论
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置评论
     *
     * @param comment 评论
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取图像
     *
     * @return logo - 图像
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图像
     *
     * @param logo 图像
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取目标用户ID
     *
     * @return target_user_id - 目标用户ID
     */
    public Integer getTargetUserId() {
        return targetUserId;
    }

    /**
     * 设置目标用户ID
     *
     * @param targetUserId 目标用户ID
     */
    public void setTargetUserId(Integer targetUserId) {
        this.targetUserId = targetUserId;
    }

    /**
     * 获取昵称
     *
     * @return target_nick_name - 昵称
     */
    public String getTargetNickName() {
        return targetNickName;
    }

    /**
     * 设置昵称
     *
     * @param targetNickName 昵称
     */
    public void setTargetNickName(String targetNickName) {
        this.targetNickName = targetNickName;
    }

    /**
     * 获取图像
     *
     * @return target_logo - 图像
     */
    public String getTargetLogo() {
        return targetLogo;
    }

    /**
     * 设置图像
     *
     * @param targetLogo 图像
     */
    public void setTargetLogo(String targetLogo) {
        this.targetLogo = targetLogo;
    }

    /**
     * 获取parentId
     *
     * @return parent_id - parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置parentId
     *
     * @param parentId parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取状态： 0显示 1：不显示
     *
     * @return state - 状态： 0显示 1：不显示
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态： 0显示 1：不显示
     *
     * @param state 状态： 0显示 1：不显示
     */
    public void setState(Integer state) {
        this.state = state;
    }
}