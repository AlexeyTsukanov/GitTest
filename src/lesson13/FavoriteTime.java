package lesson13;

public class FavoriteTime {
    public static void main(String[] args) {
        TimesOfYear favoriteTime1 = TimesOfYear.SUMMER;
        Test.test(favoriteTime1);

        TimesOfYear[] timesOfYears = TimesOfYear.values();
        for (TimesOfYear timesOfYear : timesOfYears){
            System.out.println(timesOfYear);
        }

        TimesOfYear timesOfYear1 = TimesOfYear.valueOf("WINTER");
        System.out.println("Выбранное время года " + timesOfYear1);
    }

    static class Test{
        public static void test(TimesOfYear time){
            switch (time){
                case SUMMER:{
                    System.out.println("Я люблю лето");
                    break;
                }
                case SPRING:{
                    System.out.println("Я люблю весну");
                    break;
                }
                case WINTER:{
                    System.out.println("Я люблю зиму");
                    break;
                }
                case AUTUMN:{
                    System.out.println("Я люблю осень");
                    break;
                }
            }
        }
    }
}
