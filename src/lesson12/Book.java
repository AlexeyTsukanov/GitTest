package lesson12;

public class Book implements Printable {
    String name;
    Book(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("I`m printing: " + name);
    }
}
