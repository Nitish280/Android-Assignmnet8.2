package com.example.nitishsingh.android82;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Nitish Singh on 18-07-2017.
 */

public class CustomAdapter extends BaseAdapter {

    Activity context;
    String[] name;
    String[] number;

    public CustomAdapter(Activity context, String[] name, String[] number) {
        super();
        this.context=context;
        this.name=name;
        this.number=number;
    }

    @Override
    public int getCount() {
        return name.length;
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
        LayoutInflater layoutInflater = context.getLayoutInflater();

        view=layoutInflater.inflate(R.layout.row,null);
        TextView nameWidget=(TextView) view.findViewById(R.id.name);
        TextView numberWidget=(TextView) view.findViewById(R.id.phone_number);

        nameWidget.setText(name[i]);
        numberWidget.setText(number[i]);

        return view;
    }
}
