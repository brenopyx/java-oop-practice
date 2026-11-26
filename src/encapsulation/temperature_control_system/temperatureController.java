package encapsulation.temperature_control_system;

public class temperatureController {
    private double currentTemperature;
    private double desiredTemperature;
    private static final double minimumTemperature = 0;
    private static final double maximumTemperature = 100;

    public temperatureController() {
        this.currentTemperature = 25;
        this.desiredTemperature = 25;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getDesiredTemperature() {
        return desiredTemperature;
    }

    public double getMinimumTemperature() {
        return minimumTemperature;
    }

    public double getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setTemperature(double newTemperature) {
        if (newTemperature >= minimumTemperature && newTemperature <= maximumTemperature) {
            this.desiredTemperature = newTemperature;
        }else {
            throw new IllegalArgumentException("The temperature entered is invalid");
        }
    }

    public void increaseTemperature(double value) {
        if (value <= 0 || this.desiredTemperature + value > maximumTemperature) {
            throw new IllegalArgumentException("The temperature can't exceed 100ºC and must greater than zero");
        }else {
            this.desiredTemperature += value;
        }
    }

    public void decreaseTemperature(double value) {
        if (value <= 0 || this.desiredTemperature - value < minimumTemperature) {
            throw new IllegalArgumentException("The temperature can't fall below 0ºC and must greater than zero");
        }else {
            this.desiredTemperature -= value;
        }
    }

    public void updateCurrentTemperature(double newTemperature) {
        if (newTemperature >= minimumTemperature && newTemperature <= maximumTemperature) {
            this.currentTemperature = newTemperature;
        }else {
            throw new IllegalArgumentException("The temperature entered is invalid");
        }
    }

    public void showTemperatureInformation() {
        System.out.println("---Temperature Information---");
        System.out.println("Current Temperature: " + this.currentTemperature);
        System.out.println("Desired Temperature: " + this.desiredTemperature);
        System.out.println("Minimum Temperature: " + this.minimumTemperature);
        System.out.println("Maximum Temperature: " + this.maximumTemperature);
    }
}
