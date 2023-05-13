package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewArraylistAdapter extends BaseAdapter {

    Context ListviewArrayActivity;
    ArrayList<String> obj,Number;
    ArrayList<Integer> image;
    public ListviewArraylistAdapter(ListviewArrayActivity listviewArrayActivity, ArrayList<String> obj, ArrayList<Integer> image, ArrayList<String> Number) {

        this.ListviewArrayActivity = listviewArrayActivity;
        this.Number=Number;
        this.image=image;
        this.obj = obj;
    }

    @Override
    public int getCount() {
        return obj.size();
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

        view = LayoutInflater.from(ListviewArrayActivity).inflate(R.layout.arraylist_item_file,null);
        TextView  txtConcetName = view.findViewById(R.id.txtConcetName);
        TextView  txtPhoneNumber = view.findViewById(R.id.txtPhoneNumber);
        ImageView imgContect = view.findViewById(R.id.imgContect);

        txtConcetName.setText(obj.get(i));
        txtPhoneNumber.setText(Number.get(i));
        imgContect.setImageResource(image.get(i));
        return view;
    }
}
