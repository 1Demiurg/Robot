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

/**
 * Created by TEACHER on 30.11.2016.
 */
public class Drawer extends View {
    private static final String TAG = "ROBOT_APP";
    private Robot robot;

    public Drawer(Context context) {
        super(context);
        Log.i(TAG, Integer.toString(this.getWidth()));
        robot = new Robot(200, 200, 50);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        robot.draw(canvas);
           int r = 6;
        switch (r){
            case 0: robot.moveRight(); break;
            case 1: robot.moveUp(); break;
            case 2: robot.moveLeft(); break;
            case 3: robot.moveDown(); break;
            case 4:
                Toast.makeText(getContext(), robot.sayJoke(), Toast.LENGTH_SHORT).show(); break;
            case 5:
                Toast.makeText(getContext(), robot.sayHaha(), Toast.LENGTH_SHORT).show(); break;
            case 6:robot.moveCircle(1); break;
        }

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        invalidate();
    }
}
