package com.example.updateme;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BudgetFragment extends Fragment {


    List<Projects> projectsList;

    public BudgetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_budget, container, false);

        BarChart mChart = (BarChart) view.findViewById(R.id.barChart);

        mChart.setDrawBarShadow(false);
        mChart.setDrawValueAboveBar(true);
        mChart.setMaxVisibleValueCount(20);
        mChart.setDescription("");
        mChart.setDrawGridBackground(false);
        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setEnabled(false);


        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.setLabelCount(6, false);

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setLabelCount(6, false);

        Legend l = mChart.getLegend();
        l.setPosition(Legend.LegendPosition.BELOW_CHART_LEFT);
        l.setForm(Legend.LegendForm.SQUARE);
        l.setFormSize(9f);
        l.setTextSize(11f);
        l.setXEntrySpace(4f);


        ArrayList<String> xVals = new ArrayList<String>();

        ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
        projectsList = Projects.getDummyData();
        for (int i = 0; i < projectsList.size(); i++) {
            Projects proj = projectsList.get(i);
            xVals.add(proj.getProjectTitle());
            entries.add(new BarEntry(proj.getAmount().floatValue(), i));
        }

        BarDataSet set = new BarDataSet(entries, "Budget Allocation");

        set.setBarSpacePercent(40f);
        set.setColor(Color.rgb(240, 120, 124));

        BarData data = new BarData(xVals, set);
        data.setValueTextSize(10f);
        data.setDrawValues(false);

        mChart.setData(data);
        return view;
    }

}
