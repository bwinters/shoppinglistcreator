package com.brandonwinters.shoppinglistcreator.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "stores")
public class Stores {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String storeName;
    private String storeLocation;
    private String storePhone;
    private String storeWebsite;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getStoreName () {
        return storeName;
    }

    public void setStoreName (String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation () {
        return storeLocation;
    }

    public void setStoreLocation (String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStorePhone () {
        return storePhone;
    }

    public void setStorePhone (String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreWebsite () {
        return storeWebsite;
    }

    public void setStoreWebsite (String storeWebsite) {
        this.storeWebsite = storeWebsite;
    }
}
