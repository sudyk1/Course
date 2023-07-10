package challange.linklist_challange;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + this.name;
    }

    public static String randomAnimal() {
        String[] animals = {"Dog", "Cat", "Tiger", "Lion", "Panda"};
        int random = (int) (Math.random() * animals.length);
        return animals[random];
    }

}
