package com.nazycodes.trinqet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nazycodes.trinqet.R;

public class OnboardingFragment1 extends Fragment {
    public OnboardingFragment1() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onbording_page1, container, false);

        return view;
    }
}
