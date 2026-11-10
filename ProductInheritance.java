
package com.example;

class Product {

    int productId;
    double price;

    Product(int productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {

    Electronics(int productId, double price) {
        super(productId, price);
    }

    void displayCategory() {
        System.out.println("Category: Electronics");
        displayDetails();
    }
}

class Clothing extends Product {

    Clothing(int productId, double price) {
        super(productId, price);
    }

    void displayCategory() {
        System.out.println("Category: Clothing");
        displayDetails();
    }
}

class Books extends Product {

    Books(int productId, double price) {
        super(productId, price);
    }

    void displayCategory() {
        System.out.println("Category: Books");
        displayDetails();
    }
}

public class ProductInheritance {

    public static void main(String[] args) {

        Electronics e = new Electronics(101, 25000);

        Clothing c = new Clothing(102, 1500);

        Books b = new Books(103, 500);

        e.displayCategory();

        System.out.println("----------------");

        c.displayCategory();

        System.out.println("----------------");

        b.displayCategory();
    }
}
