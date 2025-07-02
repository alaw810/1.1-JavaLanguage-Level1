package ex1;

public class Main {
    public static void main(String[] args) {

        // Calling a static method from Instrument loads the class into memory
        System.out.println("\nSTEP 1: Calling static method on Instrument");
        Instrument.sayHello();

        // Creating two PercussionInstrument instances:
        // - Instrument class was already loaded (from sayHello())
        // - PercussionInstrument class loads once, then reused
        System.out.println("\nSTEP 2: Creating two PercussionInstrument instances");
        PercussionInstrument percussion1 = new PercussionInstrument("Tambourine", 13.90);
        System.out.println(percussion1);
        PercussionInstrument percussion2 = new PercussionInstrument("Drums", 123.00);
        System.out.println(percussion2);

        // StringInstrument class is loaded
        System.out.println("\nSTEP 3: Creating StringInstrument instance");
        StringInstrument string1 = new StringInstrument("Violin", 139.90);
        System.out.println(string1);

        // WindInstrument class is loaded
        System.out.println("\nSTEP 4: Creating WindInstrument instance");
        WindInstrument wind1 = new WindInstrument("Flute", 39);
        System.out.println(wind1);

        System.out.println("\nSTEP 5: Playing instruments");
        percussion1.play();
        percussion2.play();
        string1.play();
        wind1.play();

    }
}
