package lesson18;

import lesson10.Aspirant;

import java.util.ArrayList;
import java.util.List;

public class mainTest {
    public static void main(String[] args) {
        /*Gen<Integer, Animal , Double> testObg = new Gen<>(15, new Animal(), 14.5);

        testObg.showTypes();

        int v = testObg.getOb1();
        System.out.println("value: " + v);

        Animal str = testObg.getOb2();
        System.out.println("value: " + str);

        Double d = testObg.getOb3();
        System.out.println("value: " + d);*/

        List<Aspirant> arrayOfAsp = new ArrayList<>();
        arrayOfAsp.add(0,new Aspirant("Nikita", "Ivanov", "EP-31", "someWork"));
        arrayOfAsp.add(1,new Aspirant("Nikita", "Ivanov", "EP-31", "someWork"));
        arrayOfAsp.add(2,new Aspirant("Nikita", "Ivanov", "EP-31", "someWork"));

        getInfo(arrayOfAsp);
    }

    public static void getInfo(List<Aspirant> aspirants){
        for (Aspirant aspirant : aspirants){
            System.out.println(aspirant);
        }
    }
}

