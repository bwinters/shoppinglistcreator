package com.brandonwinters.shoppinglistcreator.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.brandonwinters.shoppinglistcreator.database.AppDatabase;
import com.brandonwinters.shoppinglistcreator.model.Stores;

import java.util.List;

public class StoresViewModel extends AndroidViewModel {
    private LiveData<List<Stores>> allStores;

    public StoresViewModel (Application application) {
        super(application);
        AppDatabase database = AppDatabase.getDataBase(application);
        allStores = database.storesDAO().getAllStores();
    }

    public LiveData<List<Stores>> getAllStores() {
        return allStores;
    }
}
