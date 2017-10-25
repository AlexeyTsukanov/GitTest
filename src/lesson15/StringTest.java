package lesson15;

public class StringTest {
    public static void main(String[] args) {
        StringTest.stringUse("I like Java!!!");
    }

    public static void stringUse(String s){
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o').replace('i', 'n'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(7,11));
    }
}
