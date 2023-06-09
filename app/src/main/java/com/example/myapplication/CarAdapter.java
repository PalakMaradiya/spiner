package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CarAdapter extends BaseAdapter  {
    String carar[];
    Context context;

    CarAdapter(String[] carar, Context context)
    {
        this.carar=carar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return carar.length;
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
        View v= LayoutInflater.from(context).inflate(R.layout.car_spinner_item_file,null);
        TextView txtCar = v.findViewById(R.id.txtCar);
        txtCar.setText(carar[i]);
        return v;
    }
}
