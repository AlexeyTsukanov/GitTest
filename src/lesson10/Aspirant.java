package lesson10;

public class Aspirant extends Student implements Comparable<Aspirant> {
    private String work;
    private int age;

    public Aspirant(String firstName, String lastName, String group, String work) {
        super(firstName, lastName, group);
        this.work = work;
    }

    public Aspirant() {
        super();
    }

    public Aspirant(int age){
        this.age = age;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public int getAge() {
        return age;
    }

    public int getScholarship(){
        return 150;
    }

    @Override
    public String toString() {
        return "age " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aspirant aspirant = (Aspirant) o;

        return work != null ? work.equals(aspirant.work) : aspirant.work == null;

    }

    @Override
    public int hashCode() {
        return work != null ? work.hashCode() : 0;
    }

    @Override
    public int compareTo(Aspirant o) {
        int obgAge = o.getAge();
        return age - obgAge;
    }
}
