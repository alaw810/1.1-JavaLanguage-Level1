package ex1;

public abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("\nInstrument class loaded into memory.");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void sayHello(){
        System.out.println("Hello from the Instrument class.");
    }

    public abstract void play();

    @Override
    public String toString() {
        return "- Instrument: " + name + " - Price: " + price;
    }

}
