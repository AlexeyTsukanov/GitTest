package lesson19;

import lesson10.Student;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayTest {
    public static void main(String[] args) {
        Deque<Student> students = new ArrayDeque<>();
        students.offer(new Student("Petya", "Ivanov", "ar11"));
        students.offer(new Student("Vasya", "Petrov", "ar12"));
        students.offer(new Student("Genya", "Sidorov", "ar13"));

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}
