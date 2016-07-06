package com.example.fnzlz.android_project_sample.singleton_class;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.example.fnzlz.android_project_sample.sample_activity.sample_20160504_01_activity;

import java.util.ArrayList;

/**
 * Created by fnzlz on 2016-05-04.
 */
public class FnzlzActivityManager {

    public ArrayList<AppCompatActivity> activityList = new ArrayList<>();
    public FnzlzActivityManager()
    {
        activityList.add(new sample_20160504_01_activity());
    }

    public Intent GetIntent(String ActivityString)
    {
        for (AppCompatActivity activity : activityList) {
            if(activity.getClass().getSimpleName().equals(ActivityString))
            {
//                return new Intent()
                return null;
            }
        }

        return null;
    }
}
