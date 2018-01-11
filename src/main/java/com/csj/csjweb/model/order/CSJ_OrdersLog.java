package com.csj.csjweb.model.order;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_orders_log")
public class CSJ_OrdersLog {
    @Id
    private Integer id;

    @Column(name = "log_type")
    private Integer logType;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "batch_number")
    private String batchNumber;

    @Column(name = "product_count")
    private Integer productCount;

    @Column(name = "product_sale_count")
    private Integer productSaleCount;

    private String content;

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
     * @return log_type
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     * @param logType
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * @return batch_number
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * @param batchNumber
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * @return product_count
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * @param productCount
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * @return product_sale_count
     */
    public Integer getProductSaleCount() {
        return productSaleCount;
    }

    /**
     * @param productSaleCount
     */
    public void setProductSaleCount(Integer productSaleCount) {
        this.productSaleCount = productSaleCount;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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