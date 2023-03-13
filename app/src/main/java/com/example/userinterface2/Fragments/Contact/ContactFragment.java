package com.example.userinterface2.Fragments.Contact;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.userinterface2.R;
import com.example.userinterface2.databinding.FragmentContactBinding;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {
    FragmentContactBinding c;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        c = FragmentContactBinding.inflate(inflater, container, false);


        List<ContactData> contactData = new ArrayList<>();
        contactData.add(new ContactData("Alesandro del Pieroo","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Bella","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Carlos","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Denish","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Eugene","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Mark","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Luke","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Alesandro del Pieroo","(+62) 812-2377-2993",R.drawable.person));
        contactData.add(new ContactData("Jacob","(+62) 812-2377-2993",R.drawable.person));

        ContactAdapter adapter = new ContactAdapter(contactData);
        c.searchRecyclerFContact.setAdapter(adapter);
        return c.getRoot();
    }
}