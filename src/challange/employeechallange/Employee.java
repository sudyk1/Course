package challange.employeechallange;

public class Employee {
   public String name, surname;

   public Employee() {
       this.name = "Jan";
       this.surname = "Kowalski";
   }

   public Employee(String name, String surname) {
       this.name = name;
       this.surname = surname;
   }

   public void printInfo() {
       System.out.println("Dane: " + this.name + " " + this.surname);
   }
}
