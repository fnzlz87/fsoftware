package com.example.fnzlz.android_project_sample.project_event;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by fnzlz on 2016-05-04.
 */
public class CustomOnClickEvent implements AdapterView.OnItemClickListener {

    private AppCompatActivity parent = null;

    public CustomOnClickEvent(AppCompatActivity parent_activity)
    {
        parent = parent_activity;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("눌려진 아이템", view.toString());
    }
}
