package com.example.rump.p2000reader.view.accidents;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rump.p2000reader.R;
import com.example.rump.p2000reader.model.Accident;

import org.w3c.dom.Text;

import java.util.List;

public class AccidentAdapter extends RecyclerView.Adapter<AccidentAdapter.AccidentViewHolder> {

    private List<Accident> mAccidents;

    public AccidentAdapter(List<Accident> mAccidents) {
        this.mAccidents = mAccidents;
    }

    @NonNull
    @Override
    public AccidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_accident, parent, false);
        return new AccidentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccidentViewHolder holder, int position) {
        TextView titleText = holder.titleTextView;
        titleText.setText("Test");
    }


    @Override
    public int getItemCount() {
        return mAccidents.size();
    }

    public class AccidentViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView descriptionTextView;
        TextView pubDateTextView;

        AccidentViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.txt_title);
            descriptionTextView = itemView.findViewById(R.id.txt_description);
            pubDateTextView = itemView.findViewById(R.id.txt_pubDate);
        }
    }

}
