package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_news")
public class CSJ_ProductNews {
    @Id
    @Column(name = "product_id")
    private Integer productId;

    private Integer status;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "batch_no")
    private String batchNo;

    /**
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
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

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return batch_no
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
}