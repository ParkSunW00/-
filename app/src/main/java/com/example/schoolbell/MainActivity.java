package com.example.schoolbell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView alram;
    ImageView assign;
    ImageView timetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alram=findViewById(R.id.gotoAlarm);
        assign=findViewById(R.id.gotocheckList);
        timetable=findViewById(R.id.gotoTimeTable);

        alram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AlramActivity.class);
                startActivity(intent);
            }
        });

        assign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Assignment.class);
                startActivity(intent);
            }
        });

        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),timetableActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView1=findViewById(R.id.recyclerview1);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(layoutManager);

        final CardAdapter cardAdapter =new CardAdapter();

        cardAdapter.addItem(new CardActivity("온라인클래스"));
        cardAdapter.addItem(new CardActivity("구글클래스룸"));
        cardAdapter.addItem(new CardActivity("101클래스"));
        cardAdapter.addItem(new CardActivity("클래스카드 "));

        recyclerView1.setAdapter(cardAdapter);

        cardAdapter.setOnItemClickListener(new OnCardItemClickListener() {
            @Override
            public void onItemClick(CardAdapter.ViewHolder holder, View view, int position) {
                Intent intent = new Intent(MainActivity.this,test_callender.class);
                startActivity(intent);
            }
        });

    }

}
