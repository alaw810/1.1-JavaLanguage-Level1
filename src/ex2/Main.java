public class Main {
    public static void main(String[] args) {

        // Exercise 1 - Code Block 1. Creating three objects, the Instrument class is loaded once.
        System.out.println("\nExercise 1:");
        PercussionInstrument percussion1 = new PercussionInstrument("Tambourine", 13.90);
        StringInstrument string1 = new StringInstrument("Violin", 139.90);
        WindInstrument wind1 = new WindInstrument("Flute", 39);

        percussion1.play();
        string1.play();
        wind1.play();

        // Exercise 1 - Code Block 2. Accessing a static member also loads the class.
        System.out.println("Accessing Instrument.objectType:" + Instrument.objectType);

        // Exercise 2
        System.out.println("\nExercise 2:");
        System.out.println("Brand: " + Car.getBrand());
        Car.setModel("León");
        System.out.println("Model: " + Car.getModel());

        Car.brake();

        Car car1 = new Car("Arona", 95);

        System.out.println("Power: " + car1.getPower());
        System.out.println("Model: " + Car.getModel());

        car1.accelerate();


    }
}
