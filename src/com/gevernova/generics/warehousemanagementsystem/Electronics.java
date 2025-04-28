package com.gevernova.generics.warehousemanagementsystem;
// concrete subclass
class Electronics extends WarehouseItem{
    private String brand;
    // constructor
    public Electronics(String name, double price, String brand){
        super(name, price);
        this.brand = brand;
    }
    @Override
    public void displayDetails(){
        System.out.println("Electronics Item: " + getName() + ", Price: " + getPrice() + ", Brand: " + brand);
    }
}