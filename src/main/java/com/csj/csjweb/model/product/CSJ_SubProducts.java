package com.csj.csjweb.model.product;

import javax.persistence.*;

@Table(name = "csj_sub_products")
public class CSJ_SubProducts {
    @Id
    private Integer id;

    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "p_id")
    private Integer pId;

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
     * @return s_id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * @return p_id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * @param pId
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }
}