package challange.hashset_challange;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        System.out.println(names);
        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("Dodge"));
        cars.add(new Car("Citroen"));
        cars.add(new Car("Opel"));
        cars.add(new Car("Opel"));
        System.out.println("\n" + cars);


    }
}
