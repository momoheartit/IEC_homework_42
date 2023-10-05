package com.iec.wishlist;

import java.util.ArrayList;
import java.util.Iterator;

public class Wishlist {

    private ArrayList<Item> items = new ArrayList<>();
    private double money = 0;
    private int countItems = 0;

    public void addItem(String name, int value) {
        Item newItem = new Item(name, value);
        items.add(newItem);
        countItems = items.size();
    }

    public int getCountItems() {
        return countItems;
    }

    void addMoney(int plusMoney) {
        money += plusMoney;
        lines();
        System.out.println("You added: " + plusMoney + " $");
        System.out.println("Now you have " + money + " $");

        checkIfItemFull();
    }

    void checkIfItemFull() {
        if (countItems > 0) {
            double amountPerItem = money / countItems;
            for (Iterator<Item> iterator = items.iterator(); iterator.hasNext();) {
                Item item = iterator.next();
                item.addAmount(amountPerItem);
                if (amountPerItem >= item.getValue()) {
                    lines();
                    System.out.println("You just collected: " + item.getName() + " (" + item.getValue() + " $)");
                    money -= item.getValue();
                    System.out.println("You're actual money is: " + money + " $");
                    iterator.remove();
                    countItems--;
                }
            }
        }
    }

    void getAllItems() {
        lines();
        if (countItems > 0) {
            for (Item item : items) {
                System.out.println(" || Name: " + item.getName()
                        + ", Value: " + item.getValue()
                        + ", Saved: " + item.getSavedAmount());
            }
        } else if (countItems <= 0) {
            System.out.println("You don't have any wish yet.");
        }
    }

    public static void lines() {
        int lines = 30;
        for (int i = 0; i < lines; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public double getMoney() {
        return money;
    }
}
