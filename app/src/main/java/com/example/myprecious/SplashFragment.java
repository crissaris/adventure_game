package com.example.myprecious;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myprecious.utilities.GameUtility;


public class SplashFragment extends Fragment {

    View inflatedView;
    private Integer image_path;
    private Fragment fragment;

    public SplashFragment() {
        // Required empty public constructor
    }

    public SplashFragment(Fragment fragment, int image_path) {
        this.fragment = fragment;
        this.image_path = image_path;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameUtility.getHandler().postDelayed(()-> ((MainActivity)requireActivity()).loadFragment(fragment),4000);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflatedView = inflater.inflate(R.layout.fragment_splash, container, false);
        return inflatedView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        defineImageView();
    }

    private void defineImageView() {
        inflatedView.findViewById(R.id.imageView_splash).setBackgroundResource(image_path);
    }
}