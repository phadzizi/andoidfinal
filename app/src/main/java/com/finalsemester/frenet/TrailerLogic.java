package com.finalsemester.frenet;

/**
 * Created by user on 10/2/2017.
 */

        import java.util.Scanner;
        import java.util.TreeMap;

public class TrailerLogic {
     public static double calcAmount(double dist, double rate) {
         //assuming that he uses the trailer 24hours a day
         //lets calculate the number of day, given hour
         int days=(int)(dist/24);//how many days?
         if(dist%24!=0)//if we have a remainder
             days++;//add a day to the result---even one hour is concidered as a day!!
         int basic=300*days;//basic == number of days by 300
        double pay = basic + dist * rate;
        if ( dist < 40) {
            return pay + (pay * 0.05);
        }
        if (dist > 200) {
            return pay - (pay * 0.11);
        }
        return pay;
    }
 }

