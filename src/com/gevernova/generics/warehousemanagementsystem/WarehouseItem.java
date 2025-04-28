package com.gevernova.generics.warehousemanagementsystem;

// abstract base class
abstract class WarehouseItem{
    private String name;
    private double price;

    // constructor
    public WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }
    // getter
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public abstract void displayDetails();
}