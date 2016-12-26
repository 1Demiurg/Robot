package com.itsamsung.robot;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

/**
 * Created by TEACHER on 30.11.2016.
 */
public class Robot extends Mech implements Movable {

float o=0;
    float p=0;

    public Robot(){
        super();
        x = 0;
        y = 0;
        size = 0;
    }



    public Robot(int x, int y, int size){
        super();
        this.x = x;
        this.y = y;
        this.size = size;
    }

    Paint mPaint = new Paint();

    public void draw(Canvas canvas){
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(Color.GRAY);
        canvas.drawPaint(mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(o, p, size / 2, mPaint);
    }


   @Override
    public void moveCircle(float t){

            o=100*(float)Math.cos((double)t)+x;
            p=100*(float)Math.sin((double)t)+y;

    }
}
