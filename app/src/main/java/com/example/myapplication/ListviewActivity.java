package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListviewActivity extends AppCompatActivity {

    ListView listView;

    String [] name = {"Mummy","Papa","Kaushik","Vishvas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        initview();
    }

    private void initview() {

    }
}