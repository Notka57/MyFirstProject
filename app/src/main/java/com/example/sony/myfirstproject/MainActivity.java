package com.example.sony.myfirstproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.sony.myfirstproject.ActivityTwo;
import com.example.sony.myfirstproject.R;

public class MainActivity extends Activity{



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        startActivity(intent);
    }
}