package com.consume.API.consume.model;

public class Car {

    private int id;
    private String brand;
    private String carmodel;
    private int price;

    public Car() { }

    public Car(String brand, String carmodel, int price) {
        this.brand = brand;
        this.carmodel = carmodel;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

}