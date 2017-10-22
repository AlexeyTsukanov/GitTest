package lesson12;

public class PrintTest {
    public static void main(String[] args) {
        Book book = new Book("Some book");
        Magazine magazine = new Magazine("Some magazine");

        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = magazine;

        for (Printable printable : printables){
            printable.print();
        }
    }
}
