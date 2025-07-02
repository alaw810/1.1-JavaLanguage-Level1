public abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("Instrument class loaded.");
    }

    public static String objectType = "Instrument";

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play();

}
