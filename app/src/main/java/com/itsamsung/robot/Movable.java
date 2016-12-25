package com.itsamsung.robot;

import android.graphics.Point;

/**
 * Created by TEACHER on 30.11.2016.
 */
public interface Movable {
    public void moveLeft();
    public void moveRight();
    public void moveUp();
    public void moveDown();
    public  void moveCircle(int r);
    public Point getPos();

}
