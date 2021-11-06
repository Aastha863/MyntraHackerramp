package com.example.myntahackerramp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout mDrawerlayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.nav_drawer);
        mDrawerlayout=findViewById(R.id.drawer_layout);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,mDrawerlayout,R.string.nav_open,R.string.nav_close);
        mDrawerlayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView = findViewById(R.id.nav_view);
//        requestStoragePermission();
        navigationView.setNavigationItemSelectedListener(navListener);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public final NavigationView.OnNavigationItemSelectedListener navListener =
            new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int id = item.getItemId();
                    Intent intent;
                    switch (id) {

                        case R.id.voucher:
                            intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.badge:
                            intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.ft:
                            intent = new Intent(MainActivity.this, FashionActivity.class);
                            startActivity(intent);
                        case R.id.desw:
                            intent = new Intent(MainActivity.this, DesignActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.about_us:
                            intent = new Intent(MainActivity.this, Intropager.class);
                            startActivity(intent);
                            break;
                        case R.id.exit:
                            finish();
                            break;
                    }
                    return true;

                }};

}