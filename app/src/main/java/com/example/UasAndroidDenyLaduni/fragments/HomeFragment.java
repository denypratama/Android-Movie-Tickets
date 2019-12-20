package com.example.UasAndroidDenyLaduni.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.UasAndroidDenyLaduni.R;

///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link HomeFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// */

public class HomeFragment extends Fragment {

//    private OnFragmentInteractionListener;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        ImageView p1 = view.findViewById(R.id.p1);
//        ImageView p2 = view.findViewById(R.id.p2);
//
//        p1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mListener != null)
//                {
//                    mListener.onp1Clicked();
//                }
//            }
//        });

        return inflater.inflate(R.layout.fragment_home, container, false);
    }



}
