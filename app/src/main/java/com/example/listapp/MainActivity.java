package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSimple = (Button) findViewById(R.id.bSimpleList);
        buttonSimple.setOnClickListener(this);

        Button buttonCustom = (Button) findViewById(R.id.bCustomList);
        buttonCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Class<?> actionClass = null;

        if(v.getId() == R.id.bSimpleList) {

            actionClass = SimpleListActivity.class;

        } else if(v.getId() == R.id.bCustomList) {

            actionClass = CustomListActivity.class;

        }

        Intent menuIntent = new Intent(MainActivity.this, actionClass);
        startActivity(menuIntent);

    }
}