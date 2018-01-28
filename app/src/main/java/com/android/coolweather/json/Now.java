package com.android.coolweather.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Liu S on 2018/1/28.
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
