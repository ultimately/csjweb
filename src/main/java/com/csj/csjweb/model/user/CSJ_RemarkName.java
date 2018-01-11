package com.csj.csjweb.model.user;

import javax.persistence.*;

@Table(name = "csj_remark_name")
public class CSJ_RemarkName {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "remark_user_id")
    private Integer remarkUserId;

    @Column(name = "ru_name")
    private String ruName;

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
     * @return remark_user_id
     */
    public Integer getRemarkUserId() {
        return remarkUserId;
    }

    /**
     * @param remarkUserId
     */
    public void setRemarkUserId(Integer remarkUserId) {
        this.remarkUserId = remarkUserId;
    }

    /**
     * @return ru_name
     */
    public String getRuName() {
        return ruName;
    }

    /**
     * @param ruName
     */
    public void setRuName(String ruName) {
        this.ruName = ruName;
    }
}