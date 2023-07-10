package challange.arraylist_challange;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        System.out.printf("indeks 0: %s %n", names.get(0));

        names.set(2, "Olek");
        names.add(1, "Karol");
        names.remove(0);

        System.out.println("Elementy:");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
