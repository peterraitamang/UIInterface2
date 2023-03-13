package com.example.userinterface2.Fragments.Contact;

import android.media.MediaDrm;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.userinterface2.R;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Viewholder>{
    private final List<ContactData>myData;
    private final FragmentManager fragmentManager;

    public ContactAdapter(List<ContactData> myData, FragmentManager fragmentManager) {
        this.myData = myData;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View recyclerItem = layoutInflater.inflate(R.layout.item_search_rv, parent, false);
        Viewholder viewholder = new Viewholder(recyclerItem);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        final ContactData contactData = myData.get(position);
        holder.contactName.setText(contactData.getContactName());
        holder.contactNumber.setText(contactData.getContactNumber());
        holder.profileImage.setImageResource(contactData.getProfileImg());
    final int pos = position;
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pos == 0){
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.fragmentView,new Fragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                else {
                Toast.makeText(view.getContext(),contactData.getContactName()+ " selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder{
        public RelativeLayout relativeLayout;
        public TextView contactName;
        public TextView contactNumber;
        public ImageView profileImage;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            this.contactName = (TextView) itemView.findViewById(R.id.tv_contactName);
            this.contactNumber = (TextView) itemView.findViewById(R.id.tv_contactPhoneNo);
            this.profileImage = (ImageView) itemView.findViewById(R.id.search_profile_img);
            this.contactName = (TextView) itemView.findViewById(R.id.tv_contactName);
            this.relativeLayout = (RelativeLayout) itemView.findViewById(R.id.item_recycler_fcontact);

        }
    }
}
