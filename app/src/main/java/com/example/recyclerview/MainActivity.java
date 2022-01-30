package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
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
        recyclerView=findViewById(R.id.rac1);

        ArrayList<Model> arrayList= new ArrayList<>();
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));
        arrayList.add(new Model(R.drawable.naran, 982453436, "Narayan Shah"));



        Adapter adapter = new Adapter(this, arrayList);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);








    }
}