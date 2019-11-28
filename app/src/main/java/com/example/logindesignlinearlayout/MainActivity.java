package com.example.logindesignlinearlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public void onConfigurationChanged(@NonNull Configuration newConfig) {
//        Log.d(TAG,"TAG");
//        super.onConfigurationChanged(newConfig);
//        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
//            Log.d(TAG, "landscape orientation");
//        }else
//        {
//            Log.d(TAG, "Portait orientation");
//        }
//    }
}
