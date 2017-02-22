package com.example.michele.ersupal.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

/**
 * Created by Michele on 19/02/2017.
 */

public class DatabaseHelp extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "ersupal.db";
    public static final String TABLE_NAME= "utenti_table";
    public static final String COL1= "ID";
    public static final String COL2= "NAME";
    public static final String COL3= "PASSWORD";


    public DatabaseHelp(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table" + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,PASSWORD TEXT)");
            }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP table if exist" +TABLE_NAME);
        onCreate(db);
    }
}
