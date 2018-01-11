package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_dynamic_like")
public class CSJ_DynamicLike {
    @Id
    private Integer id;

    /**
     * 发现ID
     */
    private Integer did;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "Item1")
    private Integer item1;

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
     * 获取发现ID
     *
     * @return did - 发现ID
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置发现ID
     *
     * @param did 发现ID
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return Item1
     */
    public Integer getItem1() {
        return item1;
    }

    /**
     * @param item1
     */
    public void setItem1(Integer item1) {
        this.item1 = item1;
    }
}