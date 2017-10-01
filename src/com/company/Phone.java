package com.company;

public class Phone {
    long number;
    String model;
    double weidht;

    void reciveCall(String name){
        System.out.println("Звонит{" + name +"}");
    }
    long getPhoneNumber(){
        return number;
    }

    void print(){
        System.out.println(model + " " + number + " " + weidht);
    }
    Phone(){}

    Phone(long n, String m, double w){
        number = n;
        model = m;
        weidht = w;
    }
}
