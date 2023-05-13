package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NumberAdapter extends BaseAdapter {

    String numberar[];
    Context context;

    NumberAdapter(String[] numberar,Context context)
    {
        this.numberar=numberar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return numberar.length;
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
        View v= LayoutInflater.from(context).inflate(R.layout.number_spinner_item_file,null);
        TextView txtNumber = v.findViewById(R.id.txtNumber);
        txtNumber.setText(numberar[i]);
        return v;
    }

}
