package com.example.ad2_lab1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ad2_lab1.R;
import com.example.ad2_lab1.model.Task;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<Task> lists;
    private Context context;

    public ListViewAdapter(ArrayList<Task> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(parent.getContext(), R.layout.activity_main, null);
        }

        TextView tvTittle = convertView.findViewById(R.id.title);
        TextView tvContent = convertView.findViewById(R.id.content);
        TextView tvDate = convertView.findViewById(R.id.date);

        Task todoModel = lists.get(position);
        tvTittle.setText(todoModel.getTitle());
        tvContent.setText(todoModel.getContent());
        tvDate.setText(todoModel.getDate());

        return convertView;
    }
}
