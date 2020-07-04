package com.example.groceryapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ItemDAO {

    @Insert
    void insertItem(Item item);

    Object getAllItems();

    @Query(("select * from Grocery");
    List<Item> getAllItems();

}
