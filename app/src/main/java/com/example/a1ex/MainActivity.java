package com.example.a1ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public int sum(int a, int b) {
        return a + b;
    }

    public int min(int a, int b) {
        if(a > b){
            return b;
        }
        else {
            return a;
        }
    }

    public int max(int a, int b) {
        if(a > b){
            return a;
        }
        else {
            return b;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}