package level2_Composition.exercise05_car_engine;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, String engineModel, int horsePower) {
        this.brand = brand;
        this.setModel(model);
        this.setEngine(engineModel, horsePower);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("The model is invalid");
        }else {
            this.model = model;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    private void setEngine(String engineModel, int horsePower) {
        if (engineModel == null || horsePower <= 0) {
            throw new IllegalArgumentException("The needs an engine");
        } else {
            this.engine = new Engine(engineModel, horsePower);
        }
    }

    public void showCarInformation() {
        System.out.println("---Car Information---");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        engine.showEngineInformation();
        System.out.println("----------------------");
    }
}
