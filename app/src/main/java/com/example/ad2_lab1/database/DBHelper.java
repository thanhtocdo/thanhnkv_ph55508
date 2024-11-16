package com.example.ad2_lab1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "DBHelper", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sSQLTask = "CREATE TABLE TASK (ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, CONTENT TEXT, DATE TEXT, TYPE TEXT)";
        db.execSQL(sSQLTask);
        String sSQLInsert = "INSERT INTO TASK (ID,TITLE,CONTENT,DATE,TYPE) VALUES ('1', 'Android', 'Hoc android co ban', '1/1/2024', 'De')," +
                " ('2', 'Android 2', 'Hoc android co ban 2', '1/1/2024', 'De'), " +
                "('3', 'Android 3', 'Hoc android co ban', '1/1/2024', 'De'); ";
        db.execSQL(sSQLInsert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS TASK");
            onCreate(db);
        }
    }
}
