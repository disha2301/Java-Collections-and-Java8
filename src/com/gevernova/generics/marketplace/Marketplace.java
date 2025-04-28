package com.gevernova.generics.marketplace;

public class Marketplace {
    public static void main(String[] args){
        // create a book product
        Product<BookCategory> book = new Product<>("Book 1", 100.00, new BookCategory());
        System.out.println(book);
        // Apply a 10% discount to the book
        book.applyDiscount(10);
        System.out.println(book); // after discount
        Product<ClothingCategory> tShirt = new Product<>("levis",7000, new ClothingCategory());
        System.out.println(tShirt); // Before discount

        // Apply a 5% discount to the T-shirt
        tShirt.applyDiscount(5);
        System.out.println(tShirt); // After discount
        // Create a gadget product
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 500.0, new GadgetCategory());
        System.out.println(gadget); // Before discount

        // Apply a 15% discount to the gadget
        gadget.applyDiscount(15);
        System.out.println(gadget); // After discount
    }
}
