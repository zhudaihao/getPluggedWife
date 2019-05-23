package com.example.administrator.lsn_9_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void isPlugged(View view) {
      if (Battery.isPlugged(getApplicationContext())) {
          Toast.makeText(this, "充电状态", Toast.LENGTH_SHORT).show();
      }else {
          Toast.makeText(this, "没有充电状态", Toast.LENGTH_SHORT).show();
      }

    }


    public void isWife(View view) {
        if (Battery.isWifi(getApplicationContext())) {
            Toast.makeText(this, "wife开启状态", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "wife关闭状态", Toast.LENGTH_SHORT).show();
        }
    }
}
