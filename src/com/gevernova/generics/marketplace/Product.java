package com.gevernova.generics.marketplace;

class Product<T> {
    private String name;
     private double price;
     private T category;

     // constructor
    public Product(String name, double price, T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    // getter
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public T getCategory(){
        return category;
    }
    // to apply a discount to the product
    public void applyDiscount(double percentage){
        this.price = this.price * (1 - percentage/100);
    }
    @Override
    public String toString(){
        return "Product[name=" + name + ", price=" + price + ", category=" + category.getClass().getSimpleName() + "]";
    }
}
