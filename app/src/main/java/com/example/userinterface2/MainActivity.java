package com.example.userinterface2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.userinterface2.Fragments.Call.CallFragment;
import com.example.userinterface2.Fragments.Contact.ContactFragment;
import com.example.userinterface2.Fragments.Favourites.FavouritesFragment;
import com.example.userinterface2.Fragments.Recent.RecentFragment;
import com.example.userinterface2.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.navigationView.setSelectedItemId(R.id.contact);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView,new ContactFragment()).commit();
        binding.navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.favourites:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView,new FavouritesFragment()).commit();
                        return true;
                    case R.id.recent:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView, new RecentFragment()).commit();
                        return true;
                    case R.id.contact:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView, new ContactFragment()).commit();
                        return true;
                    case R.id.call:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView, new CallFragment()).commit();
                        return true;
                }
                return false;
            }
        });




    }
}