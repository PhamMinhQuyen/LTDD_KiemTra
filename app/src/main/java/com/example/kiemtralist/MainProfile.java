package com.example.kiemtralist;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainProfile extends AppCompatActivity {
    private ListView listProduct;
    Context context;
    ArrayList<ModelProfile> data;
    AdapterProfile customerAdapter;
    ModelProfile model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.profile);

        listProduct=findViewById(R.id.list1);
        data=new ArrayList<>();


        populateData();
        customerAdapter=new AdapterProfile(context,data);
        listProduct.setAdapter(customerAdapter);
    }

    private void populateData(){

        model=new ModelProfile();
        model.setId(1);
        model.setSdt("0367148396");
        model.setDiachi("Quảng Nam");

        data.add(model);

        model=new ModelProfile();
        model.setId(1);
        model.setSdt("0367148396");
        model.setDiachi("Quảng Nam");

        data.add(model);

        model=new ModelProfile();
        model.setId(1);
        model.setSdt("0367148396");
        model.setDiachi("Quảng Nam");

        data.add(model);

        model=new ModelProfile();
        model.setId(1);
        model.setSdt("0367148396");
        model.setDiachi("Quảng Nam");

        data.add(model);
    }
}
