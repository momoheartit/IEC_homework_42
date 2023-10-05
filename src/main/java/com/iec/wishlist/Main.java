package com.iec.wishlist;

public class Main {

    public static void main(String[] args)
    {
        Wishlist w = new Wishlist();
        
        w.getAllItems();
        
        w.addItem("Nokedli", 10);
        w.addItem("Pörkölt", 20);
        w.addItem("Koviubi", 30);
        
        w.getAllItems();
        
        w.addMoney(30);
        
        w.getAllItems();
        
        w.addMoney(100);
        
        w.getAllItems();
        
    }
    
    
}
