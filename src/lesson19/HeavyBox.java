package lesson19;

public class HeavyBox{
    int weight;
    // вес коробки

    public HeavyBox() {
    }

    public HeavyBox( int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
