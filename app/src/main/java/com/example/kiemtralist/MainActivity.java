package com.example.kiemtralist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listProduct;
    Context context;
    ArrayList<Model> data;
    Adapter customerAdapter;
    Model model;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_main);



        listProduct=findViewById(R.id.list);
        data=new ArrayList<>();


        populateData();
        customerAdapter=new Adapter(context,data);
        listProduct.setAdapter(customerAdapter);
    }

    private void populateData(){

        model=new Model();
        model.setId(1);
        model.setName(" Phạm Minh Quyền");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("PHAN AN ML");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Hoàng Bảo");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Xuân Châu");

        model.setImage(R.drawable.avt);
        data.add(model);
    }
}