package com.example.fnzlz.android_project_sample.sample_opengl.opengl_20160504_01;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fnzlz.android_project_sample.R;
import com.example.fnzlz.android_project_sample.sample_opengl.opengl_20160504_01.opengl_renderer.MyGLRenderer;

public class activity_20160524_01_activity extends AppCompatActivity {


    private GLSurfaceView glView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_20160524_01_activity);
        glView = new GLSurfaceView(this);
        glView.setRenderer(new MyGLRenderer(this));
        this.setContentView(glView);
        //우루후훕676878
        //나의이름은 임행운이라고합니다

    }
}
