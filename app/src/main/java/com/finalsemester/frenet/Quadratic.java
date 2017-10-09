package com.finalsemester.frenet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Quadratic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic);
        regPayCalc();
    }

    void regPayCalc(){
        (findViewById(R.id.ok)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s;
                try{
                Double a=Double.parseDouble(((EditText)findViewById(R.id.editTexta)).getText().toString());
                Double b=Double.parseDouble(((EditText)findViewById(R.id.editTextb)).getText().toString());
                Double c=Double.parseDouble(((EditText)findViewById(R.id.editTextc)).getText().toString());
                s="Answer: "+QuadraticLogic.solve(a, b, c);
                }catch(Exception x){s="There was an error!";}
                ((TextView)findViewById(R.id.textViewanswer)).setText(s);
            }
        });}
}
