package com.google.sample.isort;

import android.app.Application;

/**
 * Created by kushg on 1/21/2018.
 */

public class DataHolder {
    private static String data;
    private static int points;
    public static String getData() {return data;}
    public static int getPoints(){
        return points;
    }
    public static void setData(String data)
    {
        DataHolder.data = data;
    }
    public static void setPoints(int pts){
        points = pts;
    }
}