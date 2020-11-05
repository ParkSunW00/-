package com.example.schoolbell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
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
        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        alram=findViewById(R.id.gotoAlarm);
        assign=findViewById(R.id.gotocheckList);
        timetable=findViewById(R.id.gotoTimeTable);

        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),timetableActivity.class);
                startActivity(intent);
            }
        });

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        final Adapter adapter=new Adapter();

        adapter.addItem(new Card("온라인클래스"));
        adapter.addItem(new Card("구글클래스룸"));
        adapter.addItem(new Card("101클래스"));
        adapter.addItem(new Card("클래스카드 "));

        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnCardItemClickListener() {
            @Override
            public void onItemClick(Adapter.ViewHolder holder, View view, int position) {
                Intent intent = new Intent(MainActivity.this,test_callender.class);
                startActivity(intent);
            }
        });


    }

}
