package com.example.nitishsingh.android82;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.listview);

        String name[]={"Nitish","Vikash","Vishal","Abhishek","Utkarsh","Sachin","Ritik","Bhawani","Vishwas","Mithun","Utkarsh"};
        String number[]={"8791108392","9754367876","8798545642","7854378929","7154896547","9065378432","7809457254",
                "9097534246","7589435686","8165890432","7954637892"};


        CustomAdapter customlist=new CustomAdapter(this,name,number);
        list.setAdapter(customlist);
    }
}
