package com.csj.csjweb.model.user;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_distributor_info")
public class CSJ_DistributorInfo {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 联系人
     */
    @Column(name = "link_man")
    private String linkMan;

    /**
     * 营业执照
     */
    @Column(name = "business_license")
    private String businessLicense;

    /**
     * 积分
     */
    private Integer point;

    /**
     * parentId
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 经销商等级
     */
    private Integer grade;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 经销商授权码
     */
    @Column(name = "auth_key")
    private String authKey;

    /**
     * 经销商折扣
     */
    private BigDecimal discount;

    /**
     * 0为经销商，1为微商
     */
    private Integer type;

    /**
     * 店铺图片
     */
    @Column(name = "shop_license")
    private String shopLicense;

    /**
     * NULL审核中，true审核成功，false审核失败
     */
    private Byte ischeck;

    /**
     * 联系电话
     */
    @Column(name = "link_phone")
    private String linkPhone;

    /**
     * 审核人ID
     */
    @Column(name = "manager_id")
    private Integer managerId;

    /**
     * 审核人姓名
     */
    @Column(name = "manager_name")
    private String managerName;

    /**
     * 审核人评语
     */
    @Column(name = "manager_msg")
    private String managerMsg;

    /**
     * 审核时间
     */
    @Column(name = "manager_time")
    private Date managerTime;

    /**
     * 身份证
     */
    @Column(name = "card_id")
    private String cardId;

    /**
     * 微店背景图片
     */
    @Column(name = "background_img")
    private String backgroundImg;

    /**
     * 微店名称
     */
    @Column(name = "shop_name")
    private String shopName;

    /**
     * 关联的个人微信号码
     */
    @Column(name = "wx_number")
    private String wxNumber;

    /**
     * 店铺公告
     */
    @Column(name = "shop_message")
    private String shopMessage;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区/县 现在当做日流量的时间字段
     */
    private Date county;

    /**
     * 分数
     */
    private Integer mark;

    /**
     * 审核是否可以自己上传商品
     */
    @Column(name = "Item")
    private Byte item;

    /**
     * 0--无 1--微店自营 2--APP自营 3--微店自营和APP自营 4--微店自营+直播 5--APP自营+直播 6--微店自营和APP自营+直播 7--直播，8--无+直播上传 9--微店自营+直播上传 10--APP自营+直播上传 11--微店自营和APP自营+直播上传 12--微店自营+直播+直播上传 13--APP自营+直播+直播上传 14--微店自营和APP自营+直播+直播上传 15--直播+直播上传
     */
    @Column(name = "Item1")
    private Integer item1;

    @Column(name = "Item2")
    private Integer item2;

    /**
     * 退货地址
     */
    @Column(name = "Item3")
    private String item3;

    /**
     * 退货联系电话
     */
    @Column(name = "Item4")
    private String item4;

    /**
     * 退货联系人
     */
    @Column(name = "Item5")
    private String item5;

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
     * 获取联系人
     *
     * @return link_man - 联系人
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置联系人
     *
     * @param linkMan 联系人
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    /**
     * 获取营业执照
     *
     * @return business_license - 营业执照
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 设置营业执照
     *
     * @param businessLicense 营业执照
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * 获取积分
     *
     * @return point - 积分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置积分
     *
     * @param point 积分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取parentId
     *
     * @return parent_id - parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置parentId
     *
     * @param parentId parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取经销商等级
     *
     * @return grade - 经销商等级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置经销商等级
     *
     * @param grade 经销商等级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取经销商授权码
     *
     * @return auth_key - 经销商授权码
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * 设置经销商授权码
     *
     * @param authKey 经销商授权码
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * 获取经销商折扣
     *
     * @return discount - 经销商折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置经销商折扣
     *
     * @param discount 经销商折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取0为经销商，1为微商
     *
     * @return type - 0为经销商，1为微商
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置0为经销商，1为微商
     *
     * @param type 0为经销商，1为微商
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取店铺图片
     *
     * @return shop_license - 店铺图片
     */
    public String getShopLicense() {
        return shopLicense;
    }

    /**
     * 设置店铺图片
     *
     * @param shopLicense 店铺图片
     */
    public void setShopLicense(String shopLicense) {
        this.shopLicense = shopLicense;
    }

    /**
     * 获取NULL审核中，true审核成功，false审核失败
     *
     * @return ischeck - NULL审核中，true审核成功，false审核失败
     */
    public Byte getIscheck() {
        return ischeck;
    }

    /**
     * 设置NULL审核中，true审核成功，false审核失败
     *
     * @param ischeck NULL审核中，true审核成功，false审核失败
     */
    public void setIscheck(Byte ischeck) {
        this.ischeck = ischeck;
    }

    /**
     * 获取联系电话
     *
     * @return link_phone - 联系电话
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * 设置联系电话
     *
     * @param linkPhone 联系电话
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    /**
     * 获取审核人ID
     *
     * @return manager_id - 审核人ID
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 设置审核人ID
     *
     * @param managerId 审核人ID
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取审核人姓名
     *
     * @return manager_name - 审核人姓名
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * 设置审核人姓名
     *
     * @param managerName 审核人姓名
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * 获取审核人评语
     *
     * @return manager_msg - 审核人评语
     */
    public String getManagerMsg() {
        return managerMsg;
    }

    /**
     * 设置审核人评语
     *
     * @param managerMsg 审核人评语
     */
    public void setManagerMsg(String managerMsg) {
        this.managerMsg = managerMsg;
    }

    /**
     * 获取审核时间
     *
     * @return manager_time - 审核时间
     */
    public Date getManagerTime() {
        return managerTime;
    }

    /**
     * 设置审核时间
     *
     * @param managerTime 审核时间
     */
    public void setManagerTime(Date managerTime) {
        this.managerTime = managerTime;
    }

    /**
     * 获取身份证
     *
     * @return card_id - 身份证
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置身份证
     *
     * @param cardId 身份证
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取微店背景图片
     *
     * @return background_img - 微店背景图片
     */
    public String getBackgroundImg() {
        return backgroundImg;
    }

    /**
     * 设置微店背景图片
     *
     * @param backgroundImg 微店背景图片
     */
    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    /**
     * 获取微店名称
     *
     * @return shop_name - 微店名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置微店名称
     *
     * @param shopName 微店名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取关联的个人微信号码
     *
     * @return wx_number - 关联的个人微信号码
     */
    public String getWxNumber() {
        return wxNumber;
    }

    /**
     * 设置关联的个人微信号码
     *
     * @param wxNumber 关联的个人微信号码
     */
    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    /**
     * 获取店铺公告
     *
     * @return shop_message - 店铺公告
     */
    public String getShopMessage() {
        return shopMessage;
    }

    /**
     * 设置店铺公告
     *
     * @param shopMessage 店铺公告
     */
    public void setShopMessage(String shopMessage) {
        this.shopMessage = shopMessage;
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区/县 现在当做日流量的时间字段
     *
     * @return county - 区/县 现在当做日流量的时间字段
     */
    public Date getCounty() {
        return county;
    }

    /**
     * 设置区/县 现在当做日流量的时间字段
     *
     * @param county 区/县 现在当做日流量的时间字段
     */
    public void setCounty(Date county) {
        this.county = county;
    }

    /**
     * 获取分数
     *
     * @return mark - 分数
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * 设置分数
     *
     * @param mark 分数
     */
    public void setMark(Integer mark) {
        this.mark = mark;
    }

    /**
     * 获取审核是否可以自己上传商品
     *
     * @return Item - 审核是否可以自己上传商品
     */
    public Byte getItem() {
        return item;
    }

    /**
     * 设置审核是否可以自己上传商品
     *
     * @param item 审核是否可以自己上传商品
     */
    public void setItem(Byte item) {
        this.item = item;
    }

    /**
     * 获取0--无 1--微店自营 2--APP自营 3--微店自营和APP自营 4--微店自营+直播 5--APP自营+直播 6--微店自营和APP自营+直播 7--直播，8--无+直播上传 9--微店自营+直播上传 10--APP自营+直播上传 11--微店自营和APP自营+直播上传 12--微店自营+直播+直播上传 13--APP自营+直播+直播上传 14--微店自营和APP自营+直播+直播上传 15--直播+直播上传
     *
     * @return Item1 - 0--无 1--微店自营 2--APP自营 3--微店自营和APP自营 4--微店自营+直播 5--APP自营+直播 6--微店自营和APP自营+直播 7--直播，8--无+直播上传 9--微店自营+直播上传 10--APP自营+直播上传 11--微店自营和APP自营+直播上传 12--微店自营+直播+直播上传 13--APP自营+直播+直播上传 14--微店自营和APP自营+直播+直播上传 15--直播+直播上传
     */
    public Integer getItem1() {
        return item1;
    }

    /**
     * 设置0--无 1--微店自营 2--APP自营 3--微店自营和APP自营 4--微店自营+直播 5--APP自营+直播 6--微店自营和APP自营+直播 7--直播，8--无+直播上传 9--微店自营+直播上传 10--APP自营+直播上传 11--微店自营和APP自营+直播上传 12--微店自营+直播+直播上传 13--APP自营+直播+直播上传 14--微店自营和APP自营+直播+直播上传 15--直播+直播上传
     *
     * @param item1 0--无 1--微店自营 2--APP自营 3--微店自营和APP自营 4--微店自营+直播 5--APP自营+直播 6--微店自营和APP自营+直播 7--直播，8--无+直播上传 9--微店自营+直播上传 10--APP自营+直播上传 11--微店自营和APP自营+直播上传 12--微店自营+直播+直播上传 13--APP自营+直播+直播上传 14--微店自营和APP自营+直播+直播上传 15--直播+直播上传
     */
    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    /**
     * @return Item2
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
     * 获取退货地址
     *
     * @return Item3 - 退货地址
     */
    public String getItem3() {
        return item3;
    }

    /**
     * 设置退货地址
     *
     * @param item3 退货地址
     */
    public void setItem3(String item3) {
        this.item3 = item3;
    }

    /**
     * 获取退货联系电话
     *
     * @return Item4 - 退货联系电话
     */
    public String getItem4() {
        return item4;
    }

    /**
     * 设置退货联系电话
     *
     * @param item4 退货联系电话
     */
    public void setItem4(String item4) {
        this.item4 = item4;
    }

    /**
     * 获取退货联系人
     *
     * @return Item5 - 退货联系人
     */
    public String getItem5() {
        return item5;
    }

    /**
     * 设置退货联系人
     *
     * @param item5 退货联系人
     */
    public void setItem5(String item5) {
        this.item5 = item5;
    }
}