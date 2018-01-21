package com.google.sample.isort;

import android.app.Application;

/**
 * Created by kushg on 1/21/2018.
 */

public class DataHolder {
    private static String data;
    public static String getData() {return data;}
    public static void setData(String data) {DataHolder.data = data;}
}