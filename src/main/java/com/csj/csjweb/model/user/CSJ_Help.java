package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

public class CSJ_Help {
    @Id
    private Integer id;

    private String title;

    @Column(name = "create_time")
    private Date createTime;

    private Integer up;

    private Integer down;

    @Column(name = "parent_id")
    private Integer parentId;

    private String keywords;

    private String description;

    private String content;

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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return up
     */
    public Integer getUp() {
        return up;
    }

    /**
     * @param up
     */
    public void setUp(Integer up) {
        this.up = up;
    }

    /**
     * @return down
     */
    public Integer getDown() {
        return down;
    }

    /**
     * @param down
     */
    public void setDown(Integer down) {
        this.down = down;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
}