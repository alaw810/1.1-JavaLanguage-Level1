package ex1;

public class WindInstrument extends Instrument{
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("WindInstrument class loaded into memory.");
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }

}
