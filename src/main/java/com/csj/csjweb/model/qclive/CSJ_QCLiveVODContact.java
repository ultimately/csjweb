package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live_vod_contact")
public class CSJ_QCLiveVODContact {
    /**
     * 订单标识
     */
    @Id
    private Integer id;

    /**
     * 直播房间ID
     */
    @Column(name = "live_id")
    private Integer liveId;

    /**
     * 拼接文件任务id
     */
    @Column(name = "vod_task_id")
    private String vodTaskId;

    /**
     * 文件类型(0:mp4,1:m3u8)
     */
    @Column(name = "file_type")
    private Integer fileType;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 回调事件消息
     */
    private String message;

    /**
     * 拼接后文件名
     */
    @Column(name = "file_id")
    private String fileId;

    /**
     * 拼接后视频地址
     */
    @Column(name = "file_url")
    private String fileUrl;

    /**
     * 拼接文件参数
     */
    @Column(name = "contact_file_ids")
    private String contactFileIds;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "call_back_time")
    private Date callBackTime;

    /**
     * 获取订单标识
     *
     * @return id - 订单标识
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单标识
     *
     * @param id 订单标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取直播房间ID
     *
     * @return live_id - 直播房间ID
     */
    public Integer getLiveId() {
        return liveId;
    }

    /**
     * 设置直播房间ID
     *
     * @param liveId 直播房间ID
     */
    public void setLiveId(Integer liveId) {
        this.liveId = liveId;
    }

    /**
     * 获取拼接文件任务id
     *
     * @return vod_task_id - 拼接文件任务id
     */
    public String getVodTaskId() {
        return vodTaskId;
    }

    /**
     * 设置拼接文件任务id
     *
     * @param vodTaskId 拼接文件任务id
     */
    public void setVodTaskId(String vodTaskId) {
        this.vodTaskId = vodTaskId;
    }

    /**
     * 获取文件类型(0:mp4,1:m3u8)
     *
     * @return file_type - 文件类型(0:mp4,1:m3u8)
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * 设置文件类型(0:mp4,1:m3u8)
     *
     * @param fileType 文件类型(0:mp4,1:m3u8)
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取回调事件消息
     *
     * @return message - 回调事件消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置回调事件消息
     *
     * @param message 回调事件消息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取拼接后文件名
     *
     * @return file_id - 拼接后文件名
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 设置拼接后文件名
     *
     * @param fileId 拼接后文件名
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取拼接后视频地址
     *
     * @return file_url - 拼接后视频地址
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 设置拼接后视频地址
     *
     * @param fileUrl 拼接后视频地址
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * 获取拼接文件参数
     *
     * @return contact_file_ids - 拼接文件参数
     */
    public String getContactFileIds() {
        return contactFileIds;
    }

    /**
     * 设置拼接文件参数
     *
     * @param contactFileIds 拼接文件参数
     */
    public void setContactFileIds(String contactFileIds) {
        this.contactFileIds = contactFileIds;
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
     * @return call_back_time
     */
    public Date getCallBackTime() {
        return callBackTime;
    }

    /**
     * @param callBackTime
     */
    public void setCallBackTime(Date callBackTime) {
        this.callBackTime = callBackTime;
    }
}