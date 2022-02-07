package com.example.mythirdtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchActivity(View view) {
        Intent intent =  new Intent ( this,database.class);
        startActivity(intent);
    }
    public void switchActivity2(View view){
        Intent intent = new Intent (this , Quiz.class);
        startActivity(intent);
    }
}