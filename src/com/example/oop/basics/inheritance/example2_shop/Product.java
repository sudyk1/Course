package com.example.oop.basics.inheritance.example2_shop;

//   klasa Product (zmienne: price, name, manufacturer, productionYear)

public class Product {
    protected int price;
    protected String name, manufacturer;
    protected int productionYear;

    public Product() {
        this.price = 100;
        this.name = "default";
        this.manufacturer = "default";
        this.productionYear = 2010;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
