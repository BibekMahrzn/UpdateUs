package com.example.updateme;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rajesh on 3/5/16.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyHolder> {

    Context context;

    public MyRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MyRecyclerViewAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_layout, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.MyHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ConstructionDetailActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public MyHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
        }
    }
}
