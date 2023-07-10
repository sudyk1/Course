package challange.homesChallange;

public class Residence extends House {

    private float garageSize;

    public Residence(String city, String street, float parcelSize, float garageSize) {
        super(city, street, parcelSize);
        this.garageSize = garageSize;
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return "Residence " +
                " in city " + this.getCity() +
                " on street " + this.getStreet() +
                " of parcel size: " + this.getParcelSize() +
                " and garage size of: " + this.getGarageSize();
    }
}
