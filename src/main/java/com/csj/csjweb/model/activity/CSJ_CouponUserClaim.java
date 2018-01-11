package com.csj.csjweb.model.activity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_coupon_user_claim")
public class CSJ_CouponUserClaim {
    @Id
    private Integer id;

    /**
     * 认领的用户ID
     */
    private Integer uid;

    /**
     * 优惠券状态0：未使用，1：已使用，2：已过期
     */
    private Integer status;

    /**
     * 使用优惠券的订单
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 优惠券ID
     */
    private Integer cid;

    /**
     * 用户领取时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取认领的用户ID
     *
     * @return uid - 认领的用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置认领的用户ID
     *
     * @param uid 认领的用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取优惠券状态0：未使用，1：已使用，2：已过期
     *
     * @return status - 优惠券状态0：未使用，1：已使用，2：已过期
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置优惠券状态0：未使用，1：已使用，2：已过期
     *
     * @param status 优惠券状态0：未使用，1：已使用，2：已过期
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取使用优惠券的订单
     *
     * @return order_no - 使用优惠券的订单
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置使用优惠券的订单
     *
     * @param orderNo 使用优惠券的订单
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取优惠券ID
     *
     * @return cid - 优惠券ID
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置优惠券ID
     *
     * @param cid 优惠券ID
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取用户领取时间
     *
     * @return create_time - 用户领取时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户领取时间
     *
     * @param createTime 用户领取时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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