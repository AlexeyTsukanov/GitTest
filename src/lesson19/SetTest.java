package lesson19;

import lesson10.Aspirant;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        SortedSet<Aspirant> aspirants = new TreeSet<>();
        aspirants.add(new Aspirant(12));
        aspirants.add(new Aspirant(22));
        aspirants.add(new Aspirant(5));

        for (Aspirant aspirant : aspirants){
            System.out.println(aspirant);
        }

    }
}
