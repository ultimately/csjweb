package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live_anchor")
public class CSJ_QCLiveAnchor {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String nickname;

    @Column(name = "head_pic")
    private String headPic;

    @Column(name = "front_cover")
    private String frontCover;

    @Column(name = "live_intro")
    private String liveIntro;

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
}