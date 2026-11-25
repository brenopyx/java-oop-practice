package level2_Composition.exercise05_car_engine;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", "2.0 Dynamic Force", 177);
        Car car2 = new Car("Honda", "Civic", "1.5 Turbo", 182 );

        //car1.showCarInformation();
        car2.showCarInformation();
    }
}
