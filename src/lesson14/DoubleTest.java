package lesson14;

public class DoubleTest {
    public static void main(String[] args) {
        Double d = new Double(14.5);
        Double d2 = new Double("14.5");
        System.out.println(d);

        Double d3 = Double.valueOf(14.5);
        Double d4 = Double.valueOf("14.5");
        Integer i = Integer.valueOf("100101010", 2);
        System.out.println(i);

        double d5 = Double.parseDouble("14.5");
        short s = d.shortValue();
        byte b = d.byteValue();
        int i1 = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        System.out.println(d5 + " " + s+ " "+b+ " "+i1+ " "+l+ " "+f);

        System.out.println(Double.toHexString(14.5));
        System.out.println(Double.doubleToLongBits(14.5));
        System.out.println(Double.toString(d));
        System.out.println(Integer.MIN_VALUE);
    }
}
