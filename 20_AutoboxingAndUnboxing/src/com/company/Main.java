package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] stringArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Rodrigo");

        Integer integer = new Integer(10);
        Double doubleValue = new Double(32.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i< 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i< 10; i++) {
            System.out.printf("%d. %d\n", i + 1, integerArrayList.get(i).intValue());
        }

        //Short way
        Integer myInteger = 56;
        int myInt = myInteger;

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double i = 0.0; i <= 10.0; i += 0.5) {
            doubleArrayList.add(i);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i);
            System.out.println(i + "  ----> " + value);
        }
    }
}
