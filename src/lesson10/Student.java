package lesson10;

public class Student {
    private String firstName, lastName, group;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student() {
    }

    public int getScholarship(){
        return 100;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return String.format("Student firstName=%1$s, lastName=%2$s, group=%3$s", firstName,lastName,group);
    }
}
