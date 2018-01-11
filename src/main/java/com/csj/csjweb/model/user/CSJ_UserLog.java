package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_user_log")
public class CSJ_UserLog {
    /**
     * 用户日志主键id
     */
    @Id
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户主键id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户访问路径
     */
    @Column(name = "user_action")
    private String userAction;

    /**
     * 用户登录类型
     */
    private String location;

    /**
     * 用户登录ip
     */
    @Column(name = "login_iP")
    private String loginIp;

    /**
     * 获取用户日志主键id
     *
     * @return id - 用户日志主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户日志主键id
     *
     * @param id 用户日志主键id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取用户主键id
     *
     * @return user_id - 用户主键id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户主键id
     *
     * @param userId 用户主键id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户访问路径
     *
     * @return user_action - 用户访问路径
     */
    public String getUserAction() {
        return userAction;
    }

    /**
     * 设置用户访问路径
     *
     * @param userAction 用户访问路径
     */
    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

    /**
     * 获取用户登录类型
     *
     * @return location - 用户登录类型
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置用户登录类型
     *
     * @param location 用户登录类型
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取用户登录ip
     *
     * @return login_iP - 用户登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置用户登录ip
     *
     * @param loginIp 用户登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}