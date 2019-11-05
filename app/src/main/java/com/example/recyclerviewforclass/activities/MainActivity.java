package com.example.recyclerviewforclass.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.recyclerviewforclass.R;
import com.example.recyclerviewforclass.adapter.ContactsAdapter;
import com.example.recyclerviewforclass.model.Contacts;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);

        // Create a list of contacts to display in RecyclerView
        List<Contacts> contactsList = new ArrayList<>();
        // Adding all the contacts object in list
        contactsList.add(new Contacts("Dahayang Rai" ,"9801234567",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC" ,"980123777",R.drawable.bhuwan));
        contactsList.add(new Contacts("Saugat Malla" ,"9801323567",R.drawable.saugat));
        contactsList.add(new Contacts("Dahayang Rai" ,"9801234567",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC" ,"980123777",R.drawable.bhuwan));
        contactsList.add(new Contacts("Saugat Malla" ,"9801323567",R.drawable.saugat));
        contactsList.add(new Contacts("Dahayang Rai" ,"9801234567",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC" ,"980123777",R.drawable.bhuwan));
        contactsList.add(new Contacts("Saugat Malla" ,"9801323567",R.drawable.saugat));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);

        //Display all the contacts in linear layour (vertically)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}