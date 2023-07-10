package challange.bikeChallange;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("TREK", "XC202");
        MotorBike motorBike = new MotorBike("Yamaha", "R300");

        bike.printInfo();
        motorBike.printInfo();
    }
}
