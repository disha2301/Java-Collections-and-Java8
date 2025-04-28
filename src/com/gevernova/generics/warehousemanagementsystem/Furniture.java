package com.gevernova.generics.warehousemanagementsystem;

// concrete subclass
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture Item: " + getName() + ", Price: " + getPrice() + ", Material: " + material);
    }
}
