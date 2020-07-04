package com.example.groceryapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Grocery")

public class Item {
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "itemname")
    private String itemName;

    public Item(int i, String itemname) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

