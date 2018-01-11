package com.csj.csjweb.model.qclive;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_qc_live_focus")
public class CSJ_QCLiveFocus {
    @Id
    private Integer id;

    @Column(name = "live_id")
    private Integer liveId;

    @Column(name = "fu_id")
    private Integer fuId;

    @Column(name = "au_id")
    private Integer auId;

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
     * @return fu_id
     */
    public Integer getFuId() {
        return fuId;
    }

    /**
     * @param fuId
     */
    public void setFuId(Integer fuId) {
        this.fuId = fuId;
    }

    /**
     * @return au_id
     */
    public Integer getAuId() {
        return auId;
    }

    /**
     * @param auId
     */
    public void setAuId(Integer auId) {
        this.auId = auId;
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