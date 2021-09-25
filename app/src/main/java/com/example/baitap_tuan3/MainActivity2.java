package com.example.baitap_tuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView rcv;
    CustomRec adt;
    ArrayList<Flower> mChairs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rcv = findViewById(R.id.rcv);
        mChairs = new ArrayList<>();

        mChairs.add(new Flower(R.drawable.removebg_plant_b,10,"Red"));
        mChairs.add(new Flower(R.drawable.removebg_flower,20,"yellow"));
        mChairs.add(new Flower(R.drawable.removebg_plant_a,30,"Orange"));
        mChairs.add(new Flower(R.drawable.remove_bg_c,30,"Brown"));
        adt=  new CustomRec(mChairs);

        rcv.setAdapter(adt);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}