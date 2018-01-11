package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live")
public class CSJ_QClive {
    @Id
    private Integer id;

    @Column(name = "stream_id")
    private String streamId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "group_id")
    private String groupId;

    private String title;

    @Column(name = "live_type")
    private Integer liveType;

    private Integer flag;

    @Column(name = "live_status")
    private Integer liveStatus;

    private String nickname;

    @Column(name = "head_pic")
    private String headPic;

    @Column(name = "front_cover")
    private String frontCover;

    @Column(name = "live_intro")
    private String liveIntro;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "live_time")
    private Date liveTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "pro_time")
    private Date proTime;

    @Column(name = "push_url")
    private String pushUrl;

    @Column(name = "push_expire")
    private Integer pushExpire;

    @Column(name = "play_url")
    private String playUrl;

    @Column(name = "file_id")
    private String fileId;

    @Column(name = "viewer_count")
    private Integer viewerCount;

    @Column(name = "like_count")
    private Integer likeCount;

    /**
     * 断流时间
     */
    @Column(name = "cut_flow_time")
    private Integer cutFlowTime;

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
     * @return stream_id
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * @param streamId
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
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
     * @return group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
     * @return live_type
     */
    public Integer getLiveType() {
        return liveType;
    }

    /**
     * @param liveType
     */
    public void setLiveType(Integer liveType) {
        this.liveType = liveType;
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * @return live_status
     */
    public Integer getLiveStatus() {
        return liveStatus;
    }

    /**
     * @param liveStatus
     */
    public void setLiveStatus(Integer liveStatus) {
        this.liveStatus = liveStatus;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return head_pic
     */
    public String getHeadPic() {
        return headPic;
    }

    /**
     * @param headPic
     */
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    /**
     * @return front_cover
     */
    public String getFrontCover() {
        return frontCover;
    }

    /**
     * @param frontCover
     */
    public void setFrontCover(String frontCover) {
        this.frontCover = frontCover;
    }

    /**
     * @return live_intro
     */
    public String getLiveIntro() {
        return liveIntro;
    }

    /**
     * @param liveIntro
     */
    public void setLiveIntro(String liveIntro) {
        this.liveIntro = liveIntro;
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
     * @return live_time
     */
    public Date getLiveTime() {
        return liveTime;
    }

    /**
     * @param liveTime
     */
    public void setLiveTime(Date liveTime) {
        this.liveTime = liveTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return pro_time
     */
    public Date getProTime() {
        return proTime;
    }

    /**
     * @param proTime
     */
    public void setProTime(Date proTime) {
        this.proTime = proTime;
    }

    /**
     * @return push_url
     */
    public String getPushUrl() {
        return pushUrl;
    }

    /**
     * @param pushUrl
     */
    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    /**
     * @return push_expire
     */
    public Integer getPushExpire() {
        return pushExpire;
    }

    /**
     * @param pushExpire
     */
    public void setPushExpire(Integer pushExpire) {
        this.pushExpire = pushExpire;
    }

    /**
     * @return play_url
     */
    public String getPlayUrl() {
        return playUrl;
    }

    /**
     * @param playUrl
     */
    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    /**
     * @return file_id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return viewer_count
     */
    public Integer getViewerCount() {
        return viewerCount;
    }

    /**
     * @param viewerCount
     */
    public void setViewerCount(Integer viewerCount) {
        this.viewerCount = viewerCount;
    }

    /**
     * @return like_count
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * @param likeCount
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 获取断流时间
     *
     * @return cut_flow_time - 断流时间
     */
    public Integer getCutFlowTime() {
        return cutFlowTime;
    }

    /**
     * 设置断流时间
     *
     * @param cutFlowTime 断流时间
     */
    public void setCutFlowTime(Integer cutFlowTime) {
        this.cutFlowTime = cutFlowTime;
    }
}