package com.dewairtzadhany_201011400483.uts_aplikasiresepmasakan.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dewairtzadhany_201011400483.uts_aplikasiresepmasakan.R;

public class ProfileFragment extends Fragment {

    private TextView usernameTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        usernameTextView = view.findViewById(R.id.uname);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString("username");
            usernameTextView.setText("Nama : " + username);
        }

        return view;
    }
}