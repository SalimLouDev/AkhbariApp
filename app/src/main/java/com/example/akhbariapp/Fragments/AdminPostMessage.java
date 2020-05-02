package com.example.akhbariapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.akhbariapp.Activities.AdminHomeActivity;
import com.example.akhbariapp.R;

import java.util.Objects;

public class AdminPostMessage extends Fragment
{


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.admin_massage,container,false);
        //HomeActivity homeActivity = (HomeActivity) getActivity();
        AdminHomeActivity homeActivity = (AdminHomeActivity) getActivity();
        Objects.requireNonNull(Objects.requireNonNull(homeActivity).getSupportActionBar()).setTitle("Message");


        return root;
    }
}