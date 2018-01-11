package com.csj.csjweb.model.user;

import java.util.Date;
import javax.persistence.*;

@Table(name = "csj_realname_authentication")
public class CSJ_RealNameAuthentication {
    @Id
    private Integer id;

    @Column(name = "u_id")
    private Integer uId;

    @Column(name = "last_authentication_time")
    private Date lastAuthenticationTime;

    @Column(name = "authentication_frequency")
    private Integer authenticationFrequency;

    @Column(name = "total_frequency")
    private Integer totalFrequency;

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
     * @return u_id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * @return last_authentication_time
     */
    public Date getLastAuthenticationTime() {
        return lastAuthenticationTime;
    }

    /**
     * @param lastAuthenticationTime
     */
    public void setLastAuthenticationTime(Date lastAuthenticationTime) {
        this.lastAuthenticationTime = lastAuthenticationTime;
    }

    /**
     * @return authentication_frequency
     */
    public Integer getAuthenticationFrequency() {
        return authenticationFrequency;
    }

    /**
     * @param authenticationFrequency
     */
    public void setAuthenticationFrequency(Integer authenticationFrequency) {
        this.authenticationFrequency = authenticationFrequency;
    }

    /**
     * @return total_frequency
     */
    public Integer getTotalFrequency() {
        return totalFrequency;
    }

    /**
     * @param totalFrequency
     */
    public void setTotalFrequency(Integer totalFrequency) {
        this.totalFrequency = totalFrequency;
    }
}