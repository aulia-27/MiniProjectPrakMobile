package com.example.miniprojectaulia;

import static java.util.Calendar.MINUTE;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Date;
import android.text.format.DateFormat;
import java.util.Calendar;

public class PengingatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengingat);

    }
}