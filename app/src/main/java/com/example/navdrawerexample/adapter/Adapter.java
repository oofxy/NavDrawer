package com.example.navdrawerexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.navdrawerexample.Model;
import com.example.navdrawerexample.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    Context context;
    ArrayList<Model> modelMakananKhas;

    public Adapter(Context context, ArrayList<Model> modelMakananKhas) {
        this.context = context;
        this.modelMakananKhas = modelMakananKhas;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_layout, parent, false);
        return new Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.tvNama.setText(modelMakananKhas.get(position).getNama());
        Glide.with(context)
                .load(modelMakananKhas.get(position).getImg())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return modelMakananKhas.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvNama);
            img = itemView.findViewById(R.id.img);
        }
    }
}
