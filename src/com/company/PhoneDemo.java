package com.company;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("nokia","958764739",50);
        Phone phone2 = new Phone("iPhone","958902378", 100.23);
        Phone phone3 = new Phone("samsung", "967937892", 112.16);

        System.out.println(phone1.getPhoneModel() + " " + phone1.getPhoneNumber() + " " + phone1.getPhoneWeight());
        System.out.println(phone2.getPhoneModel() + " " + phone2.getPhoneNumber() + " " + phone2.getPhoneWeight());
        System.out.println(phone3.getPhoneModel() + " " + phone3.getPhoneNumber() + " " + phone3.getPhoneWeight());
        phone1.receiveCall("Nik");
        String  newNumber = phone2.getPhoneNumber();
        System.out.println(phone1.getPhoneNumber());
        System.out.println(newNumber);
        Phone phone4 = new Phone();
        phone4.setModel("LG");
        phone4.setNumber("0987654321");
        phone4.setWeight(150.76);

        phone4.print();

        phone1.receiveCall("Petya");
        phone1.receiveCall("Vasya", "0954783917");

        phone1.call("0955468963", "0674569823", "0668921569");
    }
}
