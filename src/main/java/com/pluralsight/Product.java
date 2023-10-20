package com.pluralsight;

public class Product {
    private String name;
    private String SKU;
    private double price;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", SKU='" + SKU + '\'' +
                ", price=" + price +
                ", department='" + department + '\'' +
                '}';
    }

    public Product(String name, String SKU, double price, String department) {
        this.name = name;
        this.SKU = SKU;
        this.price = price;
        this.department = department;


    }
}
}
