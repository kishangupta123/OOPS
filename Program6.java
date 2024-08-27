package OOPS;
/*
 * Write a Java program to create a class called "Employee"
 * with a name, job title, and salary attributes,
 * and methods to calculate and update salary.
 * */

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
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

    public void setJob(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
//        double raise = salary * percentage /100;
//        salary = salary + raise;

        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class Program6 {
    public static void main(String[] args) {
        Employee E1 = new Employee("Kishan", "Software Engineer", 60000.0);
        Employee E2 = new Employee("Kumara", "Team Lead", 75000.0);

        System.out.println("\nCurrent Scenario");
        E1.printEmployeeDetails();
        System.out.println();
        E2.printEmployeeDetails();

        E1.raiseSalary(8);
        E2.raiseSalary(12);

        System.out.println("\nUpdated Scenario ");

        E1.printEmployeeDetails();
        System.out.println();
        E2.printEmployeeDetails();
    }
}
