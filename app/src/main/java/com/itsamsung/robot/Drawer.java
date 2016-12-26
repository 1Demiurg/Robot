package com.itsamsung.robot;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.x;
import static android.R.attr.y;

/**
 * Created by TEACHER on 30.11.2016.
 */
public class Drawer extends View {
    private static final String TAG = "ROBOT_APP";
    private Robot robot;

float t=0;
    public Drawer(Context context) {
        super(context);
        Log.i(TAG, Integer.toString(this.getWidth()));
        robot = new Robot(255, 365, 100);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        robot.draw(canvas);

        robot.moveCircle(t);
        t+=0.05;


        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        invalidate();
    }



}


