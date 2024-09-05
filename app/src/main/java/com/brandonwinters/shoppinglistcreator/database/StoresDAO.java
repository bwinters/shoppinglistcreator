package com.brandonwinters.shoppinglistcreator.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;

import com.brandonwinters.shoppinglistcreator.model.Stores;

import java.util.List;

@Dao
public interface StoresDAO {

    @Query("SELECT * FROM stores")
    LiveData<List<Stores>> getAllStores();

    @Insert
    void insertStore(Stores store);

    @Update
    void updateStore(Stores store);

    @Delete
    void deleteStore(Stores store);
}
