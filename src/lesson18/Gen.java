package lesson18;

import java.io.Serializable;

public class Gen<T extends Comparable, V extends Animal & Serializable, F extends Number> {
    T ob1;
    V ob2;
    F ob3;

    Gen(T o1, V o2, F o3){
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    void showTypes() {
        System.out.println("Type of T is " +
                ob1.getClass().getName());

        System.out.println("Type of V is " +
                ob2.getClass().getName());

        System.out.println("Type of F is " +
                ob3.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    F getOb3() {
        return ob3;
    }
}
