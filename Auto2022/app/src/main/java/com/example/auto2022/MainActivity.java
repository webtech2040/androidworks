package com.example.auto2022;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText city;
    Button btnadd;
   public static ArrayList<String> cities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = findViewById(R.id.city);
        btnadd = findViewById(R.id.btnadd);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String mycity = city.getText().toString();

             cities.add(mycity);
             city.setText("");

            }
        });



    }

    public void btnnext(View view) {
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
}