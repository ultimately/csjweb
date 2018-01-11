package com.csj.csjweb.model.product;

import javax.persistence.*;

public class CSJ_Producer {
    @Id
    private Integer id;

    @Column(name = "factory_address")
    private String factoryAddress;

    @Column(name = "factory_description")
    private String factoryDescription;

    @Column(name = "factory_tel")
    private String factoryTel;

    @Column(name = "factory_name")
    private String factoryName;

    @Column(name = "managers_id")
    private Integer managersId;

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
     * @return factory_address
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * @param factoryAddress
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    /**
     * @return factory_description
     */
    public String getFactoryDescription() {
        return factoryDescription;
    }

    /**
     * @param factoryDescription
     */
    public void setFactoryDescription(String factoryDescription) {
        this.factoryDescription = factoryDescription;
    }

    /**
     * @return factory_tel
     */
    public String getFactoryTel() {
        return factoryTel;
    }

    /**
     * @param factoryTel
     */
    public void setFactoryTel(String factoryTel) {
        this.factoryTel = factoryTel;
    }

    /**
     * @return factory_name
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * @param factoryName
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    /**
     * @return managers_id
     */
    public Integer getManagersId() {
        return managersId;
    }

    /**
     * @param managersId
     */
    public void setManagersId(Integer managersId) {
        this.managersId = managersId;
    }
}