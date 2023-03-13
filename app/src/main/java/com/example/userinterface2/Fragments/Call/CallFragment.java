package com.example.userinterface2.Fragments.Call;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.userinterface2.databinding.FragmentCallBinding;

public class CallFragment extends Fragment {
    FragmentCallBinding d;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        d = FragmentCallBinding.inflate(inflater, container, false);
        return d.getRoot();
    }
}