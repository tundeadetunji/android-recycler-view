package com.inovationware.recyclerviewsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("text1");
        arrayList.add("text2");
        arrayList.add("text3");
        arrayList.add("text4");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        CustomAdapter customAdapter = new CustomAdapter(arrayList);
        recyclerView.setAdapter(customAdapter);

        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ItemTouchHelper.Callback callback = new SwipeModule(customAdapter);
        ItemTouchHelper swipeSupport = new ItemTouchHelper(callback);
        swipeSupport.attachToRecyclerView(recyclerView);
    }
}