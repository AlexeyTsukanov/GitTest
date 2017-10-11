package lesson10;

public class AspirantTest {
    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant();
        aspirant.setFirstName("Dima");
        System.out.println(aspirant.getFirstName());

        Student student = new Aspirant("Nikita", "Ivanov", "EP-31", "someWork");
         Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Aspirant();

        for (Student student1 : students){
            System.out.println(student1.getScholarship());
        }
    }
}
