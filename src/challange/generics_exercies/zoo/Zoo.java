package challange.generics_exercies.zoo;

import java.util.ArrayList;

public class Zoo<T extends Animal> {
    private ArrayList<T> animals;

    public Zoo() {
        this.animals = new ArrayList<T>();
    }

    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    public void printAllAnimals() {
        for (T animal : this.animals) {
            System.out.println(animal);
        }
    }

}
