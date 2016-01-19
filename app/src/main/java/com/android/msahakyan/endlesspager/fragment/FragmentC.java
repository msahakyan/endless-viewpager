package com.android.msahakyan.endlesspager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.msahakyan.endlesspager.R;

public class FragmentC extends Fragment {

    public FragmentC() {
        // Required empty public constructor
    }

    public static FragmentC newInstance() {
        return new FragmentC();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }
}
