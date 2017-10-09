package com.finalsemester.frenet;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrailerHire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer_hire);
        regPayCalc();
    }

    void regPayCalc(){
        (findViewById(R.id.calcbtn)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s;
                try{
                    Double dist=Double.parseDouble(((TextView)findViewById(R.id.dist)).getText().toString());
                Double rate=Double.parseDouble(((TextView)findViewById(R.id.rate)).getText().toString());
                double amount= TrailerLogic.calcAmount(dist, rate);
                  s="The total cost is R"+amount;
                }catch(Exception x){s="There is an error!";}
                ((TextView)findViewById(R.id.amount)).setText(s);
            }
        });}
}
