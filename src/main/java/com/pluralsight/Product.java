package com.pluralsight;

public class Product {

    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;


    }

    }
