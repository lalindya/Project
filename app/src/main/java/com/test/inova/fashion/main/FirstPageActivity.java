package com.test.inova.fashion.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.test.inova.fashion.adapters.ViewPagerAdapter;
import com.test.inova.fashion.R;

import me.relex.circleindicator.CircleIndicator;

public class FirstPageActivity extends AppCompatActivity {

    private static final String TAG = "FIRST_PAGE";
    TextView product_name;
    TextView likes;
    TextView dislike;
    TextView description;
    TextView share;

    ViewPager viewPager;
    ViewPagerAdapter adapter;
    private static int currentpage = 0;
    private static int numpagers = 0;
    int[] imgs;
    private CustomPagerAdapter mCustomPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        imgs = new int[]{R.drawable.images, R.drawable.imagesa, R.drawable.imagesb, R.drawable.imagesc, R.drawable.images};
        product_name = (TextView) findViewById(R.id.product_name);
        likes = (TextView) findViewById(R.id.like);
        dislike = (TextView) findViewById(R.id.dislike);
        description=(TextView)findViewById(R.id.description);
        share=(TextView)findViewById(R.id.share);

        if (currentpage == 0)
            product_name.setText("Levi’s Jeans");

//        adapter = new ViewPagerAdapter(FirstPageActivity.this, imgs);
//        viewPager.setAdapter(adapter);

        mCustomPagerAdapter = new CustomPagerAdapter(this);
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(mCustomPagerAdapter);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position)

            {


                switch (position) {
                    case 0:
                        product_name.setText("Levi’s Jeans");
                        likes.setText("20k");
                        likes.setText("40k");
                        likes.setText("5k");
                        description.setText("Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. ");

                        break;
                    case 1:
                        product_name.setText("2");
                        likes.setText("30k");
                        likes.setText("50k");
                        likes.setText("5k");
                        description.setText("Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. ");

                        break;
                    case 3:
                        product_name.setText("3");
                        likes.setText("70k");
                        likes.setText("40k");
                        likes.setText("5k");
                        description.setText("Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. ");

                        break;
                    case 4:
                        product_name.setText("4");
                        likes.setText("20k");
                        likes.setText("40k");
                        likes.setText("5k");
                        description.setText("Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. ");

                        break;
//                    default:
//                        product_name.setText("lalalalllaa");

                }
                Log.d(TAG, "onPageSelected: " + position);
            }

            public final int getCurrentPage() {
                return currentpage;
            }

            @Override
            public void onPageScrollStateChanged(int position) {
//                Log.d(TAG, "onPageScrollStateChanged: " + position);
//                if (position == ViewPager.SCROLL_STATE_IDLE) {
//                    int pagecount = imgs.length;
//                    if (currentpage == 0) {
//                        product_name.setText("lalalalllaa");
//                        Log.d(TAG, "onPageScrollStateChanged: " + position);
//                    }
//                }
            }

        });
//        final Handler handler = new Handler();
//        final Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                if (currentpage == numpagers) {
//                    currentpage = 0;
//
//                }
//                viewPager.setCurrentItem(currentpage++, true);
//            }
//        };


//            @Override
//            private void init() {
//                for(int i=0;i<imgs.length;i++)
//
//
//                adapter.setAdapter(new ViewPagerAdapter(getActivity(),imgs));
//
//                indicator.setViewPager(adapter);
    }

    class CustomPagerAdapter extends PagerAdapter {

        Context mContext;
        LayoutInflater mLayoutInflater;

        public CustomPagerAdapter(Context context) {
            mContext = context;
            mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((LinearLayout) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View itemView = mLayoutInflater.inflate(R.layout.swipe_layout, container, false);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
            imageView.setImageResource(imgs[position]);

            container.addView(itemView);

            return itemView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((LinearLayout) object);
        }
    }
}

