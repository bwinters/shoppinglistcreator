package com.brandonwinters.shoppinglistcreator.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.brandonwinters.shoppinglistcreator.model.Stores;

@Database(entities = {Stores.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase instance;
    public abstract StoresDAO storesDAO();

    public static AppDatabase getDataBase(Context context) {
        if (instance == null) {
            synchronized (AppDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "app_database").build();
                }
            }
        }
        return instance;
    }
}
