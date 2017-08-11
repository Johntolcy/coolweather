package com.coolweather.andrioid.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/11.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
}
