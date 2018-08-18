package com.example.saidi.foodesto.fragments;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.database.models.DatabaseFacade;
import com.example.saidi.foodesto.interfaces.IHomeFragment;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;

import butterknife.BindView;

public class HomeStatisticsFragment extends BaseFragment implements IHomeFragment {
    @BindView(R.id.pie_chart)
    protected PieChart mProductStatistics;
    private Long countE;
    private Long countD;
    private Long countC;
    private Long countB;
    private Long countA;


    public static BaseFragment newInstance() {

        return new HomeStatisticsFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_statistics;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getBaseActivity().getSupportActionBar().setTitle(getString(R.string.home_statistics_label));
        DatabaseFacade.INSTANCE.getCountOfGradeE(new DatabaseFacade.DatabaseCallback<Long>() {
            @Override
            public void databaseCallback(@Nullable Long result) {
                if (result != null) {
                    countE = result;
                } else {
                    countE = 0L;
                }
            }
        });
        DatabaseFacade.INSTANCE.getCountOfGradeD(new DatabaseFacade.DatabaseCallback<Long>() {
            @Override
            public void databaseCallback(@Nullable Long result) {
                if (result != null) {

                    countD = result;
                } else {
                    countD = 0L;
                }
            }
        });
        DatabaseFacade.INSTANCE.getCountOfGradeC(new DatabaseFacade.DatabaseCallback<Long>() {
            @Override
            public void databaseCallback(@Nullable Long result) {
                if (result != null) {

                    countC = result;
                } else {
                    countC = 0L;
                }
            }
        });
        DatabaseFacade.INSTANCE.getCountOfGradeB(new DatabaseFacade.DatabaseCallback<Long>() {
            @Override
            public void databaseCallback(@Nullable Long result) {
                if (result != null) {

                    countB = result;
                } else {
                    countB = 0L;
                }
            }
        });
        DatabaseFacade.INSTANCE.getCountOfGradeA(new DatabaseFacade.DatabaseCallback<Long>() {
            @Override
            public void databaseCallback(@Nullable Long result) {
                if (result != null) {

                    countA = result;
                } else {
                    countA = 0L;
                }
                Long[] productSolds = {countA, countB, countC, countD, countE};
                String[] productNames = {getString(R.string.grade_very_good),
                        getString(R.string.grade_good),
                        getString(R.string.grade_low_impact),
                        getString(R.string.grade_mediocre),
                        getString(R.string.bad)};
                Integer[] productColors = {ContextCompat.getColor(getContext(), R.color.grade_a_color),
                        ContextCompat.getColor(getContext(), R.color.grade_b_color),
                        ContextCompat.getColor(getContext(), R.color.grade_c_color),
                        ContextCompat.getColor(getContext(), R.color.grade_d_color),
                        ContextCompat.getColor(getContext(), R.color.grade_e_color)};


                float totalSold = 0;
                for (int i = 0; i < productSolds.length; i++) {
                    totalSold += productSolds[i];
                }

                ArrayList<PieEntry> pieEntries = new ArrayList<>();
                ArrayList<Integer> colors = new ArrayList<>();
                for (int i = 0; i < productNames.length; i++) {
                    if (productSolds[i] > 0) {
                        float soldPercentage = productSolds[i] * 100 / totalSold;
                        PieEntry pieEntry = new PieEntry(soldPercentage, productNames[i]);
                        pieEntries.add(pieEntry);
                        colors.add(productColors[i]);
                    }

                }

                PieDataSet pieDataSet = new PieDataSet(pieEntries, "Products Statistics");
                pieDataSet.setColors(colors);
                mProductStatistics.setEntryLabelColor(Color.BLACK);
                mProductStatistics.setCenterText("Purchases quality");
                PieData pieData = new PieData(pieDataSet);
                pieData.setValueTextColor(Color.BLACK);
                pieData.setValueTextSize(20f);
                pieData.setValueFormatter(new PercentFormatter());
                pieData.setDataSet(pieDataSet);
                mProductStatistics.getDescription().setEnabled(false);
                mProductStatistics.setData(pieData);
                mProductStatistics.invalidate();
            }
        });


    }
}
