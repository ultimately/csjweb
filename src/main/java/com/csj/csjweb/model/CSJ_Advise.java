package com.csj.csjweb.model;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Advise {
    @Id
    private Integer id;

    /**
     * 建议类型
     */
    @Column(name = "advise_type")
    private String adviseType;

    /**
     * 建议内容
     */
    private String content;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否查看
     */
    @Column(name = "is_see")
    private Byte isSee;

    /**
     * 联系电话
     */
    private String mobile;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "manage_id")
    private Integer manageId;

    @Column(name = "manage_name")
    private String manageName;

    @Column(name = "reply_content")
    private String replyContent;

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
     * 获取建议类型
     *
     * @return advise_type - 建议类型
     */
    public String getAdviseType() {
        return adviseType;
    }

    /**
     * 设置建议类型
     *
     * @param adviseType 建议类型
     */
    public void setAdviseType(String adviseType) {
        this.adviseType = adviseType;
    }

    /**
     * 获取建议内容
     *
     * @return content - 建议内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置建议内容
     *
     * @param content 建议内容
     */
    public void setContent(String content) {
        this.content = content;
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
     * 获取是否查看
     *
     * @return is_see - 是否查看
     */
    public Byte getIsSee() {
        return isSee;
    }

    /**
     * 设置是否查看
     *
     * @param isSee 是否查看
     */
    public void setIsSee(Byte isSee) {
        this.isSee = isSee;
    }

    /**
     * 获取联系电话
     *
     * @return mobile - 联系电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系电话
     *
     * @param mobile 联系电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * @return manage_id
     */
    public Integer getManageId() {
        return manageId;
    }

    /**
     * @param manageId
     */
    public void setManageId(Integer manageId) {
        this.manageId = manageId;
    }

    /**
     * @return manage_name
     */
    public String getManageName() {
        return manageName;
    }

    /**
     * @param manageName
     */
    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    /**
     * @return reply_content
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * @param replyContent
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
}