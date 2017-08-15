package com.coolweather.andrioid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/14.
 */

public class Basic {
    //注解的方式 让JSON字段和java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
