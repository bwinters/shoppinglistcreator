package com.brandonwinters.shoppinglistcreator.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.brandonwinters.shoppinglistcreator.R;
import com.brandonwinters.shoppinglistcreator.viewmodel.StoresViewModel;

public class StoresFragment extends Fragment {
    private StoresViewModel storesViewModel;
    private RecyclerView recyclerView;
    private StoresAdapter storesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stores, container, false);

        recyclerView = view.findViewById(R.id.stores_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setHasFixedSize(true);

        storesAdapter = new StoresAdapter();
        recyclerView.setAdapter(storesAdapter);

        storesViewModel = new ViewModelProvider(this).get(StoresViewModel.class);
        storesViewModel.getAllStores().observe(getViewLifecycleOwner(), stores -> {
            storesAdapter.setStoresList(stores);
        });

        return view;
    }
}
