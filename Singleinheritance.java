
package com.example;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void display() {
        System.out.println("Developer Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Language: " + programmingLanguage);
    }
}

class Tester extends Employee {

    String testingTool;

    Tester(String name, double salary, String testingTool) {
        super(name, salary);
        this.testingTool = testingTool;
    }

    void display() {
        System.out.println("Tester Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Testing Tool: " + testingTool);
    }
}

public class Singleinheritance {

    public static void main(String[] args) {

        Developer d = new Developer("Arun", 40000, "Java");

        Tester t = new Tester("Ravi", 35000, "Selenium");

        d.display();

        System.out.println("----------------");

        t.display();
    }
}
