package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_p_orders")
public class CSJ_Porders {
    @Id
    private Integer id;

    @Column(name = "p_order_no")
    private String pOrderNo;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "create_time")
    private Date createTime;

    private Integer status;

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
     * @return p_order_no
     */
    public String getpOrderNo() {
        return pOrderNo;
    }

    /**
     * @param pOrderNo
     */
    public void setpOrderNo(String pOrderNo) {
        this.pOrderNo = pOrderNo;
    }

    /**
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}