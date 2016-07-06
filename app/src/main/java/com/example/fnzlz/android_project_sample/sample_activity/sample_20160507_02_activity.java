package com.example.fnzlz.android_project_sample.sample_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.fnzlz.android_project_sample.R;

public class sample_20160507_02_activity extends AppCompatActivity implements View.OnClickListener{

    public Button myButton = null;
    public ImageButton myImagebutton1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_20160507_02_activity);

        myButton = (Button)findViewById(R.id.button12);
        myImagebutton1 = (ImageButton)findViewById(R.id.imageButton33);
        myButton.setOnClickListener(this);
        myImagebutton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Toast.makeText(this,"이미지버튼이 눌림",Toast.LENGTH_SHORT).show();
    }
}
