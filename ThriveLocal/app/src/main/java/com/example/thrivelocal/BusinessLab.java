package com.example.thrivelocal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.thrivelocal.database.BusinessBaseHelper;

public class BusinessLab {
    private static BusinessLab sBusinessLab;

    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static BusinessLab get(Context context) {
        if (sBusinessLab == null) {
            sBusinessLab = new BusinessLab(context);
        }
        return sBusinessLab;
    }

    public void addToDatabase(Business name) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COUNTRY", name.country);
        contentValues.put("GOOD", name.good);
        contentValues.put("CHILD", name.childLabor);
        contentValues.put("FORCED", name.forcedLabor);
        mDatabase.insert("COUNTRY", null, contentValues);
    }

    private BusinessLab(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new BusinessBaseHelper(mContext).getWritableDatabase();
    }
}
