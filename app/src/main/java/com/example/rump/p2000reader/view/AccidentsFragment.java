package com.example.rump.p2000reader.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rump.p2000reader.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccidentsFragment extends Fragment {


    public AccidentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accidents, container, false);
    }

}
