package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_user_band_card")
public class CSJ_UserBandCard {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "UserId")
    private Integer userid;

    @Column(name = "BandName")
    private String bandname;

    @Column(name = "CardNo")
    private String cardno;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "BandType")
    private String bandtype;

    @Column(name = "BranchBank")
    private String branchbank;

    /**
     * @return Id
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
     * @return UserId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return BandName
     */
    public String getBandname() {
        return bandname;
    }

    /**
     * @param bandname
     */
    public void setBandname(String bandname) {
        this.bandname = bandname;
    }

    /**
     * @return CardNo
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * @param cardno
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * @return CreateDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return BandType
     */
    public String getBandtype() {
        return bandtype;
    }

    /**
     * @param bandtype
     */
    public void setBandtype(String bandtype) {
        this.bandtype = bandtype;
    }

    /**
     * @return BranchBank
     */
    public String getBranchbank() {
        return branchbank;
    }

    /**
     * @param branchbank
     */
    public void setBranchbank(String branchbank) {
        this.branchbank = branchbank;
    }
}