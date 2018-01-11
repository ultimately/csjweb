package com.csj.csjweb.model.product;

import javax.persistence.*;

@Table(name = "csj_products_agency")
public class CSJ_ProductSagency {
    @Id
    private Integer id;

    @Column(name = "plant_id")
    private Integer plantId;

    @Column(name = "product_id")
    private Integer productId;

    /**
     * 上传急购商品用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

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
     * @return plant_id
     */
    public Integer getPlantId() {
        return plantId;
    }

    /**
     * @param plantId
     */
    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
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
     * 获取上传急购商品用户ID
     *
     * @return user_id - 上传急购商品用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置上传急购商品用户ID
     *
     * @param userId 上传急购商品用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}