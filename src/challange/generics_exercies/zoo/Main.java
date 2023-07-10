package challange.generics_exercies.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("Tygrysek", 3));
        zoo.addAnimal(new Lion("Lwek4", 13));
        zoo.addAnimal(new Tiger("Tygrysek3", 12));
        zoo.addAnimal(new Tiger("Tygrysek2", 6));
        zoo.addAnimal(new Lion("Lwek", 1));
        zoo.addAnimal(new Tiger("Tygrysek4", 5));
        zoo.addAnimal(new Lion("Lwek", 7));
        zoo.addAnimal(new Lion("Lwek3", 15));
        zoo.addAnimal(new Tiger("Tygrysek1", 2));
        zoo.addAnimal(new Lion("Lwek1", 6));

        zoo.printAllAnimals();
    }
}
