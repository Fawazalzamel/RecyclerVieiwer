package com.example.taskrecyclerviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.taskrecyclerviewer.adapter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int kuw = R.drawable.kuwait;
    int us = R.drawable.us;
    RecyclerView currencyRecycleViwer;
    private ArrayList<Currency> currencyArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyRecycleViwer = findViewById(R.id.RecycleViwerCurrency);
        currencyRecycleViwer.setLayoutManager(new LinearLayoutManager(this));
        addCurrencies();

        RecyclerView.ItemDecoration div = new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        currencyRecycleViwer.addItemDecoration(div);

        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyArrayList);
        currencyRecycleViwer.setAdapter(currencyAdapter);


    }
    private void addCurrencies(){
        currencyArrayList.add(new Currency(kuw,"Kuwait",1,"KWD"));
        currencyArrayList.add(new Currency(us,"United States",3.25,"USD"));


    }

}