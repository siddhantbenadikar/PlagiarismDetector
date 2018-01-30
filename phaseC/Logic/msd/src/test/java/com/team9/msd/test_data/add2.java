package com.team9.msd.test_data;

public class add2 {
    private int c;
    private int d;

    private int sum(int c, int d) {
        int summation = c + d;
        return summation;
    }

    public void displayOutput() {
        System.out.println(sum(2,3));
    }
}
