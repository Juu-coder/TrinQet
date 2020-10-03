package com.nazycodes.trinqet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nazycodes.trinqet.adapters.CustomOnboardingPageAdapter;

import me.relex.circleindicator.CircleIndicator;

public class OnboardingActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator indicator;
    private Button btnSignUp;
    private CustomOnboardingPageAdapter onboardingPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewPager = findViewById(R.id.viewPager);
        onboardingPagerAdapter = new CustomOnboardingPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(onboardingPagerAdapter);

        indicator = findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnboardingActivity.this, RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}