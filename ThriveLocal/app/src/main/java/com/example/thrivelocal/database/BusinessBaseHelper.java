package com.example.thrivelocal.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.thrivelocal.database.BusinessDbSchema.BusinessTable;

public class BusinessBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "businessBase.db";

    public BusinessBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + BusinessTable.NAME + "(" +
                BusinessTable.Cols.UUID + ", " + BusinessTable.Cols.COUNTRY + ", " +
                BusinessTable.Cols.GOOD + ", " + BusinessTable.Cols.CHILD + ", " +
                BusinessTable.Cols.FORCED + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
