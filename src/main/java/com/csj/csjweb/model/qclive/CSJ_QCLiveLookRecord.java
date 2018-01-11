package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live_look_record")
public class CSJ_QCLiveLookRecord {
    @Id
    private Integer id;

    @Column(name = "live_id")
    private Integer liveId;

    private Integer fuid;

    @Column(name = "enter_time")
    private Date enterTime;

    @Column(name = "quit_time")
    private Date quitTime;

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
     * @return live_id
     */
    public Integer getLiveId() {
        return liveId;
    }

    /**
     * @param liveId
     */
    public void setLiveId(Integer liveId) {
        this.liveId = liveId;
    }

    /**
     * @return fuid
     */
    public Integer getFuid() {
        return fuid;
    }

    /**
     * @param fuid
     */
    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }

    /**
     * @return enter_time
     */
    public Date getEnterTime() {
        return enterTime;
    }

    /**
     * @param enterTime
     */
    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    /**
     * @return quit_time
     */
    public Date getQuitTime() {
        return quitTime;
    }

    /**
     * @param quitTime
     */
    public void setQuitTime(Date quitTime) {
        this.quitTime = quitTime;
    }
}