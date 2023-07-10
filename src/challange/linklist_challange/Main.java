package challange.linklist_challange;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            animals.add(new Animal(Animal.randomAnimal()));
        }

        animals.removeFirst();
        animals.removeLast();

        animals.addFirst(new Animal("Tiger"));
        animals.addLast(new Animal("Lion"));

        ListIterator<Animal> iterator = animals.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
