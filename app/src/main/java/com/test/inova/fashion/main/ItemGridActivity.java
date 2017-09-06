package com.test.inova.fashion.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.test.inova.fashion.R;

import static com.test.inova.fashion.R.id.spinner;

public class ItemGridActivity extends AppCompatActivity {
    Spinner category1;
    Spinner filer1;
    String[] category;
    String[] filter;
    int sp_position;
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_grid);

        category1 = (Spinner) findViewById(spinner);
        filer1= (Spinner) findViewById(R.id.spinner2);

        String myString = "CATEGORY";
        String MyString1 = "FILTER";

        category = getResources().getStringArray(R.array.spinner);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(ItemGridActivity.this, android.R.layout.simple_spinner_dropdown_item, category);

        sp_position = ad.getPosition(myString);
        category1.setAdapter(ad);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filter = getResources().getStringArray(R.array.spinner2);
        ArrayAdapter<String> addd = new ArrayAdapter<String>(ItemGridActivity.this, android.R.layout.simple_spinner_dropdown_item, filter);

        sp_position = addd.getPosition(MyString1);
        filer1.setAdapter(addd);
        addd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.EYE_WEAR);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setTitle("EYE_WEAR");

        category1 = (Spinner) findViewById(spinner);
        filer1 = (Spinner) findViewById(R.id.spinner2);
    }
}
