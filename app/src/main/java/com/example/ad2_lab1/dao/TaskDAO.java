package com.example.ad2_lab1.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ad2_lab1.database.DBHelper;

public class TaskDAO {
    private DBHelper dbHelper;
    private SQLiteDatabase database;

    public TaskDAO(Context context) {
        dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
    }
}
