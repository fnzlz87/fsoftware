package com.example.fnzlz.android_project_sample.sample_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.fnzlz.android_project_sample.R;

public class sample_20160507_01_activity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{


    public RadioGroup myRadio1 = null;
    public RadioGroup myRadio2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_20160507_01_activity);

        myRadio1 = (RadioGroup)findViewById(R.id.radio_group_1);
        myRadio2 = (RadioGroup)findViewById(R.id.radio_group_2);

        myRadio1.setOnCheckedChangeListener(this);
        myRadio2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        RadioButton myRadio = (RadioButton)findViewById(checkedId);

        Log.d("radioButtonText",myRadio.getText().toString());

    }
}
