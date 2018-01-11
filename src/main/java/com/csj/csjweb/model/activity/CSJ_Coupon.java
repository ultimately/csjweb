package com.csj.csjweb.model.activity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class CSJ_Coupon {
    @Id
    private Integer id;

    /**
     * 优惠券标题
     */
    private String title;

    /**
     * 优惠券描述
     */
    private String describe;

    /**
     * 触发优惠低价
     */
    @Column(name = "trigger_discount")
    private BigDecimal triggerDiscount;

    /**
     * 优惠价格
     */
    @Column(name = "favorable_price")
    private BigDecimal favorablePrice;

    /**
     * 优惠券数量
     */
    private Integer number;

    /**
     * 发布优惠券的用户ID，本公司发布ID为0
     */
    @Column(name = "published_user_id")
    private Integer publishedUserId;

    /**
     * 优惠卷开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 优惠卷结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 活动ID
     */
    @Column(name = "activity_id")
    private Integer activityId;

    /**
     * 优惠券已领取数量
     */
    @Column(name = "number_received")
    private Integer numberReceived;

    /**
     * 每人领取数量
     */
    @Column(name = "number_perperson")
    private Integer numberPerperson;

    /**
     * 优惠劵类型: 0--商城活动优惠券  1--商城发放的优惠券
     */
    private Integer type;

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
     * 获取优惠券标题
     *
     * @return title - 优惠券标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置优惠券标题
     *
     * @param title 优惠券标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取优惠券描述
     *
     * @return describe - 优惠券描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置优惠券描述
     *
     * @param describe 优惠券描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取触发优惠低价
     *
     * @return trigger_discount - 触发优惠低价
     */
    public BigDecimal getTriggerDiscount() {
        return triggerDiscount;
    }

    /**
     * 设置触发优惠低价
     *
     * @param triggerDiscount 触发优惠低价
     */
    public void setTriggerDiscount(BigDecimal triggerDiscount) {
        this.triggerDiscount = triggerDiscount;
    }

    /**
     * 获取优惠价格
     *
     * @return favorable_price - 优惠价格
     */
    public BigDecimal getFavorablePrice() {
        return favorablePrice;
    }

    /**
     * 设置优惠价格
     *
     * @param favorablePrice 优惠价格
     */
    public void setFavorablePrice(BigDecimal favorablePrice) {
        this.favorablePrice = favorablePrice;
    }

    /**
     * 获取优惠券数量
     *
     * @return number - 优惠券数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置优惠券数量
     *
     * @param number 优惠券数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取发布优惠券的用户ID，本公司发布ID为0
     *
     * @return published_user_id - 发布优惠券的用户ID，本公司发布ID为0
     */
    public Integer getPublishedUserId() {
        return publishedUserId;
    }

    /**
     * 设置发布优惠券的用户ID，本公司发布ID为0
     *
     * @param publishedUserId 发布优惠券的用户ID，本公司发布ID为0
     */
    public void setPublishedUserId(Integer publishedUserId) {
        this.publishedUserId = publishedUserId;
    }

    /**
     * 获取优惠卷开始时间
     *
     * @return start_time - 优惠卷开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置优惠卷开始时间
     *
     * @param startTime 优惠卷开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取优惠卷结束时间
     *
     * @return end_time - 优惠卷结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置优惠卷结束时间
     *
     * @param endTime 优惠卷结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * 获取活动ID
     *
     * @return activity_id - 活动ID
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 设置活动ID
     *
     * @param activityId 活动ID
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取优惠券已领取数量
     *
     * @return number_received - 优惠券已领取数量
     */
    public Integer getNumberReceived() {
        return numberReceived;
    }

    /**
     * 设置优惠券已领取数量
     *
     * @param numberReceived 优惠券已领取数量
     */
    public void setNumberReceived(Integer numberReceived) {
        this.numberReceived = numberReceived;
    }

    /**
     * 获取每人领取数量
     *
     * @return number_perperson - 每人领取数量
     */
    public Integer getNumberPerperson() {
        return numberPerperson;
    }

    /**
     * 设置每人领取数量
     *
     * @param numberPerperson 每人领取数量
     */
    public void setNumberPerperson(Integer numberPerperson) {
        this.numberPerperson = numberPerperson;
    }

    /**
     * 获取优惠劵类型: 0--商城活动优惠券  1--商城发放的优惠券
     *
     * @return type - 优惠劵类型: 0--商城活动优惠券  1--商城发放的优惠券
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置优惠劵类型: 0--商城活动优惠券  1--商城发放的优惠券
     *
     * @param type 优惠劵类型: 0--商城活动优惠券  1--商城发放的优惠券
     */
    public void setType(Integer type) {
        this.type = type;
    }
}