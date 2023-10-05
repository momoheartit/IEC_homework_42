package com.iec.wishlist;

class Item
{
    public String name;
    public double value;
    public double savedAmount;
    
    Item(String name, double value) {
        this.name = name;
        this.value = value;
        this.savedAmount = 0;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
    
    public double getSavedAmount () {
        return savedAmount;
    }
    
    public double addAmount(double amount) {
        return savedAmount = amount;
    }
    
    
}
