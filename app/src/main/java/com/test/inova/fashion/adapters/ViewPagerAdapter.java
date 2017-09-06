package com.test.inova.fashion.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.test.inova.fashion.main.FirstPageActivity;
import com.test.inova.fashion.R;

/**
 * Created by INOVA on 8/21/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    //private ImageView imageView;
    // private int[] imgs = {R.drawable.imagesa, R.drawable.imagesb, R.drawable.imagesc, R.drawable.images};
    private LayoutInflater inflater;
    private Context context;
    int[] imager;

    public ViewPagerAdapter(FirstPageActivity firstPageActivity, int[] img)
    {
        this.context = firstPageActivity;
        this.imager = img;
    }
    @Override
    public int getCount() {
        return imager.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       // ImageView imageView;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = inflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image);
        imageView.setImageResource(imager[position]);
        container.addView(item_view);

        ((ViewPager)container).addView(item_view);

        return item_view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView((LinearLayout)object);
    }
}
