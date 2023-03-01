package com.example.weather.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weather.R;
import com.example.weather.databinding.FragmentDetailBinding;
import com.example.weather.databinding.FragmentHomeBinding;


public class DetailsFragment extends Fragment {

    private FragmentDetailBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentDetailBinding.inflate(inflater, container , false);
        return binding.getRoot();
}
}