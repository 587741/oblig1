package com.example.mythirdtry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter <RecycleViewAdapter.MyViewHolder> {
    List<Dyr> dyrList;
    Context context;

    public RecycleViewAdapter(List<Dyr> dyrList, Context context) {
        this.dyrList = dyrList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_dyr,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_navn.setText(dyrList.get(position).getNavn());
        Glide.with(this.context).load(dyrList.get(position).getImageURL()).into(holder.iv_dyrBilde);
    }

    @Override
    public int getItemCount() {
        return dyrList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView iv_dyrBilde;
    TextView tv_navn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_dyrBilde= itemView.findViewById(R.id.iv_dyrBildet);
            tv_navn = itemView.findViewById(R.id.tv_dyrNavn);
        }
    }
}
