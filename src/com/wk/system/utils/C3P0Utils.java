package com.wk.system.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class C3P0Utils {
    //将dataSource 变为全局变量
    public static ComboPooledDataSource dataSource;

    static {
        //创建数据源对象
        dataSource = new ComboPooledDataSource();
    }

    //暴露一个可以对外使用的接口
    public static DataSource getDataSource(){
        return dataSource;
    }

}
