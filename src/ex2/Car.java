public class Car {
    private static final String brand = "Seat";
    private static String model;
    private final int power;

    public Car(String modelInput, int power) {
        model = modelInput;
        this.power = power; // Initialized in the constructor
    }

    public static String getBrand() {
        return brand;
    }
    public static String getModel() {
        return model;
    }
    public static void setModel(String newModel) {
        model = newModel;
    }
    public int getPower() {
        return power;
    }


    public static void brake() {
        System.out.println("The car is braking.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

}
