package com.example.fnzlz.android_project_sample;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.fnzlz.android_project_sample.sample_activity.sample_20160508_01_activity;
import com.example.fnzlz.android_project_sample.sample_opengl.opengl_20160504_01.activity_20160524_01_activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(this);


        Init_Intent();
    }

    private void Init_Intent() {
//        Intent myIntent = new Intent(this,sample_20160507_01_activity.class);
//        Intent myIntent = new Intent(this,sample_20160507_02_activity.class);
//        Intent myIntent = new Intent(this,sample_20160508_01_activity.class);
        Intent myIntent = new Intent(this,activity_20160524_01_activity.class);
//        나는 임행운이닼ㅋㅋ

        startActivity(myIntent);
    }


    @Override
    public void onClick(View v)
    {
        Toast.makeText(this,"클릭",Toast.LENGTH_SHORT).show();
    }
}
