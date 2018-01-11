package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_product_property")
public class CJS_ProductProperty {
    /**
     * 属性ID
     */
    @Id
    @Column(name = "property_id")
    private Integer propertyId;

    /**
     * 属性名称
     */
    @Column(name = "property_name")
    private String propertyName;

    /**
     * 上级ID
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 类别ID
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 根ID
     */
    @Column(name = "root_id")
    private Integer rootId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取属性ID
     *
     * @return property_id - 属性ID
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * 设置属性ID
     *
     * @param propertyId 属性ID
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * 获取属性名称
     *
     * @return property_name - 属性名称
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 设置属性名称
     *
     * @param propertyName 属性名称
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
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
     * 获取类别ID
     *
     * @return category_id - 类别ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置类别ID
     *
     * @param categoryId 类别ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取根ID
     *
     * @return root_id - 根ID
     */
    public Integer getRootId() {
        return rootId;
    }

    /**
     * 设置根ID
     *
     * @param rootId 根ID
     */
    public void setRootId(Integer rootId) {
        this.rootId = rootId;
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