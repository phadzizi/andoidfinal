package com.finalsemester.frenet;

/**
 * Created by user on 10/2/2017.
 */

        import java.util.Scanner;
        import java.util.TreeMap;

public class PayLogic {
    public static double setNewSalary(double hours, double rate) {
        double pay=0;
         if (hours == 40 && rate < 28.5) {
            rate += 1.5;
             return hours * rate;
        }
        if (hours == 40 && rate >= 28.5) {
            rate += 1.2;
            return hours * rate;
        }
        if (hours > 40 && rate >= 28.5) {
            rate = rate + rate * 0.015;
            return hours * rate;
        }
        if (hours < 40) {
            rate -= 0.5;
            return hours * rate;
        }
        return hours * rate;
    }
}
