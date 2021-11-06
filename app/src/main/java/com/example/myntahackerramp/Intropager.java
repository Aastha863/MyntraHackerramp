package com.example.myntahackerramp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;


import org.jetbrains.annotations.Nullable;

public class Intropager extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance(
                "GIFT VOUCHER", "Do you like free stuff? We got you, get interesting deals and gift vouchers on all of your successful transactions", R.drawable.voucher, Color.rgb(254, 209, 118), Color.WHITE, Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "REGULAR CUSTOMER BENEFITS", "Enjoy faster delivery, more discounts and better services.", R.drawable.shop, Color.rgb(252, 220, 218),Color.WHITE,Color.WHITE ));
        addSlide(AppIntroFragment.newInstance(
                "REGULAR CUSTOMER BENEFITS", "Shop more and get membership badges to unlock best deals and services", R.drawable.best_seller, Color.rgb(252, 220, 218), Color.WHITE,Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "FASHION TRACKER", "Stuck? Don't know what to look for?Stuck? Don't know what to look for?", R.drawable.worried, Color.rgb(140,219,187),Color.WHITE,Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "FASHION TRACKER", "Head to Fashion Tracker to find the best outfit for yourself", R.drawable.touching, Color.rgb(140, 219, 187), Color.WHITE, Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "FASHION TRACKER", "Browse through multiple outfits and choose the best one for you", R.drawable.girl, Color.rgb(140, 219, 187),Color.WHITE,Color.WHITE ));
        addSlide(AppIntroFragment.newInstance(
                "FASHION TRACKER", "Found something good? Great! We were glad to help", R.drawable.success, Color.rgb(140, 219, 187), Color.WHITE,Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "DESIGN OF THE WEEK", "Get suggestions based on what's Trending this week", R.drawable.oneintro, Color.rgb(159, 190, 190),Color.WHITE,Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "DESIGN OF THE WEEK", "Showcase your talent", R.drawable.intro2, Color.rgb(159, 190, 190), Color.WHITE,Color.WHITE));
        addSlide(AppIntroFragment.newInstance(
                "DESIGN OF THE WEEK", "Get your design featured !", R.drawable.intro3, Color.rgb(159, 190, 190),Color.WHITE,Color.WHITE));
    }
    @Override
    protected void onSkipPressed(@Nullable Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent;
        intent= new Intent(Intropager.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDonePressed(@Nullable Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent;
        intent = new Intent(Intropager.this, MainActivity.class);
        startActivity(intent);
    }
}