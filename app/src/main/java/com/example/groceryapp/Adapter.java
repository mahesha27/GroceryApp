package com.example.groceryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Item> items;

    public Adapter(ArrayList<Item> items) {
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        boolean attachToRoot;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder,parent,false);
        return new ViewHolder();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvItemName.setText(items.get(position).getItemName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvItemName;
        private View itemView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemName= itemView.findViewById(R.id.tvItemName);
            this.itemView = itemView;
        }

        public ViewHolder(@NonNull View itemView) {
            super();
        }
    }


}
