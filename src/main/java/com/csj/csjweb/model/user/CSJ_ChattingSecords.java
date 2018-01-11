package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_chatting_secords")
public class CSJ_ChattingSecords {
    @Id
    private Integer id;

    /**
     * 买家ID
     */
    @Column(name = "from_account")
    private String fromAccount;

    /**
     * 文本信息
     */
    @Column(name = "tim_text_elem")
    private String timTextElem;

    /**
     * 表情信息
     */
    @Column(name = "tim_face_elem")
    private String timFaceElem;

    /**
     * 自定义信息
     */
    @Column(name = "tim_custom_elem")
    private String timCustomElem;

    /**
     * 语音信息
     */
    @Column(name = "tim_sound_elem")
    private String timSoundElem;

    /**
     * 图像信息
     */
    @Column(name = "time_image_elem")
    private String timeImageElem;

    /**
     * 卖家Id
     */
    @Column(name = "to_account")
    private String toAccount;

    /**
     * 时间
     */
    @Column(name = "msg_time")
    private Date msgTime;

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
     * 获取买家ID
     *
     * @return from_account - 买家ID
     */
    public String getFromAccount() {
        return fromAccount;
    }

    /**
     * 设置买家ID
     *
     * @param fromAccount 买家ID
     */
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    /**
     * 获取文本信息
     *
     * @return tim_text_elem - 文本信息
     */
    public String getTimTextElem() {
        return timTextElem;
    }

    /**
     * 设置文本信息
     *
     * @param timTextElem 文本信息
     */
    public void setTimTextElem(String timTextElem) {
        this.timTextElem = timTextElem;
    }

    /**
     * 获取表情信息
     *
     * @return tim_face_elem - 表情信息
     */
    public String getTimFaceElem() {
        return timFaceElem;
    }

    /**
     * 设置表情信息
     *
     * @param timFaceElem 表情信息
     */
    public void setTimFaceElem(String timFaceElem) {
        this.timFaceElem = timFaceElem;
    }

    /**
     * 获取自定义信息
     *
     * @return tim_custom_elem - 自定义信息
     */
    public String getTimCustomElem() {
        return timCustomElem;
    }

    /**
     * 设置自定义信息
     *
     * @param timCustomElem 自定义信息
     */
    public void setTimCustomElem(String timCustomElem) {
        this.timCustomElem = timCustomElem;
    }

    /**
     * 获取语音信息
     *
     * @return tim_sound_elem - 语音信息
     */
    public String getTimSoundElem() {
        return timSoundElem;
    }

    /**
     * 设置语音信息
     *
     * @param timSoundElem 语音信息
     */
    public void setTimSoundElem(String timSoundElem) {
        this.timSoundElem = timSoundElem;
    }

    /**
     * 获取图像信息
     *
     * @return time_image_elem - 图像信息
     */
    public String getTimeImageElem() {
        return timeImageElem;
    }

    /**
     * 设置图像信息
     *
     * @param timeImageElem 图像信息
     */
    public void setTimeImageElem(String timeImageElem) {
        this.timeImageElem = timeImageElem;
    }

    /**
     * 获取卖家Id
     *
     * @return to_account - 卖家Id
     */
    public String getToAccount() {
        return toAccount;
    }

    /**
     * 设置卖家Id
     *
     * @param toAccount 卖家Id
     */
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    /**
     * 获取时间
     *
     * @return msg_time - 时间
     */
    public Date getMsgTime() {
        return msgTime;
    }

    /**
     * 设置时间
     *
     * @param msgTime 时间
     */
    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }
}