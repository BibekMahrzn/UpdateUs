package com.example.updateme;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ConstructionFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    public ConstructionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_construction, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPagerAdapter(getFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}
