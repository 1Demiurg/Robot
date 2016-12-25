package com.itsamsung.robot;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

/**
 * Created by TEACHER on 30.11.2016.
 */
public class Robot extends Mech implements Movable, SayStupidJoke {


    public Robot(){
        super();
        x = 0;
        y = 0;
        size = 0.1f;
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
        canvas.drawCircle(x, y, size / 2, mPaint);
    }

    @Override
    public void moveLeft() {
        x-=0.15;
    }

    @Override
    public void moveRight() {
        x+=0.15;
    }

    @Override
    public void moveUp() {
        y-=0.15;
    }

    @Override
    public void moveDown() { y+=0.15; }

    @Override
    public Point getPos() {
        return new Point((int) x, (int) y);
    }

    @Override
    public String sayJoke() {
        return "You have white on your back";
    }

    @Override
    public String sayHaha() {
        return "KEK";
    }
}
