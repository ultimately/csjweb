package com.csj.csjweb.model.qclive;

import javax.persistence.*;

@Table(name = "csj_qc_live_products")
public class CSJ_QCLiveProducts {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 直播ID
     */
    @Column(name = "live_id")
    private Integer liveId;

    /**
     * 产品批次号
     */
    @Column(name = "erp_batch_no")
    private String erpBatchNo;

    /**
     * 产品类型(0:app商品,1:急购商品,2:app普通上传商品)
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * 直播开始时间
     */
    @Column(name = "start_time")
    private Long startTime;

    /**
     * 产品状态(0:待直播,1:直播中,2:已播完)
     */
    private Integer status;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取直播ID
     *
     * @return live_id - 直播ID
     */
    public Integer getLiveId() {
        return liveId;
    }

    /**
     * 设置直播ID
     *
     * @param liveId 直播ID
     */
    public void setLiveId(Integer liveId) {
        this.liveId = liveId;
    }

    /**
     * 获取产品批次号
     *
     * @return erp_batch_no - 产品批次号
     */
    public String getErpBatchNo() {
        return erpBatchNo;
    }

    /**
     * 设置产品批次号
     *
     * @param erpBatchNo 产品批次号
     */
    public void setErpBatchNo(String erpBatchNo) {
        this.erpBatchNo = erpBatchNo;
    }

    /**
     * 获取产品类型(0:app商品,1:急购商品,2:app普通上传商品)
     *
     * @return product_type - 产品类型(0:app商品,1:急购商品,2:app普通上传商品)
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置产品类型(0:app商品,1:急购商品,2:app普通上传商品)
     *
     * @param productType 产品类型(0:app商品,1:急购商品,2:app普通上传商品)
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取直播开始时间
     *
     * @return start_time - 直播开始时间
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 设置直播开始时间
     *
     * @param startTime 直播开始时间
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取产品状态(0:待直播,1:直播中,2:已播完)
     *
     * @return status - 产品状态(0:待直播,1:直播中,2:已播完)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置产品状态(0:待直播,1:直播中,2:已播完)
     *
     * @param status 产品状态(0:待直播,1:直播中,2:已播完)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}