package com.test.inova.fashion.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.inova.fashion.adapters.CategoriesAdapter;
import com.test.inova.fashion.pojo.ListPojo;
import com.test.inova.fashion.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriesFragment extends Fragment {

    public List<ListPojo> categorytList;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    CategoriesAdapter categoriesAdapter;
    public static CategoriesFragment newInstatnce(){
        return new CategoriesFragment();
    }
    public CategoriesFragment() {
        // Required empty public constructor
    }
    public static CategoriesFragment newInstance() {
        return new CategoriesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_categories, container, false);
        initializeList();
        recyclerView = (RecyclerView) view.findViewById(R.id.categorylist_recyclerview);
        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        categoriesAdapter = new CategoriesAdapter(getActivity(),categorytList);

        recyclerView.setAdapter(categoriesAdapter);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        return view;
    }

    private void initializeList() {
        categorytList = new ArrayList<>();
        ListPojo Listpojo1 = new ListPojo();
        Listpojo1.setImageUrl("https://s-media-cache-ak0.pinimg.com/736x/ac/33/35/ac3335ef1ea288be1467c10fc8249461--cartier-watches-cartier-mens-watch.jpg");
        Listpojo1.setCategory_name("KIDS");

        ListPojo Listpojo2 = new ListPojo();
        Listpojo2.setImageUrl("https://asics.scene7.com/is/image/asics/T722N_9085_0010291367_RT?$product$");
        Listpojo2.setCategory_name("WOMEN");

        ListPojo Listpojo3 = new ListPojo();
        Listpojo3.setImageUrl("https://s-media-cache-ak0.pinimg.com/736x/ac/33/35/ac3335ef1ea288be1467c10fc8249461--cartier-watches-cartier-mens-watch.jpg");
        Listpojo3.setCategory_name("MEN");

        categorytList.add(Listpojo1);
        categorytList.add(Listpojo2);
        categorytList.add(Listpojo3);
    }
}
