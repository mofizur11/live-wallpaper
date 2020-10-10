package com.idea.solution.livewallpaper.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.idea.solution.livewallpaper.R;


public class RecentsFragment extends Fragment {

    public static RecentsFragment INSTANCE = null;


    public RecentsFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public static RecentsFragment getInstance() {

        if (INSTANCE == null)
            INSTANCE = new RecentsFragment();
        return INSTANCE;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recents, container, false);

        return view;
    }


}