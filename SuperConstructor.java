
package com.example;

class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Person Constructor Called");
    }
}

class Student extends Person {

    int rollNumber;

    Student(String name, int age, int rollNumber) {

        super(name, age);

        this.rollNumber = rollNumber;

        System.out.println("Student Constructor Called");
    }

    void display() {

        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class SuperConstructor {

    public static void main(String[] args) {

        Student s = new Student("Arun", 22, 101);

        s.display();
    }
}
