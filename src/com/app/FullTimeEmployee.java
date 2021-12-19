package com.app;

public class FullTimeEmployee extends Employee{

    public void calculatePay(int hours,double rate){
        double total=(hours*rate)*1.05;
        System.out.println("FullTimeEmployee Total Pay: "+total);

    }


}
