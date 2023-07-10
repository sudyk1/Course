package com.example.oop.basics.inheritance.polimorphism_casting;

class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee() {
        this.name = "unknown";
        this.jobTitle = "unknown";
        this.salary = 4000;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("Work work work!");
    }

    public void printInfo() {
        System.out.println("Employee: " + this.name);
    }
}

class Manager extends Employee {
    private String departmentName;

    public Manager() {
        this.departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee() {
        System.out.println("Employee hired!");
    }

    public void giveRise(Employee employee) {
        System.out.println("Employee got rise!");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void doWork() {
        System.out.println("Managing!".repeat(3));
    }

    public void printInfo() {
        System.out.println("Manager: " + this.getName());
    }
}

class CEO extends Manager {
    private int sharesNumber;

    public CEO() {
    }

    public CEO(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public void signContract() {
        System.out.println("Contract signed!");
    }

    public void doWork() {
        System.out.println("CEOing!");
    }

    public void printInfo() {
        System.out.println("CEO: " + this.getName());
    }
}


public class CompanyCastingExample {
    public static void main(String[] args) {

        Employee employee = new Employee("Adam", "programmer", 10000);
        Manager manager =  new Manager("Jan", "Team Leader", 10000, "R&D");
        Employee employeeCeo = new CEO("Tosiek", "GOK", 12000, "Board of Directors", 13000);


        CEO ceo;
        if (employeeCeo instanceof CEO) {
            ceo = (CEO) employeeCeo;
            ceo.signContract();
        }



    }
}
