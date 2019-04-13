package com.example.thrivelocal;

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

    private  BusinessLab(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new BusinessBaseHelper(mContext).getWritableDatabase();
    }
}
