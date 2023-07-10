package challange.homesChallange;

public class Main {
    public static void main(String[] args) {

        Flat[] homes = new Flat[10];

        for (int i = 0; i < homes.length; i++) {
            int random = (int)(Math.random() * 3);
            if (random == 0) {
                homes[i] = new Flat("Kraków", "Dauna");
            } else if (random == 1) {
                homes[i] = new House("Gdańsk", "Morska", 120.0f);
            } else if (random == 2) {
                homes[i] = new Residence("Warszawa", "Mazowiecka", 300.0f, 40.0f);
            }
        }

        System.out.println();
        int counter = 0;
        for (Flat home : homes) {
            ++counter;
            if (home instanceof Residence) {
                Residence residence = (Residence) home;
                System.out.println(counter + ". Garage size: " + residence.getGarageSize());
                System.out.println(residence + "\n");
            } else if (home instanceof House) {
                House house = (House) home;
                System.out.println(counter + ". Parcel size: " + house.getParcelSize());
                System.out.println(house + "\n");
            } else {
                System.out.println(counter + ". " + home + "\n");
            }
        }


    }
}
