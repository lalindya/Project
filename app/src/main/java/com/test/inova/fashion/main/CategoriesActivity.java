package com.test.inova.fashion.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.test.inova.fashion.R;

import java.util.HashMap;

public class CategoriesActivity extends  AppCompatActivity  implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{
    private SliderLayout mDemoSlider;
   // List<Item_Details_Pojo> item_details_pojo;
   // private SliderLayout mDemoSlider;
  // private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
  //      initializeList();


//        Toolbar mToolbar = (Toolbar) findViewById(R.id.signin_toolbar);
//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowTitleEnabled(true);
//        mToolbar.setTitle("Sign In");
        //transparent toolbar
      // getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("beauty",R.drawable.images);
        file_maps.put("fashion",R.drawable.imagesa);
        file_maps.put("House of Cards",R.drawable.imagesb);
        file_maps.put("Game of Thrones", R.drawable.imagesc);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }
    }

//    private void initializeList() {
//        item_details_pojo = new ArrayList<>();
//
//        Item_Details_Pojo item_details_pojo1 = new Item_Details_Pojo();
//       // productPojo1.setImageUrl("https://cdn.shopify.com/s/files/1/1001/9624/products/iron-fist-clothing-2016-fall-accessories-008_grande.jpg?v=1485565246");
//        item_details_pojo1.setLikes("50K");
//        item_details_pojo1.setDislikes("20K");
//        item_details_pojo1.setShare("4K");
//        item_details_pojo1.setDescription("bla bla bla blaaaaaa");
//        //productPojo1.setProductRating(3.5f);
//
//        Item_Details_Pojo item_details_pojo2 = new Item_Details_Pojo();
//        // productPojo1.setImageUrl("https://cdn.shopify.com/s/files/1/1001/9624/products/iron-fist-clothing-2016-fall-accessories-008_grande.jpg?v=1485565246");
//        item_details_pojo2.setLikes("90K");
//        item_details_pojo2.setDislikes("70K");
//        item_details_pojo2.setShare("4K");
//        item_details_pojo2.setDescription("bla bla bla blaaaaaa");
//        //productPojo1.setProductRating(3.5f);
//
//        //productPojo2.setProductRating(3.7f);
//        Item_Details_Pojo item_details_pojo3 = new Item_Details_Pojo();
//        // productPojo1.setImageUrl("https://cdn.shopify.com/s/files/1/1001/9624/products/iron-fist-clothing-2016-fall-accessories-008_grande.jpg?v=1485565246");
//        item_details_pojo3.setLikes("50K");
//        item_details_pojo3.setDislikes("20K");
//        item_details_pojo3.setShare("4K");
//        item_details_pojo3.setDescription("bla bla bla blaaaaaa");
//        //productPojo1.setProductRating(3.5f)
//
//
//        item_details_pojo.add(item_details_pojo1);
//        item_details_pojo.add(item_details_pojo2);
//        item_details_pojo.add(item_details_pojo3);
//    }

    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
      //  Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.nav,menu);
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onPageSelected(int position) {
//        switch (item.getItemId()){
//            case R.id.action_custom_indicator:
//                mDemoSlider.setCustomIndicator((PagerIndicator) findViewById(R.id.custom_indicator));
//                break;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
