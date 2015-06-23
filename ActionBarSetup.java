/**
 * Created by Prashant Bhangare
 *  
 * 
 * Call From Java File
 * 
 *    ActionBarSetup.setColor(getSupportActionBar(),"#B2B2B2");
 *    ActionBarSetup.setTitle(getSupportActionBar(),"Demo");
 *    ActionBarSetup.removeShadow(getSupportActionBar(),true);
 *  
 */
 
package com.prashantb.demo.utils;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;

/**
 * Created by a588272 on 23-06-2015.
 */
public class ActionBarSetup{

    public static void setColor(ActionBar bar,String color)
    {
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(color)));
    }

    public static void setTitle(ActionBar bar,String title)
    {
        bar.setTitle(title);
    }

    public static void removeShadow(ActionBar bar,boolean flag)
    {
        if(flag)
            bar.setElevation(0);
    }
}
