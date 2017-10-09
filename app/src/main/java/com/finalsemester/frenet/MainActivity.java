package com.finalsemester.frenet;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regPayCalc();
        regTrailerHire();
        regMyOption();
    }
    void regPayCalc(){
        final Context context=this;
        (findViewById(R.id.button2)).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, PayCalculator.class);
                startActivity(intent);
            }
        });}
    void regTrailerHire(){
        final Context context=this;
        (findViewById(R.id.button3)).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, TrailerHire.class);
                startActivity(intent);
            }
        });}
    void regMyOption(){
        final Context context=this;
        (findViewById(R.id.button)).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Quadratic.class);
                startActivity(intent);
            }
        });}
}
