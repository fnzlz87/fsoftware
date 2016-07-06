package com.example.fnzlz.android_project_sample.sample_opengl.opengl_20160504_01.opengl_renderer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by fnzlz on 2016-07-05.
 */
public class MyGLRenderer implements GLSurfaceView.Renderer {

    private final Context context;
    private long countTest = 0;
    private long currentTime = 0;
    private float xPosition = 0.0f;
    private int dummyCount = 0;

    Triangle triangles;

    public MyGLRenderer(Context context)
    {
        this.context = context;

        triangles = new Triangle();
    }
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        gl.glClearColor(0.0f,0.0f,0.0f,1.0f);
        gl.glClearDepthf(1.0f);
        gl.glEnable(GL10.GL_DEPTH_TEST);
        gl.glDepthFunc(GL10.GL_LEQUAL);
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT,GL10.GL_NICEST);
        gl.glShadeModel(GL10.GL_SMOOTH);
        gl.glDisable(GL10.GL_DITHER);

    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        if(height == 0)
        {
            height = 1;
        }

        float aspect = (float)width/height;

        gl.glViewport(0,0,width,height);

        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();

        GLU.gluPerspective(gl,45,aspect,0.1f,100.f);

        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();

    }

    @Override
    public void onDrawFrame(GL10 gl) {


        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(xPosition,0.0f,-6.0f);


        if(currentTime + 1000 < System.currentTimeMillis())
        {
            currentTime = System.currentTimeMillis();
            Log.i("test",String.valueOf(countTest));

            countTest = 0;
        }
        countTest++;

        xPosition+=0.01;

        for(int dumbCount = 0; dumbCount<100;dumbCount++)
        {
            dummyCount +=1;
        }

        if(xPosition > 5.0f)
        {
            xPosition = 0.0f;
        }





        triangles.draw(gl);
    }
}
