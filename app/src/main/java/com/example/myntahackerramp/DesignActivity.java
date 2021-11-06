package com.example.myntahackerramp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DesignActivity extends AppCompatActivity {
    Button add,v1,v2,v3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        add= findViewById(R.id.add_btn);
        v1=findViewById(R.id.vbtn1);
        v2=findViewById(R.id.vbtn2);
        v3=findViewById(R.id.vbtn3);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DesignActivity.this,UploadActivity.class);
                startActivity(intent);
            }
        });
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoge1();
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoge2();
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoge3();
            }
        });

    }
    public void openDialoge1(){
        final Dialog d=new Dialog(this);

        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setCancelable(true);
        d.setContentView(R.layout.view1);


        //Initializing the views of the dialog
        Button sbt=d.findViewById(R.id.back_btn);

        sbt.setOnClickListener(view -> {
            //Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            //startActivity(intent);
            //  Intent intent=new Intent(UploadActivity.this,MainActivity.class);
            // startActivity(intent);
            d.dismiss();
        });
        d.show();
    }
    public void openDialoge2(){
        final Dialog d=new Dialog(this);

        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setCancelable(true);
        d.setContentView(R.layout.view2);


        //Initializing the views of the dialog
        Button sbt=d.findViewById(R.id.back_btn);

        sbt.setOnClickListener(view -> {
            //Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            //startActivity(intent);
            // Intent intent=new Intent(UploadActivity.this,MainActivity.class);
            //startActivity(intent);
            d.dismiss();
        });
        d.show();
    }
    public void openDialoge3(){
        final Dialog d=new Dialog(this);

        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setCancelable(true);
        d.setContentView(R.layout.view3);


        //Initializing the views of the dialog
        Button sbt=d.findViewById(R.id.back_btn);

        sbt.setOnClickListener(view -> {
            //Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            //startActivity(intent);
            //Intent intent=new Intent(UploadActivity.this,MainActivity.class);
            //startActivity(intent);
            d.dismiss();
        });
        d.show();
    }
}
