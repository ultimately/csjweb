package com.csj.csjweb.model;

import javax.persistence.*;

@Table(name = "csj_sms_template")
public class CSJ_SmsTemplate {
    @Id
    private Integer id;

    private String title;

    @Column(name = "call_index")
    private String callIndex;

    @Column(name = "mail_title")
    private String mailTitle;

    private String content;

    @Column(name = "is_sys")
    private Integer isSys;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return call_index
     */
    public String getCallIndex() {
        return callIndex;
    }

    /**
     * @param callIndex
     */
    public void setCallIndex(String callIndex) {
        this.callIndex = callIndex;
    }

    /**
     * @return mail_title
     */
    public String getMailTitle() {
        return mailTitle;
    }

    /**
     * @param mailTitle
     */
    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return is_sys
     */
    public Integer getIsSys() {
        return isSys;
    }

    /**
     * @param isSys
     */
    public void setIsSys(Integer isSys) {
        this.isSys = isSys;
    }
}