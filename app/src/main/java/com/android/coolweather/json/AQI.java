package com.android.coolweather.json;

/**
 * Created by Liu S on 2018/1/28.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
