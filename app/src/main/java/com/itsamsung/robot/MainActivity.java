package com.itsamsung.robot;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MAIN";
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Drawer drawer = new Drawer(this);
        setContentView(R.layout.activity_main);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "w" , Toast.LENGTH_LONG).show();
            }
        });

        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 1_000_000){
                    i++;
                    Log.i(TAG, Integer.toString(i));
                }
            }
        }).start();

    }

}
