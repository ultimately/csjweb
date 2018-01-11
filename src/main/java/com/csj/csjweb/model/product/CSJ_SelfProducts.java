package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_self_products")
public class CSJ_SelfProducts {
    @Id
    private Integer id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_title")
    private String productTitle;

    private String description;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "shape_code")
    private String shapeCode;

    @Column(name = "theme_code")
    private String themeCode;

    @Column(name = "grade_code")
    private String gradeCode;

    @Column(name = "texture_code")
    private String textureCode;

    @Column(name = "use_code")
    private String useCode;

    @Column(name = "rule_code")
    private String ruleCode;

    private String unit;

    @Column(name = "sec_unit")
    private String secUnit;

    @Column(name = "sec_weight")
    private BigDecimal secWeight;

    private String weight;

    @Column(name = "product_price")
    private BigDecimal productPrice;

    @Column(name = "sale_price")
    private BigDecimal salePrice;

    @Column(name = "ref_sale_price")
    private BigDecimal refSalePrice;

    @Column(name = "product_amount")
    private BigDecimal productAmount;

    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "meta_description")
    private String metaDescription;

    @Column(name = "meta_key_words")
    private String metaKeyWords;

    @Column(name = "product_count")
    private Integer productCount;

    @Column(name = "product_sale_count")
    private Integer productSaleCount;

    @Column(name = "is_new")
    private Byte isNew;

    @Column(name = "is_recommend")
    private Byte isRecommend;

    @Column(name = "product_pic")
    private String productPic;

    @Column(name = "is_discount")
    private Byte isDiscount;

    @Column(name = "is_lock")
    private Byte isLock;

    @Column(name = "is_sold_out")
    private Byte isSoldOut;

    @Column(name = "user_no")
    private String userNo;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "is_delete")
    private Byte isDelete;

    @Column(name = "product_sort")
    private Integer productSort;

    private Integer item1;

    private Integer item2;

    private String item3;

    private String item4;

    private BigDecimal item5;

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
     * @return product_code
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return product_title
     */
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * @param productTitle
     */
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return short_description
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * @param shortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
     * @return shape_code
     */
    public String getShapeCode() {
        return shapeCode;
    }

    /**
     * @param shapeCode
     */
    public void setShapeCode(String shapeCode) {
        this.shapeCode = shapeCode;
    }

    /**
     * @return theme_code
     */
    public String getThemeCode() {
        return themeCode;
    }

    /**
     * @param themeCode
     */
    public void setThemeCode(String themeCode) {
        this.themeCode = themeCode;
    }

    /**
     * @return grade_code
     */
    public String getGradeCode() {
        return gradeCode;
    }

    /**
     * @param gradeCode
     */
    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    /**
     * @return texture_code
     */
    public String getTextureCode() {
        return textureCode;
    }

    /**
     * @param textureCode
     */
    public void setTextureCode(String textureCode) {
        this.textureCode = textureCode;
    }

    /**
     * @return use_code
     */
    public String getUseCode() {
        return useCode;
    }

    /**
     * @param useCode
     */
    public void setUseCode(String useCode) {
        this.useCode = useCode;
    }

    /**
     * @return rule_code
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * @param ruleCode
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return sec_unit
     */
    public String getSecUnit() {
        return secUnit;
    }

    /**
     * @param secUnit
     */
    public void setSecUnit(String secUnit) {
        this.secUnit = secUnit;
    }

    /**
     * @return sec_weight
     */
    public BigDecimal getSecWeight() {
        return secWeight;
    }

    /**
     * @param secWeight
     */
    public void setSecWeight(BigDecimal secWeight) {
        this.secWeight = secWeight;
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return product_price
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return sale_price
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return ref_sale_price
     */
    public BigDecimal getRefSalePrice() {
        return refSalePrice;
    }

    /**
     * @param refSalePrice
     */
    public void setRefSalePrice(BigDecimal refSalePrice) {
        this.refSalePrice = refSalePrice;
    }

    /**
     * @return product_amount
     */
    public BigDecimal getProductAmount() {
        return productAmount;
    }

    /**
     * @param productAmount
     */
    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
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
     * @return meta_description
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * @param metaDescription
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     * @return meta_key_words
     */
    public String getMetaKeyWords() {
        return metaKeyWords;
    }

    /**
     * @param metaKeyWords
     */
    public void setMetaKeyWords(String metaKeyWords) {
        this.metaKeyWords = metaKeyWords;
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
     * @return is_new
     */
    public Byte getIsNew() {
        return isNew;
    }

    /**
     * @param isNew
     */
    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    /**
     * @return is_recommend
     */
    public Byte getIsRecommend() {
        return isRecommend;
    }

    /**
     * @param isRecommend
     */
    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * @return product_pic
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * @param productPic
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    /**
     * @return is_discount
     */
    public Byte getIsDiscount() {
        return isDiscount;
    }

    /**
     * @param isDiscount
     */
    public void setIsDiscount(Byte isDiscount) {
        this.isDiscount = isDiscount;
    }

    /**
     * @return is_lock
     */
    public Byte getIsLock() {
        return isLock;
    }

    /**
     * @param isLock
     */
    public void setIsLock(Byte isLock) {
        this.isLock = isLock;
    }

    /**
     * @return is_sold_out
     */
    public Byte getIsSoldOut() {
        return isSoldOut;
    }

    /**
     * @param isSoldOut
     */
    public void setIsSoldOut(Byte isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    /**
     * @return user_no
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return is_delete
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return product_sort
     */
    public Integer getProductSort() {
        return productSort;
    }

    /**
     * @param productSort
     */
    public void setProductSort(Integer productSort) {
        this.productSort = productSort;
    }

    /**
     * @return item1
     */
    public Integer getItem1() {
        return item1;
    }

    /**
     * @param item1
     */
    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    /**
     * @return item2
     */
    public Integer getItem2() {
        return item2;
    }

    /**
     * @param item2
     */
    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    /**
     * @return item3
     */
    public String getItem3() {
        return item3;
    }

    /**
     * @param item3
     */
    public void setItem3(String item3) {
        this.item3 = item3;
    }

    /**
     * @return item4
     */
    public String getItem4() {
        return item4;
    }

    /**
     * @param item4
     */
    public void setItem4(String item4) {
        this.item4 = item4;
    }

    /**
     * @return item5
     */
    public BigDecimal getItem5() {
        return item5;
    }

    /**
     * @param item5
     */
    public void setItem5(BigDecimal item5) {
        this.item5 = item5;
    }
}