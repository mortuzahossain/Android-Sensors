package com.example.mortuza.sensorstesting;

import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    SensorManager smm;
    List<Sensor> sensor;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        lv = findViewById(R.id.sensorList);
        sensor = smm.getSensorList(Sensor.TYPE_ALL);
        lv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sensor));

    }
}
