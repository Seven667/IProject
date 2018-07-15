package com.example.ali.work.Classes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.*;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ali.work.Activities.MainActivity;
import com.example.ali.work.R;

import org.w3c.dom.Text;


public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);


        RecyclerView recyclerView =(RecyclerView)view.findViewById(R.id.menu_recyclerview);

        MenuAdapter menuAdapter = new MenuAdapter(getActivity(), MenuDataGenerator.getData(getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(menuAdapter);
        return view;
    }
}
