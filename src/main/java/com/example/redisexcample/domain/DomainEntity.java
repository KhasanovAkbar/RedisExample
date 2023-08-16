package com.example.redisexcample.domain;

import com.example.redisexcample.utils.TinyUUID;

import java.io.Serializable;

public class DomainEntity implements Serializable {
    //
    private String id;
    private long entityVersion;
    private String registeredBy;
    private long registeredOn;
    private String modifiedBy;
    private long modifiedOn;

    public DomainEntity() {
        //
        this.id = TinyUUID.random();
        this.entityVersion = 0L;
        this.registeredOn = System.currentTimeMillis();
        this.modifiedOn = registeredOn;
    }


    public DomainEntity(String id) {
        //
        this();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getEntityVersion() {
        return entityVersion;
    }

    public void setEntityVersion(long entityVersion) {
        this.entityVersion = entityVersion;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public long getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(long registeredOn) {
        this.registeredOn = registeredOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
