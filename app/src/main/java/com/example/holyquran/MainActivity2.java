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

    public String[] QuranArabicText = new String[]
            {
                    "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ",
                    "اَلۡحَمۡدُ لِلّٰہِ رَبِّ الۡعٰلَمِیۡنَ ۙ﴿۱﴾",
                    "الرَّحۡمٰنِ الرَّحِیۡمِ ۙ﴿۲﴾",
                    "مٰلِکِ یَوۡمِ الدِّیۡنِ ؕ﴿۳﴾",
                    "اِیَّاکَ نَعۡبُدُ وَ اِیَّاکَ نَسۡتَعِیۡنُ ؕ﴿۴﴾",
                    "اِہۡدِ نَا الصِّرَاطَ الۡمُسۡتَقِیۡمَ ۙ﴿۵﴾",
                    "صِرَاطَ الَّذِیۡنَ اَنۡعَمۡتَ عَلَیۡہِمۡ ۙ۬ غَیۡرِ الۡمَغۡضُوۡبِ عَلَیۡہِمۡ وَ لَا الضَّآلِّیۡنَ ٪﴿۷﴾",
                    "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ",
                    "الٓـمّٓ ۚ﴿۱﴾",
                    "ذٰلِکَ  الۡکِتٰبُ لَا رَیۡبَ ۚۖۛ فِیۡہِ ۚۛ ہُدًی  لِّلۡمُتَّقِیۡنَ ۙ﴿۲﴾",
                    "الَّذِیۡنَ یُؤۡمِنُوۡنَ بِالۡغَیۡبِ وَ یُقِیۡمُوۡنَ الصَّلٰوۃَ وَ  مِمَّا رَزَقۡنٰہُمۡ  یُنۡفِقُوۡنَ ۙ﴿۳﴾",
                    "وَ الَّذِیۡنَ یُؤۡمِنُوۡنَ بِمَاۤ  اُنۡزِلَ اِلَیۡکَ وَ مَاۤ اُنۡزِلَ مِنۡ قَبۡلِکَ ۚ وَ بِالۡاٰخِرَۃِ ہُمۡ یُوۡقِنُوۡنَ ؕ﴿۴﴾",
                    "اُولٰٓئِکَ عَلٰی ہُدًی مِّنۡ رَّبِّہِمۡ ٭ وَ اُولٰٓئِکَ ہُمُ  الۡمُفۡلِحُوۡنَ ﴿۵﴾",
                    "اِنَّ الَّذِیۡنَ  کَفَرُوۡا سَوَآءٌ  عَلَیۡہِمۡ ءَاَنۡذَرۡتَہُمۡ  اَمۡ  لَمۡ  تُنۡذِرۡہُمۡ لَا یُؤۡمِنُوۡنَ ﴿۶﴾",
                    "خَتَمَ اللّٰہُ عَلٰی قُلُوۡبِہِمۡ وَ عَلٰی سَمۡعِہِمۡ ؕ  وَ عَلٰۤی اَبۡصَارِہِمۡ غِشَاوَۃٌ ۫ وَّ لَہُمۡ عَذَابٌ عَظِیۡمٌ ٪﴿۷﴾",
                    "وَ مِنَ النَّاسِ مَنۡ یَّقُوۡلُ اٰمَنَّا بِاللّٰہِ وَ بِالۡیَوۡمِ الۡاٰخِرِ وَ مَا ہُمۡ بِمُؤۡمِنِیۡنَ ۘ﴿۸﴾",
                    "یُخٰدِعُوۡنَ اللّٰہَ وَ الَّذِیۡنَ اٰمَنُوۡا ۚ وَ مَا یَخۡدَعُوۡنَ  اِلَّاۤ  اَنۡفُسَہُمۡ وَ مَا یَشۡعُرُوۡنَ ؕ﴿۹﴾"

            };








    Button button2;
    EditText editText2;
    TextView textView;
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<String>();
    ArrayList<String> arrayList2 = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.button);
        editText2 = findViewById(R.id.editTextText);
        textView = findViewById(R.id.textView);
        listView = findViewById(R.id.listView2);


        Intent intent = getIntent();

        String surat = intent.getStringExtra("surat");
        int ayatStart = intent.getIntExtra("ayatStart" , 0);
        int ayatEnd = intent.getIntExtra("ayatEnd" ,0);

        textView.setText(surat);


        for (int i = ayatStart - 1 ;  i < ayatEnd - 1 ; i++){
            arrayList.add(QuranArabicText[i]);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , arrayList);

        listView.setAdapter(arrayAdapter);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int single = Integer.parseInt(editText2.getText().toString()) ;

                int total = ayatEnd - ayatStart;

                if(single >= total){
                    String ac =  "Surat " + surat + " has max " + (total) + " ayats.";
                    Toast.makeText(MainActivity2.this, ac, Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent in = new Intent(MainActivity2.this , MainActivity3.class);
                    in.putExtra("surah" , surat);
                    in.putExtra("ayat" , arrayList.get(single) );

                    startActivity(in);

                    //arrayList2.add(QuranArabicText[single]);

                    //ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_2 , arrayList2);

                    //listView.setAdapter(arrayAdapter2);

                    //arrayAdapter.notifyDataSetChanged();




                }
            }
        });

        //String abc = surat + " " + ayatStart + " " + ayatEnd;

        //Toast.makeText(this, abc, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, ayatStart , Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, ayatEnd, Toast.LENGTH_SHORT).show();


    }
}