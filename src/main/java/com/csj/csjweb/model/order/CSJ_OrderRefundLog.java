package com.csj.csjweb.model.order;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_order_refund_log")
public class CSJ_OrderRefundLog {
    @Id
    private Integer id;

    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "check_time")
    private Date checkTime;

    @Column(name = "check_status")
    private Integer checkStatus;

    @Column(name = "check_message")
    private String checkMessage;

    @Column(name = "refund_id")
    private Integer refundId;

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
     * @return manager_id
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * @param managerId
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * @return manager_name
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * @param managerName
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * @return check_time
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return check_status
     */
    public Integer getCheckStatus() {
        return checkStatus;
    }

    /**
     * @param checkStatus
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * @return check_message
     */
    public String getCheckMessage() {
        return checkMessage;
    }

    /**
     * @param checkMessage
     */
    public void setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage;
    }

    /**
     * @return refund_id
     */
    public Integer getRefundId() {
        return refundId;
    }

    /**
     * @param refundId
     */
    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }
}