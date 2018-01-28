package com.android.coolweather.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Liu S on 2018/1/28.
 */

public class Basic {
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
