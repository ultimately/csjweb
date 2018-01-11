package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_products_app_log")
public class CSJ_ProductAppLog {
    @Id
    private Integer id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "product_msg")
    private String productMsg;

    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "manager_name")
    private String managerName;

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
     * @return product_status
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * @param productStatus
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * @return product_msg
     */
    public String getProductMsg() {
        return productMsg;
    }

    /**
     * @param productMsg
     */
    public void setProductMsg(String productMsg) {
        this.productMsg = productMsg;
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
}