package com.example.taskrecyclerviewer;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Currency {
    private String currencyName;
    private double exchangeRate;
    private String currencyCode;
    private int countryFlag;

    public Currency(int countryFlag,String currencyName, double exchangeRate,String currencyCode ) {
        this.currencyCode = currencyCode;
        this.countryFlag = countryFlag;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;

    }

    public String getCurrenceyCode() {

        return currencyCode;
    }


    public int getCountryFlag(){
        return countryFlag;
    }

    public String getCurrenceyName() {
        return currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }



}
