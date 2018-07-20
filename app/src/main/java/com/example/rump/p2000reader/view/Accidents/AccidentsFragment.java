package com.example.rump.p2000reader.view.accidents;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rump.p2000reader.R;
import com.example.rump.p2000reader.model.Accident;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AccidentsFragment extends Fragment {

    public AccidentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayList<Accident> accidents = new ArrayList<>();
        Date currentTime = Calendar.getInstance().getTime();
        Accident accident = new Accident("test", "Test", "dads",  currentTime,44.00F, 44.00F);
        accidents.add(accident);
        View rootView = inflater.inflate(R.layout.content_accident, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // 3. create an adapter
        AccidentAdapter mAdapter = new AccidentAdapter(accidents);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }


}
