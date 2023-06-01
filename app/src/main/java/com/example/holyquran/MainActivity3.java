package com.example.holyquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    TextView textView;
    ListView listView3;

    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView2);
        listView3 = findViewById(R.id.listView3);

        Intent intent = getIntent();

        String name = intent.getStringExtra("surah");
        String ayat = intent.getStringExtra("ayat");

        textView.setText(name);


        arrayList.add(ayat);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , arrayList);

        listView3.setAdapter(arrayAdapter);


    }
}