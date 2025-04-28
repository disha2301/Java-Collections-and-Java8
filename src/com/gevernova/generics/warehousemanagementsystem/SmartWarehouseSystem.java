package com.gevernova.generics.warehousemanagementsystem;

import java.util.List;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Create a Storage instance for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone", 699.99, "Samsung"));
        electronicsStorage.addItem(new Electronics("Laptop", 999.99, "Dell"));

        // Create a Storage instance for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 1.99, "2023-12-31"));
        groceriesStorage.addItem(new Groceries("Eggs", 2.49, "2023-11-15"));

        // Create a Storage instance for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 49.99, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 129.99, "Metal"));

        // Display all items using wildcards
        System.out.println("Displaying Electronics:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nDisplaying Groceries:");
        displayItems(groceriesStorage.getItems());

        System.out.println("\nDisplaying Furniture:");
        displayItems(furnitureStorage.getItems());
    }

    // Method to display items using wildcards
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}
