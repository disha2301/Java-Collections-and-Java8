package com.gevernova.generics.warehousemanagementsystem;

// concrete subclass
class Groceries extends WarehouseItem {
    private String expirationDate;

    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries Item: " + getName() + ", Price: " + getPrice() + ", Expiration Date: " + expirationDate);
    }
}