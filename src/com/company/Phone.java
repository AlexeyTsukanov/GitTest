package com.company;

public class Phone {
    long number;
    String model;
    double weidht;

    void receiveCall(String name) {
        System.out.println("Звонит{" + name + "}");
    }

    void receiveCall(String name, String number) {
        System.out.println("Вам звонит: " + name + "\nНомер телефона: " + number);
    }

    long getPhoneNumber() {
        return number;
    }

    void print() {
        System.out.println(model + " " + number + " " + weidht);
    }

    Phone() {
    }

    Phone(long n, String m, double w) {
        this();
        number = n;
        model = m;
        weidht = w;
    }
}
