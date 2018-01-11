package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_category")
public class CSJ_ProductCategory {
    /**
     * 商品类别ID
     */
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 商品类别名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 上级ID
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取商品类别ID
     *
     * @return category_id - 商品类别ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置商品类别ID
     *
     * @param categoryId 商品类别ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取商品类别名称
     *
     * @return category_name - 商品类别名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置商品类别名称
     *
     * @param categoryName 商品类别名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取上级ID
     *
     * @return parent_id - 上级ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级ID
     *
     * @param parentId 上级ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}