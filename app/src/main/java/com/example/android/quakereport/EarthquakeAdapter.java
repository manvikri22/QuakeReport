package com.example.android.quakereport;

import android.content.Context;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<earthquake> {


    public  EarthquakeAdapter(Context context, ArrayList<earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        earthquake currentEarthquake = getItem(position);

        TextView magnitudeview = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeview.setText(currentEarthquake.getMagnitude());

        TextView locationview = (TextView) listItemView.findViewById(R.id.location);
        locationview.setText(currentEarthquake.getLocation());

        TextView dateview = (TextView) listItemView.findViewById(R.id.date);
        dateview.setText(currentEarthquake.getDate());

        return listItemView;
    }

}
