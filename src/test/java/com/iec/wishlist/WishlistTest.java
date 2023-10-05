package com.iec.wishlist;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class WishlistTest {

    private Wishlist wishlist;

    @Before
    public void setUp() {
        wishlist = new Wishlist();
    }

    @Test
    public void testAddItem() {
        wishlist.addItem("TestItem", 50);
        assertEquals(1, wishlist.getCountItems());
    }

    @Test
    public void testAddMoney() {
        wishlist.addMoney(30);
        assertEquals(30, wishlist.getMoney(), 0);
    }

    @Test
    public void testCheckIfItemFull() {
        wishlist.addItem("TestItem", 50);
        wishlist.addMoney(60);
        assertEquals(0, wishlist.getCountItems());
    }

    @Test
    public void testGetAllItems() {
        wishlist.addItem("Item1", 30);
        wishlist.addItem("Item2", 40);
        assertEquals(2, wishlist.getCountItems());
    
        wishlist.getAllItems();
    }
}
