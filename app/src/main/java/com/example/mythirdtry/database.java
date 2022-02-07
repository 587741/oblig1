package com.example.mythirdtry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class database extends AppCompatActivity {

    private static final String TAG = "Dyr Liste";
    Button btn_addOne;

    Menu menu ;

    MyApplication myApplication = (MyApplication) this.getApplication();
    List<Dyr> dyrList ;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database);

        dyrList = myApplication.getDyrList();
        Log.d(TAG, "onCreate: " + dyrList.toString());

        btn_addOne = findViewById(R.id.btn_addOne);

        btn_addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(database.this,AddEditOne.class);
                startActivity(intent);
            }
        });
        recyclerView = findViewById(R.id.lv_dyrList);
        recyclerView.setHasFixedSize(true);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Specify an adapter
        mAdapter = new RecycleViewAdapter(dyrList,database.this);
        recyclerView.setAdapter(mAdapter);
    }
    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sort_menu,menu);
        return true;
    }
    //cases
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_aToZ:
                // a to z
                Collections.sort(dyrList,Dyr.DyrNavnAZComparator);
                Toast.makeText(database.this,"sort a to z",Toast.LENGTH_SHORT).show();
                mAdapter.notifyDataSetChanged();
                return true;
            case R.id.menu_zToA:
                // z to a
                Collections.sort(dyrList,Dyr.DyrNavnZAComparator);
                Toast.makeText(database.this,"sort z to a",Toast.LENGTH_SHORT).show();
                mAdapter.notifyDataSetChanged();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}