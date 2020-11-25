package com.example.a1ex;

/**
 * Невероятно полезная документация
 * @autor Ковтун,Паршуков
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Функция возращающая минимальное знакчение
     * @param a - 1 число
     * @param b - 2 число
     * @return
     */
    public int min(int a, int b) {
        if(a > b){
            return b;
        }
        else {
            return a;
        }
    }

    /**
     * Функция возращающая максимальное значение
     * @param a - 1 число
     * @param b - 2 числа
     * @return
     */
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