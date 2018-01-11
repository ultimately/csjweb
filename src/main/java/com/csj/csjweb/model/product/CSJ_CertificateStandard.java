package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "csj_certificate_standard")
public class CSJ_CertificateStandard {
    @Id
    private Integer id;

    /**
     * 珠宝种类  0:琥珀 1:和田玉 2：翡翠 3：绿松石 4：木艺馆
     */
    @Column(name = "gem_type")
    private Integer gemType;

    /**
     * 分类
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 编码，
     */
    @Column(name = "category_code")
    private String categoryCode;

    /**
     * 饰品名称
     */
    private String name;

    /**
     * 克重范围 最小克重
     */
    @Column(name = "min_weight")
    private Integer minWeight;

    /**
     * 克重范围 最大克重
     */
    @Column(name = "max_weight")
    private Integer maxWeight;

    /**
     * 证书类型
     */
    @Column(name = "certificate_type")
    private Integer certificateType;

    /**
     * 证书机构
     */
    @Column(name = "certificate_authority")
    private String certificateAuthority;

    /**
     * 证书价格
     */
    @Column(name = "certificate_amount")
    private BigDecimal certificateAmount;

    /**
     * 证书折扣价格
     */
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 规格
     */
    private String norm;

    /**
     * 产地
     */
    private String origin;

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
     * 获取珠宝种类  0:琥珀 1:和田玉 2：翡翠 3：绿松石 4：木艺馆
     *
     * @return gem_type - 珠宝种类  0:琥珀 1:和田玉 2：翡翠 3：绿松石 4：木艺馆
     */
    public Integer getGemType() {
        return gemType;
    }

    /**
     * 设置珠宝种类  0:琥珀 1:和田玉 2：翡翠 3：绿松石 4：木艺馆
     *
     * @param gemType 珠宝种类  0:琥珀 1:和田玉 2：翡翠 3：绿松石 4：木艺馆
     */
    public void setGemType(Integer gemType) {
        this.gemType = gemType;
    }

    /**
     * 获取分类
     *
     * @return category_id - 分类
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类
     *
     * @param categoryId 分类
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取编码，
     *
     * @return category_code - 编码，
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 设置编码，
     *
     * @param categoryCode 编码，
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 获取饰品名称
     *
     * @return name - 饰品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置饰品名称
     *
     * @param name 饰品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取克重范围 最小克重
     *
     * @return min_weight - 克重范围 最小克重
     */
    public Integer getMinWeight() {
        return minWeight;
    }

    /**
     * 设置克重范围 最小克重
     *
     * @param minWeight 克重范围 最小克重
     */
    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    /**
     * 获取克重范围 最大克重
     *
     * @return max_weight - 克重范围 最大克重
     */
    public Integer getMaxWeight() {
        return maxWeight;
    }

    /**
     * 设置克重范围 最大克重
     *
     * @param maxWeight 克重范围 最大克重
     */
    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * 获取证书类型
     *
     * @return certificate_type - 证书类型
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    /**
     * 设置证书类型
     *
     * @param certificateType 证书类型
     */
    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取证书机构
     *
     * @return certificate_authority - 证书机构
     */
    public String getCertificateAuthority() {
        return certificateAuthority;
    }

    /**
     * 设置证书机构
     *
     * @param certificateAuthority 证书机构
     */
    public void setCertificateAuthority(String certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * 获取证书价格
     *
     * @return certificate_amount - 证书价格
     */
    public BigDecimal getCertificateAmount() {
        return certificateAmount;
    }

    /**
     * 设置证书价格
     *
     * @param certificateAmount 证书价格
     */
    public void setCertificateAmount(BigDecimal certificateAmount) {
        this.certificateAmount = certificateAmount;
    }

    /**
     * 获取证书折扣价格
     *
     * @return discount_amount - 证书折扣价格
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置证书折扣价格
     *
     * @param discountAmount 证书折扣价格
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 获取规格
     *
     * @return norm - 规格
     */
    public String getNorm() {
        return norm;
    }

    /**
     * 设置规格
     *
     * @param norm 规格
     */
    public void setNorm(String norm) {
        this.norm = norm;
    }

    /**
     * 获取产地
     *
     * @return origin - 产地
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置产地
     *
     * @param origin 产地
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }
}