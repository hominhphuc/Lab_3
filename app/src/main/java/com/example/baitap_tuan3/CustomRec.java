package com.example.baitap_tuan3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomRec extends RecyclerView.Adapter<CustomRec.ViewHolder> {
    ArrayList<Flower> mChairs;

    public CustomRec(ArrayList<Flower> chairs) {
        mChairs = chairs;
    }

    @NonNull
    @Override

    public CustomRec.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return mChairs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Flower mChair;
        ImageView img;
        TextView txtName, txtPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgAnh);
            txtName = itemView.findViewById(R.id.txtName);
            txtPrice = itemView.findViewById(R.id.txtPrice);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull CustomRec.ViewHolder holder, int position) {
        Flower chair = mChairs.get(position);
        holder.mChair = chair;
        holder.img.setImageResource(chair.getAnh());
        holder.txtName.setText(chair.getName());
        holder.txtPrice.setText(chair.getPrice()+" $");
    }
}
