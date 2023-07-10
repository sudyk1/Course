package challange.homesChallange;

public class House extends Flat {

    private float parcelSize;

    public House(String city, String street, float parcelSize) {
        super(city, street);
        this.parcelSize = parcelSize;
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House " +
                " in city " + this.getCity() +
                " on street " + this.getStreet() +
                " of parcel size: " + this.getParcelSize();
    }
}
