package com.nazycodes.trinqet.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nazycodes.trinqet.fragments.OnboardingFragment1;
import com.nazycodes.trinqet.fragments.OnboardingFragment2;
import com.nazycodes.trinqet.fragments.OnboardingFragment3;

public class CustomOnboardingPageAdapter extends FragmentPagerAdapter {

    public CustomOnboardingPageAdapter(FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new OnboardingFragment1();
        }
        else if (position == 1)
        {
            fragment = new OnboardingFragment2();
        }
        else if (position == 2)
        {
            fragment = new OnboardingFragment3();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
