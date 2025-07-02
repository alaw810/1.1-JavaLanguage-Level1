package ex2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Brand: " + Car.getBrand());
        Car.setModel("León");
        System.out.println("Model: " + Car.getModel());

        Car.brake();

        Car car1 = new Car("Arona", 95);

        System.out.println("Model: " + Car.getModel());
        System.out.println("Power: " + car1.getPower());

        car1.accelerate();


    }
}
