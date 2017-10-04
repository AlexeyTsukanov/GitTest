package com.company;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.model = "nokia";
        phone1.number = 958764739;
        phone1.weidht = 50;

        phone2.model = "iPhone";
        phone2.number = 958902378;
        phone2.weidht = 100.23;

        phone3.model = "samsung";
        phone3.number = 967937892;
        phone3.weidht = 112.16;
        /*System.out.println(phone1.model + " " + phone1.number + " " + phone1.weidht);
        System.out.println(phone2.model + " " + phone2.number + " " + phone2.weidht);
        System.out.println(phone3.model + " " + phone3.number + " " + phone3.weidht);*/
       /* phone1.reciveCall("Nik");
        long newNumber = phone2.getPhoneNumber();
        System.out.println(phone1.getPhoneNumber());
        System.out.println(newNumber);*/
        Phone phone4 = new Phone(986789374, "Lenovo", 134.6);

        phone4.print();

        phone1.receiveCall("Petya");
        phone1.receiveCall("Vasya", "0954783917");
    }
}
