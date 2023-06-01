package com.example.holyquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {




    Button button2;
    EditText editText2;
    TextView textView;
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.button);
        editText2 = findViewById(R.id.editTextText);
        textView = findViewById(R.id.textView);


        Intent intent = getIntent();

        String surat = intent.getStringExtra("surat");
        int ayatStart = intent.getIntExtra("ayatStart" , 0);
        int ayatEnd = intent.getIntExtra("ayatEnd" ,0);

        textView.setText(surat);

        //String abc = surat + " " + ayatStart + " " + ayatEnd;

        //Toast.makeText(this, abc, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, ayatStart , Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, ayatEnd, Toast.LENGTH_SHORT).show();


    }
}