package level2_Composition.exercise05_car_engine;

public class Engine {
    private String model;
    private int horsePower;

    public Engine(String model, int horsePower) {
        this.setModel(model);
        this.setHorsePower(horsePower);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("The model is invalid");
        } else {
            this.model = model;
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower <= 0) {
            throw new IllegalArgumentException("The horsepower must be greater than 0");
        } else {
            this.horsePower = horsePower;
        }
    }

    public void showEngineInformation() {
        System.out.println("---Engine Information");
        System.out.println("Model: " + this.getModel());
        System.out.println("HorsePower: " + this.getHorsePower());
    }
}
