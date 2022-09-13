package com.example.auto2022;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class Dashboard extends AppCompatActivity {

    AutoCompleteTextView auto;
    MultiAutoCompleteTextView multi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String subjects [] = {"Html","CSS","ANDROID","PHP", "Math"};

        // String cities [] = {"Abbottabad","Karachi","Dubai","Amercia", "England"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,MainActivity.cities);

        ArrayAdapter<String> sub = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,subjects);


        auto = findViewById(R.id.autocomplete);
        multi =findViewById(R.id.multicomplete);

        auto.setAdapter(adapter);

         multi.setAdapter(sub);
         multi.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());




















    }
}