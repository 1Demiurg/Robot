package com.itsamsung.robot;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

/**
 * Created by TEACHER on 07.12.2016.
 */
public class MyAsyncTask extends AsyncTask<Void, Integer, Void> {
    private static final String TAG = "CAT";

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        Log.i(TAG, "Лезет..." + values[0].toString());
    }

    @Override
    protected Void doInBackground(Void... parameter) {
        try {
            for (int i = 0; i < 30; i++) {
                Thread.sleep(1000);
                publishProgress(i, 100, -10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d(TAG, "Кот лезет на крышу");
    }

    @Override
    protected void onPostExecute(Void integer) {
        super.onPostExecute(integer);
        Log.d(TAG, "Кот залез на крышу");
    }
}
