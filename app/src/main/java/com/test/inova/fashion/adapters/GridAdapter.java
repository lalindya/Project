package com.test.inova.fashion.adapters;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.test.inova.fashion.R;
import com.test.inova.fashion.pojo.ListPojo;

import java.util.List;

/**
 * Created by INOVA on 8/27/2017.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    Context context;
    List<ListPojo> listPojo;
    GridAdapter.ViewHolder viewHolder;

    public GridAdapter(Context context, List<ListPojo> listPojo) {
        this.context = context;
        this.listPojo = listPojo;

    }

    public GridAdapter(FragmentActivity activity, GridAdapter gridAdapter) {

    }

    @Override
    public GridAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.grid_design, parent, false);
        GridAdapter.ViewHolder vh = new GridAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(GridAdapter.ViewHolder holder, int position) {
        final ListPojo ListPojo = listPojo.get(position);
//        Glide.with(context).load(productPojo.getImageUrl()).into(holder.imageViewItem);
        Glide.with(context)
                .load(ListPojo.getImageUrl())
                .thumbnail(0.5f)
                .crossFade()
                .placeholder(R.mipmap.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageurl);

        holder.item_name.setText(ListPojo.getCategory_name());
        holder.price.setText(ListPojo.getPrice());
        holder.like.setText(ListPojo.getLike());
        holder.dislike.setText(ListPojo.getDislike());

    }

    @Override
    public int getItemCount() {
        return listPojo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView item_name;
        ImageView imageurl;
        TextView like;
        TextView dislike;
        TextView price;

        public ViewHolder(View itemView) {
            super(itemView);

            item_name = itemView.findViewById(R.id.item_name);
            like = itemView.findViewById(R.id.like);
            dislike=itemView.findViewById(R.id.dislike);
            price=itemView.findViewById(R.id.price);
            imageurl=itemView.findViewById(R.id.item_image);
        }
    }
}