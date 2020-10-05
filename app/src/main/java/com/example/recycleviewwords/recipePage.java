package com.example.recycleviewwords;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment4.R;


public class recipePage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipepage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getExtras();

    }
    private void getExtras()    {
        final TextView textView = findViewById(R.id.recipe);
        if (getIntent().hasExtra("recipe")) {
            textView.setText(getIntent().getStringExtra("recipe"));
        }
        else    {
            textView.setText("Error reading recipe");
        }
    }
}
