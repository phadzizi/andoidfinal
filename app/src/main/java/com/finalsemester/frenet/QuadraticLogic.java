package com.finalsemester.frenet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/4/2017.
 */

public class QuadraticLogic {
    public static String solve(double a, double b, double c){
        double bb4ac=(b*b)-4*a*c;
        if(bb4ac<0)return "Undefined solution!";
        double root=Math.sqrt(bb4ac);
        double a1=(-b+root)/(2*a);
        Double a2=(-b-root)/(2*a);
        return ""+a1+" or "+a2;
    }
}
