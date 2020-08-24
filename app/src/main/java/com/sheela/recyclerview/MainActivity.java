package com.sheela.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        //create a list of contacts to display in recyclerview
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Sheela", "9840437375",R.drawable.a));
        contactsList.add(new Contacts("Reshika","9876876434",R.drawable.b));
        contactsList.add(new Contacts("Apsara","9876890654",R.drawable.c));
        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//                this,LinearLayoutManager.HORIZONTAL,false));




    }

    }

