package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    private ListView lvItem;

    private String[] alatTransportasi = new String[] {
            "Sepeda", "Motor", "Mobil", "Bus", "Kereta", "Kapal", "Pesawat"
    };

    private String[] jenis = new String[] {
            "Darat", "Darat", "Datar", "Darat", "Darat", "Laut", "Udara"
    };

    private String[] yangMengendalikan = new String[] {
            "Pesepeda", "Pengendara", "Sopir", "Sopir", "Masinis", "Nahkoda", "Pilot"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        lvItem = findViewById(R.id.listCustom);
        TransportasiAdapter adapter = new TransportasiAdapter(this, alatTransportasi, jenis, yangMengendalikan);
        lvItem.setAdapter(adapter);

    }
}