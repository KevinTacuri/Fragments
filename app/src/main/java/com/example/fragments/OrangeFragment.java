package com.example.fragments;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OrangeFragment extends Fragment {
    public OrangeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orange, container, false);
        //RGB para el color anaranjado
        view.setBackgroundColor(Color.rgb(255,128,0));
        return view;
    }
}