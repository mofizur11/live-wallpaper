package com.idea.solution.livewallpaper.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idea.solution.livewallpaper.R;


public class DailyPopularFragment extends Fragment {

    public static DailyPopularFragment INSTANCE = null;


    public DailyPopularFragment() {
        // Required empty public constructor
    }


    public static DailyPopularFragment getInstance() {

        if (INSTANCE == null)
            INSTANCE = new DailyPopularFragment();
        return INSTANCE;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily_polular, container, false);
    }
}