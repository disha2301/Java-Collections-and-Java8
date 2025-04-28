package com.gevernova.generics.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// generic storage class
class Storage<T extends WarehouseItem>{
    private List<T> items;
    public Storage(){
        this.items = new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }
    public List<T> getItems(){
        return items;
    }
    public void displayAllItems(){
        for(T item : items){
            item.displayDetails();
        }
    }
}