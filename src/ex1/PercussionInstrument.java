package ex1;

public class PercussionInstrument extends Instrument{
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("PercussionInstrument class loaded into memory.");
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}