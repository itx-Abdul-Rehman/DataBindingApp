package com.example.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void fistButtion(View v){
        Toast.makeText(context,"Thanks for clicking",Toast.LENGTH_LONG).show();
    }
}
