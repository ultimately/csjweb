package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_bargain_activity")
public class CSJ_BargainActivity {
    /**
     * 活动id
     */
    @Id
    private Integer id;

    /**
     * 店铺id
     */
    @Column(name = "dist_shop_id")
    private Integer distShopId;

    /**
     * 产品id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品描述
     */
    @Column(name = "pro_describe")
    private String proDescribe;

    /**
     * 活动描述
     */
    @Column(name = "activity_describe")
    private String activityDescribe;

    /**
     * 保底价
     */
    @Column(name = "base_price")
    private BigDecimal basePrice;

    /**
     * 商品价
     */
    @Column(name = "pro_price")
    private BigDecimal proPrice;

    /**
     * 人数限制
     */
    @Column(name = "head_limit")
    private Integer headLimit;

    /**
     * 活动状态（0 未发布,1活动进行中，2完成）
     */
    private Integer status;

    /**
     * 砍价次数
     */
    @Column(name = "bargain_times")
    private Integer bargainTimes;

    /**
     * 活动开始时间
     */
    @Column(name = "activity_start")
    private Date activityStart;

    /**
     * 活动结束时间
     */
    @Column(name = "activity_end")
    private Date activityEnd;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否删除（0未删，1删）
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 自营商品：1
     */
    @Column(name = "self_employed")
    private Integer selfEmployed;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 获取活动id
     *
     * @return id - 活动id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置活动id
     *
     * @param id 活动id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取店铺id
     *
     * @return dist_shop_id - 店铺id
     */
    public Integer getDistShopId() {
        return distShopId;
    }

    /**
     * 设置店铺id
     *
     * @param distShopId 店铺id
     */
    public void setDistShopId(Integer distShopId) {
        this.distShopId = distShopId;
    }

    /**
     * 获取产品id
     *
     * @return product_id - 产品id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取商品描述
     *
     * @return pro_describe - 商品描述
     */
    public String getProDescribe() {
        return proDescribe;
    }

    /**
     * 设置商品描述
     *
     * @param proDescribe 商品描述
     */
    public void setProDescribe(String proDescribe) {
        this.proDescribe = proDescribe;
    }

    /**
     * 获取活动描述
     *
     * @return activity_describe - 活动描述
     */
    public String getActivityDescribe() {
        return activityDescribe;
    }

    /**
     * 设置活动描述
     *
     * @param activityDescribe 活动描述
     */
    public void setActivityDescribe(String activityDescribe) {
        this.activityDescribe = activityDescribe;
    }

    /**
     * 获取保底价
     *
     * @return base_price - 保底价
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * 设置保底价
     *
     * @param basePrice 保底价
     */
    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * 获取商品价
     *
     * @return pro_price - 商品价
     */
    public BigDecimal getProPrice() {
        return proPrice;
    }

    /**
     * 设置商品价
     *
     * @param proPrice 商品价
     */
    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    /**
     * 获取人数限制
     *
     * @return head_limit - 人数限制
     */
    public Integer getHeadLimit() {
        return headLimit;
    }

    /**
     * 设置人数限制
     *
     * @param headLimit 人数限制
     */
    public void setHeadLimit(Integer headLimit) {
        this.headLimit = headLimit;
    }

    /**
     * 获取活动状态（0 未发布,1活动进行中，2完成）
     *
     * @return status - 活动状态（0 未发布,1活动进行中，2完成）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置活动状态（0 未发布,1活动进行中，2完成）
     *
     * @param status 活动状态（0 未发布,1活动进行中，2完成）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取砍价次数
     *
     * @return bargain_times - 砍价次数
     */
    public Integer getBargainTimes() {
        return bargainTimes;
    }

    /**
     * 设置砍价次数
     *
     * @param bargainTimes 砍价次数
     */
    public void setBargainTimes(Integer bargainTimes) {
        this.bargainTimes = bargainTimes;
    }

    /**
     * 获取活动开始时间
     *
     * @return activity_start - 活动开始时间
     */
    public Date getActivityStart() {
        return activityStart;
    }

    /**
     * 设置活动开始时间
     *
     * @param activityStart 活动开始时间
     */
    public void setActivityStart(Date activityStart) {
        this.activityStart = activityStart;
    }

    /**
     * 获取活动结束时间
     *
     * @return activity_end - 活动结束时间
     */
    public Date getActivityEnd() {
        return activityEnd;
    }

    /**
     * 设置活动结束时间
     *
     * @param activityEnd 活动结束时间
     */
    public void setActivityEnd(Date activityEnd) {
        this.activityEnd = activityEnd;
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

    /**
     * 获取是否删除（0未删，1删）
     *
     * @return is_delete - 是否删除（0未删，1删）
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除（0未删，1删）
     *
     * @param isDelete 是否删除（0未删，1删）
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取自营商品：1
     *
     * @return self_employed - 自营商品：1
     */
    public Integer getSelfEmployed() {
        return selfEmployed;
    }

    /**
     * 设置自营商品：1
     *
     * @param selfEmployed 自营商品：1
     */
    public void setSelfEmployed(Integer selfEmployed) {
        this.selfEmployed = selfEmployed;
    }

    /**
     * 获取活动标题
     *
     * @return title - 活动标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置活动标题
     *
     * @param title 活动标题
     */
    public void setTitle(String title) {
        this.title = title;
    }
}