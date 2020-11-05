package com.example.schoolbell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AssignAdapter extends RecyclerView.Adapter<AssignAdapter.ViewHolder> implements OnAssignItemClickListener {

    ArrayList<AssignmentActivity> items = new ArrayList<>();

    OnAssignItemClickListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView =inflater.inflate(R.layout.activity_assignment_item,parent,false);

        return new ViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AssignmentActivity item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView assign1;
        TextView viewday1;

        public ViewHolder (View view, final OnAssignItemClickListener listener) {
            super (view);

            assign1=itemView.findViewById(R.id.assign1);
            viewday1=itemView.findViewById(R.id.viewday);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();

                    if (listener!=null) {
                        listener.onItemClick(ViewHolder.this,view,position);
                    }
                }
            });
        }

        public void setItem (AssignmentActivity item) {
            viewday1.setText(item.getViewday());
            assign1.setText(item.getContent());
        }

    }
    public void addItem(AssignmentActivity item) {items.add(item);}
    public void setItem(ArrayList<AssignmentActivity> items) {this.items=items;}
    public AssignmentActivity getItem(int position) {return items.get(position);}
    public void setItem (int position, AssignmentActivity item) {items.set(position,item);}

    public void setOnItemClickListener (OnAssignItemClickListener listener) {
        this.listener=listener;
    }

    public void onItemClick (ViewHolder holder, View view, int position) {
        if(listener!=null) {
            listener.onItemClick(holder,view,position);
        }
}
}

