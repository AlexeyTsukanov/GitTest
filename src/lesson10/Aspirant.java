package lesson10;

public class Aspirant extends Student {
    private String work;

    public Aspirant(String firstName, String lastName, String group, String work) {
        super(firstName, lastName, group);
        this.work = work;
    }

    public Aspirant() {
        super();
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public int getScholarship(){
        return 150;
    }
}
