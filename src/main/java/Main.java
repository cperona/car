public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("defaultmodel1", 10);
        car1.model = "model95";

        Car car2 = new Car("defaultmodel2", 10);
        car2.model = "model888";

        //car1.model i car2.model tenen el mateix valor perquè model és un atribut static.
        System.out.println(car1.model + "\n" + car2.model);


        //brake() és un mètode static i per tant es pot accedir sense instànciar la classe Car.
        Car.brake();

        //accelerate() no és un mètode static i per tant s'ha d'instanciar la classe car per poder-se accedir.
        Car car3 = new Car("defaultmodel3", 10);
        car3.accelerate();
    }
}
