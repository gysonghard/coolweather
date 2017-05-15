package com.coolweather.sgy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sgy on 2017/5/10.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
