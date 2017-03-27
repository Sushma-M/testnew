/*Copyright (c) 2017-2018 wmvcstest2.com All Rights Reserved.
 This software is the confidential and proprietary information of wmvcstest2.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wmvcstest2.com*/
package com.testnew.cropdata;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CropData generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`CropData`")
public class CropData implements Serializable {

    private Integer id;
    private String country;
    private Short year;
    private String crop;
    private Integer prod;
    private String quarter;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`country`", nullable = true, length = 10)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "`year`", nullable = true, scale = 0, precision = 4)
    public Short getYear() {
        return this.year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    @Column(name = "`crop`", nullable = true, length = 10)
    public String getCrop() {
        return this.crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    @Column(name = "`prod`", nullable = true, scale = 0, precision = 10)
    public Integer getProd() {
        return this.prod;
    }

    public void setProd(Integer prod) {
        this.prod = prod;
    }

    @Column(name = "`quarter`", nullable = true, length = 10)
    public String getQuarter() {
        return this.quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CropData)) return false;
        final CropData cropData = (CropData) o;
        return Objects.equals(getId(), cropData.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
