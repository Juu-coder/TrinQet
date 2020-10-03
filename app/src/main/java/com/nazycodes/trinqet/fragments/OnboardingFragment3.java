package com.nazycodes.trinqet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nazycodes.trinqet.R;

public class OnboardingFragment3 extends Fragment {
    public OnboardingFragment3() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onbording_page3, container, false);

        return view;
    }
}
