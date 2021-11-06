package com.example.myntahackerramp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UploadActivity extends AppCompatActivity {
    ImageView uploadimg;
    Button upload, v1, v2, v3,submit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updesign);
        submit = findViewById(R.id.sub_btn);
        upload = findViewById(R.id.up_btn);
        v1 = findViewById(R.id.vbtn1);
        v2 = findViewById(R.id.vbtn2);
        v3 = findViewById(R.id.vbtn3);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGallery();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoge();
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
    public void openDialoge(){
        final Dialog d=new Dialog(this);

        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setCancelable(true);
        d.setContentView(R.layout.design_dialog);


        //Initializing the views of the dialog
        Button sbt=d.findViewById(R.id.backbtn);

        sbt.setOnClickListener(view -> {
            //Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            //startActivity(intent);
            Intent intent=new Intent(UploadActivity.this,MainActivity.class);
            startActivity(intent);
            d.dismiss();
        });
        d.show();
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
    public void openGallery()
    {
        Intent gallery=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(gallery,3);
        //public void gallery(View view){
        //pick image from galary
       /* Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        photoPickerIntent.setType("image/*");
        startActivityForResult(photoPickerIntent, 1000);*/
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK && data!=null)
        {
            Uri selectedImage =data.getData();
            uploadimg=(ImageView)findViewById(R.id.img);
            uploadimg.setImageURI(selectedImage);
        }
        else
        {
            Toast.makeText(this,"requested image is not valid",Toast.LENGTH_SHORT);
        }

    }
}
