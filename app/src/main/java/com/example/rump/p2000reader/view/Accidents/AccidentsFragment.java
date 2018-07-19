package com.example.rump.p2000reader.view.Accidents;


import android.os.Bundle;
import android.support.annotation.NonNull;
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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_accident, container, false);
    }

}
