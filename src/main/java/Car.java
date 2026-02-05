public class Car {
    //brand només es pot inicialitzar en la mateixa declaració perquè és static final
    public static final String brand = "";
    public static String model;
    public final int power;

    public Car(String model, int power) {
        //Static final
        //this.brand = "brando";

        //Static
        this.model = model;

        //Final
        this.power = power;
    }

    public static void brake() {
        System.out.println("Vehicle is braking...");
    }

    public void accelerate() {
        System.out.println("Vehicle is accelerating...");
    }
}