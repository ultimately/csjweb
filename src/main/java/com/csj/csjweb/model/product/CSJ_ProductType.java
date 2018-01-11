package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_products_type")
public class CSJ_ProductType {
    @Id
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "category_href")
    private String categoryHref;

    @Column(name = "category_logo")
    private String categoryLogo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "is_active")
    private Byte isActive;

    @Column(name = "is_control_menu")
    private Byte isControlMenu;

    @Column(name = "parent_id")
    private Integer parentId;

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
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return category_code
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * @return category_href
     */
    public String getCategoryHref() {
        return categoryHref;
    }

    /**
     * @param categoryHref
     */
    public void setCategoryHref(String categoryHref) {
        this.categoryHref = categoryHref;
    }

    /**
     * @return category_logo
     */
    public String getCategoryLogo() {
        return categoryLogo;
    }

    /**
     * @param categoryLogo
     */
    public void setCategoryLogo(String categoryLogo) {
        this.categoryLogo = categoryLogo;
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
     * @return is_active
     */
    public Byte getIsActive() {
        return isActive;
    }

    /**
     * @param isActive
     */
    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    /**
     * @return is_control_menu
     */
    public Byte getIsControlMenu() {
        return isControlMenu;
    }

    /**
     * @param isControlMenu
     */
    public void setIsControlMenu(Byte isControlMenu) {
        this.isControlMenu = isControlMenu;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}