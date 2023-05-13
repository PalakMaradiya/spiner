package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter {

    String countryar[];
    int imgar[];
    Context context;

    CountryAdapter(String[] countryar, int imgar[], Context context) {
        this.countryar = countryar;
        this.imgar = imgar;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryar.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(context).inflate(R.layout.country_spinner_item_file, null);
        TextView txtCountry = v.findViewById(R.id.txtCountry);
        ImageView image = v.findViewById(R.id.image);
        txtCountry.setText(countryar[i]);

        image.setImageResource(imgar[i]);
        return v;
    }
}
