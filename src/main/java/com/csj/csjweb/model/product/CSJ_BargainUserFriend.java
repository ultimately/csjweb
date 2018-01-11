package com.csj.csjweb.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_bargain_user_friend")
public class CSJ_BargainUserFriend {
    @Id
    private Integer id;

    /**
     * 活动ID
     */
    @Column(name = "bar_activity_id")
    private Integer barActivityId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 朋友Id
     */
    @Column(name = "friend_id")
    private Integer friendId;

    /**
     * 产品id
     */
    @Column(name = "product_id")
    private Integer productId;

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
     * 所砍价格
     */
    @Column(name = "bargain_price")
    private BigDecimal bargainPrice;

    /**
     * 店铺id
     */
    @Column(name = "dist_shop_id")
    private Integer distShopId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取活动ID
     *
     * @return bar_activity_id - 活动ID
     */
    public Integer getBarActivityId() {
        return barActivityId;
    }

    /**
     * 设置活动ID
     *
     * @param barActivityId 活动ID
     */
    public void setBarActivityId(Integer barActivityId) {
        this.barActivityId = barActivityId;
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
     * 获取朋友Id
     *
     * @return friend_id - 朋友Id
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * 设置朋友Id
     *
     * @param friendId 朋友Id
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
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
     * 获取所砍价格
     *
     * @return bargain_price - 所砍价格
     */
    public BigDecimal getBargainPrice() {
        return bargainPrice;
    }

    /**
     * 设置所砍价格
     *
     * @param bargainPrice 所砍价格
     */
    public void setBargainPrice(BigDecimal bargainPrice) {
        this.bargainPrice = bargainPrice;
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