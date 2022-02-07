package com.example.mythirdtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddEditOne extends AppCompatActivity {

    Button btn_ok, btn_cancel;
    List<Dyr> dyrList;
    EditText et_navn,et_bildeURL;

    MyApplication myApplication = (MyApplication) this.getApplication();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_one);


        dyrList = myApplication.getDyrList();

        btn_ok=findViewById(R.id.btn_ok);
        btn_cancel=findViewById(R.id.btn_cancel);
        et_navn = findViewById(R.id.et_dyrNavn);
        et_bildeURL = findViewById(R.id.et_bildetURL);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // lag objekt

                int nextId = myApplication.getNextId();
                Dyr newDyr = new Dyr(nextId,et_navn.getText().toString(),et_bildeURL.getText().toString());

                //legg til globalt
                dyrList.add(newDyr);
                MyApplication.setNextId(nextId++);

                //går til database
                Intent intent = new Intent(AddEditOne.this,database.class);
                startActivity(intent);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddEditOne.this,database.class);
                startActivity(intent);
            }
        });
    }
}