package ex1;

public class StringInstrument extends Instrument{
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("StringInstrument class loaded into memory.");
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}
