package challange.employeechallange;

public class Administrator extends Employee {
    public String certificates;

    public Administrator(String name, String surname, String certificates) {
        this.name = name;
        this.surname = surname;
        this.certificates = certificates;
    }

    public void printInfo() {
        System.out.println("Dane: " + this.name + " " + this.surname + " || Certyfikaty: " + this.certificates);
    }


}
