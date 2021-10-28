package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SimpleListActivity extends AppCompatActivity {

    private ListView lvItem;

    private String[] alatTransportasi = new String[] {
           "Sepeda", "Motor", "Mobil", "Bus", "Kereta", "Kapal", "Pesawat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        lvItem = (ListView) findViewById(R.id.lvSimple);
        ArrayAdapter<String> simpleAdapter = new ArrayAdapter<String>(SimpleListActivity.this,
                android.R.layout.simple_expandable_list_item_1, android.R.id.text1, alatTransportasi);

        lvItem.setAdapter(simpleAdapter);

    }
}