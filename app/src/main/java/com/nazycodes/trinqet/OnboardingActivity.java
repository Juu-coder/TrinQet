package com.nazycodes.trinqet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.nazycodes.trinqet.adapters.CustomOnboardingPageAdapter;

import me.relex.circleindicator.CircleIndicator;

public class OnboardingActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator indicator;
    CustomOnboardingPageAdapter onboardingPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewPager = findViewById(R.id.viewPager);
        onboardingPagerAdapter = new CustomOnboardingPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(onboardingPagerAdapter);

        indicator = findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
    }
}