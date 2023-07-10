package challange.truck2;

public class Truck {
    private String producent, model, color;
    private int wheels;
    private final int TOP_SPEED = 100;
    private final int ACCELERATION;

    public Truck() {
        this.producent = "Freightliner";
        this.model = "9664";
        this.wheels = 6;
        this.ACCELERATION = 60;
    }

    public Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Producent: " + this.producent + " Color: " + this.color);
    }
}
