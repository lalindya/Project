package com.test.inova.fashion.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.test.inova.fashion.R;
import com.test.inova.fashion.main.FirstPageActivity;
import com.test.inova.fashion.main.ItemGridActivity;
import com.test.inova.fashion.main.MensActivity;
import com.test.inova.fashion.pojo.ListPojo;

import java.util.List;

/**
 * Created by INOVA on 8/23/2017.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder>{

    Context context;
    List<ListPojo> categorytList;
    CategoriesAdapter.ViewHolder viewHolder;
    public CategoriesAdapter(Context context, List<ListPojo> categorytList)
    {
        this.context = context;
        this.categorytList = categorytList;

    }

    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.categories_design, parent, false);
        CategoriesAdapter.ViewHolder vh = new CategoriesAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CategoriesAdapter.ViewHolder holder, int position) {
        final ListPojo ListPojo = categorytList.get(position);
//        Glide.with(context).load(productPojo.getImageUrl()).into(holder.imageViewItem);
        Glide.with(context)
                .load(ListPojo.getImageUrl())
                .thumbnail(0.5f)
                .crossFade()
                .placeholder(R.mipmap.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView5);

        holder.category_name.setText(ListPojo.getCategory_name());

    }

    @Override
    public int getItemCount() {
        return categorytList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView category_name;
        ImageView imageView5;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            category_name = itemView.findViewById(R.id.textView4);
            imageView5 = itemView.findViewById(R.id.imageView2);
        }

        @Override
        public void onClick(View view) {
            
        }
    }
}

