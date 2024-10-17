package com.example.myprecious;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myprecious.utilities.GameUtility;


public class MainFragment extends Fragment {

    View inflatedView;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflatedView = inflater.inflate(R.layout.fragment_main, container, false);
        return inflatedView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        defineLayout();
    }

    private void defineLayout() {
        inflatedView.findViewById(R.id.button_new_game).setOnClickListener(this::onClick);
        inflatedView.findViewById(R.id.button_load_game).setOnClickListener(this::onClick);
        inflatedView.findViewById(R.id.button_exit_game).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        switch (view.getId()){
            case R.id.button_new_game:

                break;
            case R.id.button_load_game:

                break;
            case R.id.button_exit_game:
                GameUtility.getInstance().exitTheGame(requireActivity());
                break;
        }
    }
}