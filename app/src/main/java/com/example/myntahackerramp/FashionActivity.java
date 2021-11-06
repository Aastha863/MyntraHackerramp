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
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FashionActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView uploadimg;
    Button uploadbtn,nextbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);
        uploadbtn=(Button)findViewById(R.id.uploadbtn);
        nextbtn=(Button)findViewById(R.id.nxtbtn);
        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGallery();
            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoge();
            }
        });
      //  toolbar=findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);
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
    public void openDialoge(){
        final Dialog d=new Dialog(this);

        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setCancelable(true);
        d.setContentView(R.layout.fashion_dialog);


        //Initializing the views of the dialog
        Button sbt=d.findViewById(R.id.backbtn);

        sbt.setOnClickListener(view -> {
            //Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            //startActivity(intent);
            Intent intent=new Intent(FashionActivity.this,MainActivity.class);
            startActivity(intent);
           d.dismiss();
        });
        d.show();
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

