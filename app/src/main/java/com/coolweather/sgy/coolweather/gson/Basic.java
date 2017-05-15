package com.coolweather.sgy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sgy on 2017/5/10.
 */

public class Basic {
    // 通过注解把JSON字段和Java字段建立映射联系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
