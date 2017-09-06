package com.test.inova.fashion.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.inova.fashion.R;
import com.test.inova.fashion.adapters.GridAdapter;
import com.test.inova.fashion.pojo.ListPojo;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemGridFragment extends Fragment {
    public List<ListPojo> listPojo;
    RecyclerView recyclerView;

    GridAdapter gridAdapter;

    public ItemGridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_grid, container, false);
        initializeList();
        recyclerView = (RecyclerView) view.findViewById(R.id.grid_item_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(gridAdapter);

        gridAdapter = new GridAdapter(getActivity(), listPojo);

        recyclerView.setAdapter(gridAdapter);

        return view;
    }

    private void initializeList() {
        listPojo = new ArrayList<>();
        ListPojo Listpojo1 = new ListPojo();
        Listpojo1.setImage("https://ae01.alicdn.com/kf/HTB11KZVMVXXXXXCXpXXq6xXFXXX9/Summer-Vintage-Sunglasses-Women-Brand-Designer-Sun-Glasses-For-Women-Lunette-De-Soleil-Round-Glasses-Metal.jpg");
        Listpojo1.setLike("KIDS");
        Listpojo1.setDislike("20");
        Listpojo1.setCategory_name("WOMEN");
        Listpojo1.setPrice("899");

        ListPojo Listpojo2 = new ListPojo();
        Listpojo2.setImageUrl("https://s-media-cache-ak0.pinimg.com/736x/16/d1/0b/16d10b2e4cc32c9882c6a8cecb4e348d--telephone-booth-eyeglasses.jpg");
        Listpojo2.setLike("KIDS");
        Listpojo2.setDislike("20");
        Listpojo2.setCategory_name("WOMEN");
        Listpojo2.setPrice("899");

        ListPojo Listpojo3 = new ListPojo();
        Listpojo3.setImageUrl("http://kidsandglasses.com/wp-content/uploads/2014/10/emma-watson-sunglasses.png");
        Listpojo3.setLike("KIDS");
        Listpojo3.setDislike("20");
        Listpojo3.setCategory_name("WOMEN");
        Listpojo3.setPrice("899");

        ListPojo Listpojo4 = new ListPojo();
        Listpojo4.setImageUrl("http://3.bp.blogspot.com/-tkQph6KmvYI/T_uAdJcqp5I/AAAAAAAAEqQ/TipExhpYXKE/s1600/emma+watson+sunglasses.jpg");
        Listpojo4.setLike("KIDS");
        Listpojo4.setDislike("20");
        Listpojo4.setCategory_name("WOMEN");
        Listpojo4.setPrice("899");

        listPojo.add(Listpojo1);
        listPojo.add(Listpojo2);
        listPojo.add(Listpojo3);
        listPojo.add(Listpojo4);
    }

}
