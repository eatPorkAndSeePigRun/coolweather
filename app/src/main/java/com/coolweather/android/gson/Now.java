package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by d1560 on 2017/8/10.
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
