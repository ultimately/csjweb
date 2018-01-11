package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live_report")
public class CSJ_QCLiveReport {
    @Id
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 直播ID
     */
    @Column(name = "live_id")
    private Integer liveId;

    /**
     * 主播ID
     */
    private Integer auid;

    /**
     * 内容
     */
    @Column(name = "report_content")
    private String reportContent;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取主播ID
     *
     * @return auid - 主播ID
     */
    public Integer getAuid() {
        return auid;
    }

    /**
     * 设置主播ID
     *
     * @param auid 主播ID
     */
    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    /**
     * 获取内容
     *
     * @return report_content - 内容
     */
    public String getReportContent() {
        return reportContent;
    }

    /**
     * 设置内容
     *
     * @param reportContent 内容
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
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
}