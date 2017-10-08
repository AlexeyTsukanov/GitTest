package com.company;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private static int count = 0;

    Phone(String model, String number, double weight) {
        this();
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    Phone() {
        count++;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит{" + name + "}");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Вам звонит: " + name + "\nНомер телефона: " + number);
    }

    public String getPhoneNumber() {
        return number;
    }

    public String getPhoneModel() {
        return model;
    }

    public double getPhoneWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println(model + " " + number + " " + weight);
    }

    public void call(String... numbers) {
        for (String numb : numbers) {
            System.out.println(numb);
        }
    }

    public int getCount(){
        return count;
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }
}
