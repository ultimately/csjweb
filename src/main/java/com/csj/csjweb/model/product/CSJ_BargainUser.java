package com.csj.csjweb.model.product;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_bargain_user")
public class CSJ_BargainUser {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 活动id
     */
    @Column(name = "bar_activity_id")
    private Integer barActivityId;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户头像
     */
    @Column(name = "user_head_img")
    private String userHeadImg;

    /**
     * 店铺id
     */
    @Column(name = "dist_shop_id")
    private Integer distShopId;

    /**
     * 时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 状态(0:已关闭，1：进行中)
     */
    private Integer status;

    /**
     * 砍价价格
     */
    @Column(name = "bargain_price")
    private String bargainPrice;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取活动id
     *
     * @return bar_activity_id - 活动id
     */
    public Integer getBarActivityId() {
        return barActivityId;
    }

    /**
     * 设置活动id
     *
     * @param barActivityId 活动id
     */
    public void setBarActivityId(Integer barActivityId) {
        this.barActivityId = barActivityId;
    }

    /**
     * 获取用户昵称
     *
     * @return nick_name - 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户昵称
     *
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取用户头像
     *
     * @return user_head_img - 用户头像
     */
    public String getUserHeadImg() {
        return userHeadImg;
    }

    /**
     * 设置用户头像
     *
     * @param userHeadImg 用户头像
     */
    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
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
     * 获取时间
     *
     * @return create_time - 时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置时间
     *
     * @param createTime 时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取状态(0:已关闭，1：进行中)
     *
     * @return status - 状态(0:已关闭，1：进行中)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(0:已关闭，1：进行中)
     *
     * @param status 状态(0:已关闭，1：进行中)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取砍价价格
     *
     * @return bargain_price - 砍价价格
     */
    public String getBargainPrice() {
        return bargainPrice;
    }

    /**
     * 设置砍价价格
     *
     * @param bargainPrice 砍价价格
     */
    public void setBargainPrice(String bargainPrice) {
        this.bargainPrice = bargainPrice;
    }
}