package com.example.schoolbell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Assignment extends test_callender {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);

        RecyclerView recyclerView2=findViewById(R.id.recyclerview2);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView2.setLayoutManager(layoutManager);

        final AssignAdapter assignAdapter=new AssignAdapter();

        assignAdapter.addItem(new AssignmentActivity("정보통신 과제","2020-11-08"));
        assignAdapter.addItem(new AssignmentActivity("수학 숙제","2020-11-10"));
        assignAdapter.addItem(new AssignmentActivity("국어 작문","2020-11-11"));

        recyclerView2.setAdapter(assignAdapter);


    }
}