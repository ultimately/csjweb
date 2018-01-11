package com.csj.csjweb.model.qclive;

import javax.persistence.*;

@Table(name = "csj_qc_live_vod")
public class CSJ_QCLiveVOD {
    /**
     * 订单标识
     */
    @Id
    private Integer id;

    /**
     * 直播房间ID
     */
    @Column(name = "stream_id")
    private String streamId;

    /**
     * 点播用video，在点播平台可以唯一定位一个点播视频文件
     */
    @Column(name = "video_id")
    private String videoId;

    /**
     * 点播视频的下载地址
     */
    @Column(name = "video_url")
    private String videoUrl;

    /**
     * 文件大小
     */
    @Column(name = "file_size")
    private String fileSize;

    /**
     * 分片开始时间戳
     */
    @Column(name = "start_time")
    private Integer startTime;

    /**
     * 分片结束时间戳
     */
    @Column(name = "end_time")
    private Integer endTime;

    /**
     * 文件ID
     */
    @Column(name = "file_id")
    private String fileId;

    /**
     * 文件格式
     */
    @Column(name = "file_format")
    private String fileFormat;

    /**
     * 是否开启点播2.0(0表示未开启，1表示开启)
     */
    @Column(name = "vod2_flag")
    private Integer vod2Flag;

    /**
     * 录制文件id
     */
    @Column(name = "record_file_id")
    private String recordFileId;

    /**
     * 推流时长
     */
    private Integer duration;

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
     * @return stream_id - 直播房间ID
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * 设置直播房间ID
     *
     * @param streamId 直播房间ID
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * 获取点播用video，在点播平台可以唯一定位一个点播视频文件
     *
     * @return video_id - 点播用video，在点播平台可以唯一定位一个点播视频文件
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * 设置点播用video，在点播平台可以唯一定位一个点播视频文件
     *
     * @param videoId 点播用video，在点播平台可以唯一定位一个点播视频文件
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    /**
     * 获取点播视频的下载地址
     *
     * @return video_url - 点播视频的下载地址
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置点播视频的下载地址
     *
     * @param videoUrl 点播视频的下载地址
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取文件大小
     *
     * @return file_size - 文件大小
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * 设置文件大小
     *
     * @param fileSize 文件大小
     */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 获取分片开始时间戳
     *
     * @return start_time - 分片开始时间戳
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * 设置分片开始时间戳
     *
     * @param startTime 分片开始时间戳
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取分片结束时间戳
     *
     * @return end_time - 分片结束时间戳
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * 设置分片结束时间戳
     *
     * @param endTime 分片结束时间戳
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取文件ID
     *
     * @return file_id - 文件ID
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 设置文件ID
     *
     * @param fileId 文件ID
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取文件格式
     *
     * @return file_format - 文件格式
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * 设置文件格式
     *
     * @param fileFormat 文件格式
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * 获取是否开启点播2.0(0表示未开启，1表示开启)
     *
     * @return vod2_flag - 是否开启点播2.0(0表示未开启，1表示开启)
     */
    public Integer getVod2Flag() {
        return vod2Flag;
    }

    /**
     * 设置是否开启点播2.0(0表示未开启，1表示开启)
     *
     * @param vod2Flag 是否开启点播2.0(0表示未开启，1表示开启)
     */
    public void setVod2Flag(Integer vod2Flag) {
        this.vod2Flag = vod2Flag;
    }

    /**
     * 获取录制文件id
     *
     * @return record_file_id - 录制文件id
     */
    public String getRecordFileId() {
        return recordFileId;
    }

    /**
     * 设置录制文件id
     *
     * @param recordFileId 录制文件id
     */
    public void setRecordFileId(String recordFileId) {
        this.recordFileId = recordFileId;
    }

    /**
     * 获取推流时长
     *
     * @return duration - 推流时长
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置推流时长
     *
     * @param duration 推流时长
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}