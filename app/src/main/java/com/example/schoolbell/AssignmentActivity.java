package com.example.schoolbell;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AssignmentActivity extends test_callender{

    String content;
    String viewday;

    public AssignmentActivity(String content, String viewday) { this.content = content; this.viewday = viewday; }

    public String getContent() { return content; }
    public void setContent(String content) {
        this.content = content;
    }

    public String getViewday() {
        return viewday;
    }
    public void setViewday(String viewday) { this.viewday = viewday; }

}


