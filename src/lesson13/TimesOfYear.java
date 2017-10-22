package lesson13;

public enum TimesOfYear {
    SUMMER(30){
        public void getDescription(){
            System.out.println("Теплое время года.");
        }
    },
    AUTUMN(15),
    WINTER(-10),
    SPRING(15);

    private int temperature;

    TimesOfYear(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    public void getDescription(){
        System.out.println("Холодное время года.");
    }
}
