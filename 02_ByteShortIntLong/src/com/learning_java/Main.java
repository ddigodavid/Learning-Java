package com.learning_java;

public class Main {

    public static void main(String[] args) {
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotalValue = (myMinValue/2);
        System.out.println("myTotalValue = " + myTotalValue);

        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShorteValue = (short) (myMinShortValue/2);

        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (long) (myMinLongValue/2);

        //CHALLENGE

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("Challenge Complete: " + longValue);
    }
}
