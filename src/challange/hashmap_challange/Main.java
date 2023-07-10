package challange.hashmap_challange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Animal> map = new HashMap<>();
        String[] names = {"Kot", "Pies", "Koza", "Puma"};
        for (String name : names) {
            map.put(name, new Animal(name));
        }

        System.out.println(map.get("Puma"));

        for (Map.Entry<String, Animal> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\n");

        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            String key = (String) me.getKey();
            Animal value = (Animal) me.getValue();
            System.out.println(key + " " + value);
        }

    }
}
