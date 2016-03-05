package com.example.updateme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProjectCotainerFragment extends Fragment {

    RecyclerView recyclerView;

    View view;

    public ProjectCotainerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_project_cotainer, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_activity_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyRecyclerViewAdapter(getContext()));
    }
}
