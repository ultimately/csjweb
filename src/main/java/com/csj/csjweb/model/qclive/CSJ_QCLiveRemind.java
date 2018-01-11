package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live_remind")
public class CSJ_QCLiveRemind {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 直播ID
     */
    @Column(name = "live_id")
    private Integer liveId;

    /**
     * 用户ID
     */
    private Integer fuid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 提醒时间
     */
    @Column(name = "remind_time")
    private Date remindTime;

    /**
     * 开播提醒(0:没有提醒 1:申请提醒 2:已提醒 3:取消提醒)
     */
    @Column(name = "remind_type")
    private Integer remindType;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取直播ID
     *
     * @return live_id - 直播ID
     */
    public Integer getLiveId() {
        return liveId;
    }

    /**
     * 设置直播ID
     *
     * @param liveId 直播ID
     */
    public void setLiveId(Integer liveId) {
        this.liveId = liveId;
    }

    /**
     * 获取用户ID
     *
     * @return fuid - 用户ID
     */
    public Integer getFuid() {
        return fuid;
    }

    /**
     * 设置用户ID
     *
     * @param fuid 用户ID
     */
    public void setFuid(Integer fuid) {
        this.fuid = fuid;
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
     * 获取提醒时间
     *
     * @return remind_time - 提醒时间
     */
    public Date getRemindTime() {
        return remindTime;
    }

    /**
     * 设置提醒时间
     *
     * @param remindTime 提醒时间
     */
    public void setRemindTime(Date remindTime) {
        this.remindTime = remindTime;
    }

    /**
     * 获取开播提醒(0:没有提醒 1:申请提醒 2:已提醒 3:取消提醒)
     *
     * @return remind_type - 开播提醒(0:没有提醒 1:申请提醒 2:已提醒 3:取消提醒)
     */
    public Integer getRemindType() {
        return remindType;
    }

    /**
     * 设置开播提醒(0:没有提醒 1:申请提醒 2:已提醒 3:取消提醒)
     *
     * @param remindType 开播提醒(0:没有提醒 1:申请提醒 2:已提醒 3:取消提醒)
     */
    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }
}