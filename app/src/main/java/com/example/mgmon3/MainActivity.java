package com.example.mgmon3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private transaksiAdapter adapter;
    private ArrayList<transaksi> transaksiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new transaksiAdapter(transaksiArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        transaksiArrayList = new ArrayList<>();
        transaksiArrayList.add(new transaksi("Pemasukan", "27/02/2020", "Bekal", 30000));
        transaksiArrayList.add(new transaksi("Pengeluaran", "27/02/2020", "Bensin", 15000));
        transaksiArrayList.add(new transaksi("Pengeluaran", "27/02/2020", "Jajan", 10000));
        transaksiArrayList.add(new transaksi("Pengeluaran", "27/02/2020", "Jajan", 1000));
        transaksiArrayList.add(new transaksi("Pemasukan", "27/02/2020", "Bonus", 100000));
        transaksiArrayList.add(new transaksi("Pengeluaran", "27/02/2020", "Makan", 5000));
        transaksiArrayList.add(new transaksi("Pemasukan", "27/02/2020", "Nemu", 2000));
        transaksiArrayList.add(new transaksi("Pengeluaran", "27/02/2020", "Minum", 4000));
        transaksiArrayList.add(new transaksi("Pengeluaran", "27/02/2020", "Print", 7000));

    }
}
