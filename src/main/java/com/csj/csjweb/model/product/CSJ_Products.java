package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class CSJ_Products {
    @Id
    private Integer id;

    @Column(name = "product_code")
    private String productCode;

    private String description;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "category_id")
    private Integer categoryId;

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

    @Column(name = "erp_number")
    private Integer erpNumber;

    @Column(name = "product_title")
    private String productTitle;

    private String unit;

    @Column(name = "sec_unit")
    private String secUnit;

    @Column(name = "sale_price")
    private BigDecimal salePrice;

    @Column(name = "ref_sale_price")
    private BigDecimal refSalePrice;

    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "product_count")
    private Integer productCount;

    @Column(name = "product_sale_count")
    private Integer productSaleCount;

    @Column(name = "product_pic")
    private String productPic;

    @Column(name = "erp_batch_no")
    private String erpBatchNo;

    @Column(name = "is_sold_out")
    private Byte isSoldOut;

    @Column(name = "user_no")
    private String userNo;

    @Column(name = "product_amount")
    private BigDecimal productAmount;

    private BigDecimal weight;

    @Column(name = "product_sort")
    private Integer productSort;

    @Column(name = "new_time")
    private Date newTime;

    @Column(name = "video_type")
    private Integer videoType;

    @Column(name = "plant_product_id")
    private Integer plantProductId;

    @Column(name = "watch_num")
    private String watchNum;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "price_type")
    private Integer priceType;

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
     * @return erp_number
     */
    public Integer getErpNumber() {
        return erpNumber;
    }

    /**
     * @param erpNumber
     */
    public void setErpNumber(Integer erpNumber) {
        this.erpNumber = erpNumber;
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
     * @return erp_batch_no
     */
    public String getErpBatchNo() {
        return erpBatchNo;
    }

    /**
     * @param erpBatchNo
     */
    public void setErpBatchNo(String erpBatchNo) {
        this.erpBatchNo = erpBatchNo;
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
     * @return weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
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
     * @return new_time
     */
    public Date getNewTime() {
        return newTime;
    }

    /**
     * @param newTime
     */
    public void setNewTime(Date newTime) {
        this.newTime = newTime;
    }

    /**
     * @return video_type
     */
    public Integer getVideoType() {
        return videoType;
    }

    /**
     * @param videoType
     */
    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    /**
     * @return plant_product_id
     */
    public Integer getPlantProductId() {
        return plantProductId;
    }

    /**
     * @param plantProductId
     */
    public void setPlantProductId(Integer plantProductId) {
        this.plantProductId = plantProductId;
    }

    /**
     * @return watch_num
     */
    public String getWatchNum() {
        return watchNum;
    }

    /**
     * @param watchNum
     */
    public void setWatchNum(String watchNum) {
        this.watchNum = watchNum;
    }

    /**
     * @return product_type
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return price_type
     */
    public Integer getPriceType() {
        return priceType;
    }

    /**
     * @param priceType
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
}