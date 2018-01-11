package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Users {
    /**
     * 用户主键id
     */
    @Id
    private Integer id;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户手机号码
     */
    private String mobile;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * 注册来源 (app 微信  qq)
     */
    private String from;

    /**
     * 注册ip
     */
    @Column(name = "register_ip")
    private String registerIp;

    /**
     * 用户真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 用户logo
     */
    private String logo;

    /**
     * 用户性别 ( 0=女 1=男)
     */
    private Integer sex;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 最后一次登录时间
     */
    @Column(name = "Last_login_time")
    private Date lastLoginTime;

    /**
     * 用户身份证id
     */
    @Column(name = "card_id")
    private String cardId;

    /**
     * 用户支付密码
     */
    @Column(name = "pay_pass_word")
    private String payPassWord;

    /**
     * 用户登录的ip地址
     */
    @Column(name = "login_ip")
    private String loginIp;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户微信编号
     */
    @Column(name = "wx_no")
    private String wxNo;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户个性签名
     */
    private String signature;

    @Column(name = "license_image")
    private String licenseImage;

    /**
     * 用户权限
     */
    @Column(name = "Permissions_type")
    private Integer permissionsType;

    /**
     * 手机归属地
     */
    @Column(name = "phone_attribution")
    private String phoneAttribution;

    /**
     * 用户总浏览量
     */
    @Column(name = "total_browse_volume")
    private Integer totalBrowseVolume;

    /**
     * 浏览量
     */
    @Column(name = "browse_volume")
    private Integer browseVolume;

    /**
     * 最后浏览时间
     */
    @Column(name = "last_browse_time")
    private Date lastBrowseTime;

    /**
     * 商店名称
     */
    @Column(name = "shop_name")
    private String shopName;

    /**
     * 商品消息
     */
    @Column(name = "shop_message")
    private String shopMessage;

    /**
     * 获取用户主键id
     *
     * @return id - 用户主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户主键id
     *
     * @param id 用户主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户手机号码
     *
     * @return mobile - 用户手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置用户手机号码
     *
     * @param mobile 用户手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * 获取用户密码
     *
     * @return pass_word - 用户密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置用户密码
     *
     * @param passWord 用户密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取注册来源 (app 微信  qq)
     *
     * @return from - 注册来源 (app 微信  qq)
     */
    public String getFrom() {
        return from;
    }

    /**
     * 设置注册来源 (app 微信  qq)
     *
     * @param from 注册来源 (app 微信  qq)
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 获取注册ip
     *
     * @return register_ip - 注册ip
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * 设置注册ip
     *
     * @param registerIp 注册ip
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    /**
     * 获取用户真实姓名
     *
     * @return real_name - 用户真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param realName 用户真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取用户logo
     *
     * @return logo - 用户logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置用户logo
     *
     * @param logo 用户logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取用户性别 ( 0=女 1=男)
     *
     * @return sex - 用户性别 ( 0=女 1=男)
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置用户性别 ( 0=女 1=男)
     *
     * @param sex 用户性别 ( 0=女 1=男)
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取最后一次登录时间
     *
     * @return Last_login_time - 最后一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastLoginTime 最后一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取用户身份证id
     *
     * @return card_id - 用户身份证id
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置用户身份证id
     *
     * @param cardId 用户身份证id
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取用户支付密码
     *
     * @return pay_pass_word - 用户支付密码
     */
    public String getPayPassWord() {
        return payPassWord;
    }

    /**
     * 设置用户支付密码
     *
     * @param payPassWord 用户支付密码
     */
    public void setPayPassWord(String payPassWord) {
        this.payPassWord = payPassWord;
    }

    /**
     * 获取用户登录的ip地址
     *
     * @return login_ip - 用户登录的ip地址
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置用户登录的ip地址
     *
     * @param loginIp 用户登录的ip地址
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
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
     * 获取用户微信编号
     *
     * @return wx_no - 用户微信编号
     */
    public String getWxNo() {
        return wxNo;
    }

    /**
     * 设置用户微信编号
     *
     * @param wxNo 用户微信编号
     */
    public void setWxNo(String wxNo) {
        this.wxNo = wxNo;
    }

    /**
     * 获取用户地址
     *
     * @return address - 用户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置用户地址
     *
     * @param address 用户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取用户个性签名
     *
     * @return signature - 用户个性签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置用户个性签名
     *
     * @param signature 用户个性签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return license_image
     */
    public String getLicenseImage() {
        return licenseImage;
    }

    /**
     * @param licenseImage
     */
    public void setLicenseImage(String licenseImage) {
        this.licenseImage = licenseImage;
    }

    /**
     * 获取用户权限
     *
     * @return Permissions_type - 用户权限
     */
    public Integer getPermissionsType() {
        return permissionsType;
    }

    /**
     * 设置用户权限
     *
     * @param permissionsType 用户权限
     */
    public void setPermissionsType(Integer permissionsType) {
        this.permissionsType = permissionsType;
    }

    /**
     * 获取手机归属地
     *
     * @return phone_attribution - 手机归属地
     */
    public String getPhoneAttribution() {
        return phoneAttribution;
    }

    /**
     * 设置手机归属地
     *
     * @param phoneAttribution 手机归属地
     */
    public void setPhoneAttribution(String phoneAttribution) {
        this.phoneAttribution = phoneAttribution;
    }

    /**
     * 获取用户总浏览量
     *
     * @return total_browse_volume - 用户总浏览量
     */
    public Integer getTotalBrowseVolume() {
        return totalBrowseVolume;
    }

    /**
     * 设置用户总浏览量
     *
     * @param totalBrowseVolume 用户总浏览量
     */
    public void setTotalBrowseVolume(Integer totalBrowseVolume) {
        this.totalBrowseVolume = totalBrowseVolume;
    }

    /**
     * 获取浏览量
     *
     * @return browse_volume - 浏览量
     */
    public Integer getBrowseVolume() {
        return browseVolume;
    }

    /**
     * 设置浏览量
     *
     * @param browseVolume 浏览量
     */
    public void setBrowseVolume(Integer browseVolume) {
        this.browseVolume = browseVolume;
    }

    /**
     * 获取最后浏览时间
     *
     * @return last_browse_time - 最后浏览时间
     */
    public Date getLastBrowseTime() {
        return lastBrowseTime;
    }

    /**
     * 设置最后浏览时间
     *
     * @param lastBrowseTime 最后浏览时间
     */
    public void setLastBrowseTime(Date lastBrowseTime) {
        this.lastBrowseTime = lastBrowseTime;
    }

    /**
     * 获取商店名称
     *
     * @return shop_name - 商店名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置商店名称
     *
     * @param shopName 商店名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取商品消息
     *
     * @return shop_message - 商品消息
     */
    public String getShopMessage() {
        return shopMessage;
    }

    /**
     * 设置商品消息
     *
     * @param shopMessage 商品消息
     */
    public void setShopMessage(String shopMessage) {
        this.shopMessage = shopMessage;
    }
}