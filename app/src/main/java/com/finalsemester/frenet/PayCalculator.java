package com.finalsemester.frenet;

 import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
 import android.widget.TextView;

public class PayCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_calculator);
        regPayCalc();
    }

    void regPayCalc(){
        (findViewById(R.id.calcpay)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s;
                try{
                    Double hrs=Double.parseDouble(((TextView)findViewById(R.id.hoursworked)).getText().toString());
                Double rate=Double.parseDouble(((TextView)findViewById(R.id.ratetextview)).getText().toString());
                double pay= PayLogic.setNewSalary(hrs, rate);
                  s="The pays is R"+pay;
                }catch(Exception x){s="Rhere was an error!";}
                ((TextView)findViewById(R.id.paytextview)).setText(s);
            }
        });}
}
