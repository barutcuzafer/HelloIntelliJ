package com.app;

public class Contractor extends Employee{

    @Override
    public void calculatePay(int hours, double rate) {
        double total=(hours*rate)+20;
        System.out.println("Contractor Total Pay: "+total);
    }
}
