package com.coolweather.sgy.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sgy on 2017/5/2.
 */

public class City extends DataSupport {

    private int id;
    private String cityName; // 城市名
    private int cityCode; // 城市代号
    private int provinceId; // 所属省份id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
