package com.brandonwinters.shoppinglistcreator.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brandonwinters.shoppinglistcreator.R;
import com.brandonwinters.shoppinglistcreator.model.Stores;

import java.util.ArrayList;
import java.util.List;

public class StoresAdapter extends RecyclerView.Adapter<StoresAdapter.StoresViewHolder> {
    private List<Stores> storesList = new ArrayList<>();

    @NonNull
    @Override
    public StoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store, parent, false);
        return new StoresViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StoresViewHolder holder, int position) {
        Stores currentStore = storesList.get(position);
        holder.storeName.setText(currentStore.getStoreName());
        holder.storeLocation.setText(currentStore.getStoreLocation());
        holder.storePhone.setText(currentStore.getStorePhone());
        holder.storeWebsite.setText(currentStore.getStoreWebsite());
    }

    @Override
    public int getItemCount() {
        return storesList.size();
    }

    public void setStoresList (List<Stores> storesList) {
        this.storesList = storesList;
        notifyDataSetChanged();
    }

    class StoresViewHolder extends RecyclerView.ViewHolder {
        private TextView storeName;
        private TextView storeLocation;
        private TextView storePhone;
        private TextView storeWebsite;

        public StoresViewHolder(@NonNull View itemView) {
            super(itemView);
            storeName = itemView.findViewById(R.id.store_name);
            storeLocation = itemView.findViewById(R.id.store_location);
            storePhone = itemView.findViewById(R.id.store_phone);
            storeWebsite = itemView.findViewById(R.id.store_website);
        }
    }
}
