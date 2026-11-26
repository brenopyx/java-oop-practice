package encapsulation.temperature_control_system;

public class Main {
    public static void main(String[] args) {
        temperatureController machine1 = new temperatureController();
        temperatureController machine2 = new temperatureController();

        machine1.setTemperature(80);
        machine1.showTemperatureInformation();
        machine1.decreaseTemperature(20);
        machine1.showTemperatureInformation();
    }
}
