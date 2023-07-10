package challange.employeechallange;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Administrator administrator = new Administrator("Kasia","Basia", "Scrum");
        Programmer programmer = new Programmer("Adam", "Kowal", "Java");

        employee1.printInfo();
        administrator.printInfo();
        programmer.printInfo();


    }
}
