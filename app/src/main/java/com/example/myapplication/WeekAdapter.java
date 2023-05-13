package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WeekAdapter extends BaseAdapter {
    String weekar[];
    Context context;

    WeekAdapter(String[] weekar,Context context)
    {
        this.weekar=weekar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return weekar.length;
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
        View v= LayoutInflater.from(context).inflate(R.layout.week_spinner_item_file,null);
        TextView txtWeekspinner = v.findViewById(R.id.txtWeekspinner);
        txtWeekspinner.setText(weekar[i]);
        return v;
    }
}
