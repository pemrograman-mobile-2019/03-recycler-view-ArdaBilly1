package com.example.hp.recyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.hp.recyclerview.R;
import com.example.hp.recyclerview.model.Contact;

import java.util.List;

public class ContactsAdapter extends
        RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
        private List<Contact> mContacts;
        public TextView nameTextView;
        public Button messageButton;
    public ContactsAdapter(List<Contact> contacts) {
        mContacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context= viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_contact,viewGroup,false);
                ViewHolder viewHolder = new ViewHolder(contactView);
                return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView nameTextView;
        public Button messageButton;


        public ViewHolder(View itemView) {

            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            messageButton = (Button) itemView.findViewById(R.id.message_button);
        }

    }
}
