package com.example.recycleview;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ContactModel> arrContacts=new ArrayList<ContactModel>();
        RecyclerView recyclerView=findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        arrContacts.add(new ContactModel(R.drawable.contact,"Virat Kohli","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Rohit Sharma","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"KL Rahul","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Yashashvi Jaishwal","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Hardik Pandya","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Jashprit Bumrah","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Bhubhneshwar Kumar","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Ajikya Rahane","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Nitesh Kumar Reddy","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Ravindra Jadeja","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Surya Kumar Yadav","1115489623"));
        arrContacts.add(new ContactModel(R.drawable.contact,"Abhishek Sharma","1115489623"));

        RecycleContactAdapter adapter =new RecycleContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
       // adapter.notifyDataSetChanged();
    }
}