package com.javaLearning;

import java.math.BigDecimal;

public class DecimalComparator {
    public static void main(String[] args){
        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        areEqualByThreeDecimalPlaces(3.175,3.176);
        areEqualByThreeDecimalPlaces(3.0,3.0);
        areEqualByThreeDecimalPlaces(-3.123,3.123);
        areEqualByThreeDecimalPlaces(0.0,0.0);
    }
    public static boolean areEqualByThreeDecimalPlaces (double one, double two){
        return (int)(one * 1000) == (int)(two * 1000);
    }
}