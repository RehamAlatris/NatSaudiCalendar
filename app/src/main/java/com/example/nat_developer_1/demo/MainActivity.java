package com.example.nat_developer_1.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.comnatsaudilibraryandroidcalander.CustomCalendarView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomCalendarView customCalendarView = (CustomCalendarView) findViewById(R.id.custom);
//        customCalendarView.getPropertySetters().setArabicSupport(true);
//        customCalendarView.setRotationY(180);
    }
}
