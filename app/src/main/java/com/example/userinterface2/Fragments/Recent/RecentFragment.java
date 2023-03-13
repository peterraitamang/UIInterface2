package com.example.userinterface2.Fragments.Recent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.userinterface2.R;
import com.example.userinterface2.databinding.FragmentContactBinding;
import com.example.userinterface2.databinding.FragmentRecentBinding;

public class RecentFragment extends Fragment {
    FragmentRecentBinding b;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b = FragmentRecentBinding.inflate(inflater, container, false);
        return b.getRoot();

    }
}