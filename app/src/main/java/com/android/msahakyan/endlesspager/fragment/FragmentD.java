package com.android.msahakyan.endlesspager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.msahakyan.endlesspager.R;

public class FragmentD extends Fragment {

    public FragmentD() {
        // Required empty public constructor
    }

    public static FragmentD newInstance() {
        return new FragmentD();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d, container, false);
    }
}
