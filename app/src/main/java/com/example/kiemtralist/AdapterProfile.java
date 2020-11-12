package com.example.kiemtralist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterProfile  extends BaseAdapter {
    Context context;
    ArrayList<ModelProfile> Data;
    LayoutInflater layoutInflater;
    ModelProfile model;

    public AdapterProfile(Context context, ArrayList<ModelProfile> data) {
        this.context = context;
        this.Data = data;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int position) {
        return Data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Data.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;
        if(rowView==null){
            rowView=layoutInflater.inflate(R.layout.product_profile,null,true);
        }


        TextView name = rowView.findViewById(R.id.product_name);
        TextView dc = rowView.findViewById(R.id.product_diachi);



        model=Data.get(position);

        name.setText(model.getSdt());
        dc.setText(model.getDiachi());



        return rowView;
    }

}
