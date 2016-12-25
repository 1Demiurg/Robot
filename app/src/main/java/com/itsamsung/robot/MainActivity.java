package com.itsamsung.robot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG = "MAIN";
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Drawer drawer = new Drawer(this);
        setContentView(drawer);



    }

}
