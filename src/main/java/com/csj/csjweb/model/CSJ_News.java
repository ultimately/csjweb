package com.csj.csjweb.model;

import java.util.Date;
import javax.persistence.*;

public class CSJ_News {
    @Id
    private Integer id;

    private String title;

    private String content;

    @Column(name = "create_time")
    private Date createTime;

    private Integer up;

    private Integer down;

    private String keywords;

    private String description;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "csj_article_category_id")
    private Integer csjArticleCategoryId;

    @Column(name = "news_type")
    private Integer newsType;

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
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return csj_article_category_id
     */
    public Integer getCsjArticleCategoryId() {
        return csjArticleCategoryId;
    }

    /**
     * @param csjArticleCategoryId
     */
    public void setCsjArticleCategoryId(Integer csjArticleCategoryId) {
        this.csjArticleCategoryId = csjArticleCategoryId;
    }

    /**
     * @return news_type
     */
    public Integer getNewsType() {
        return newsType;
    }

    /**
     * @param newsType
     */
    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }
}