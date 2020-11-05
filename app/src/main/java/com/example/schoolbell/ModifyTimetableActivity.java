package com.example.schoolbell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ModifyTimetableActivity extends AppCompatActivity {

    Button modifyBtn;
    EditText editText;

    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_timetable);

        modifyBtn=findViewById(R.id.modifyBtn);

        modifyBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModifyTimetableActivity.this,timetableActivity.class);
                startActivity(intent);
            }
        });
    }
}