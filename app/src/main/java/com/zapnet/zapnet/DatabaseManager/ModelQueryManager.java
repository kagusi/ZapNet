package com.zapnet.zapnet.DatabaseManager;

/**
 * Created by theny on 2/16/2018.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ModelQueryManager {
    private static ModelQueryManager MODELMANAGER;

    private final Context mContext;
    private final SQLiteDatabase mDatabase;

    private ModelQueryManager(Context context){

        mContext = context.getApplicationContext();
        mDatabase = new DBHelper(mContext).getWritableDatabase();

    }
    public static ModelQueryManager get(Context context) {
        MODELMANAGER = new ModelQueryManager(context);
        return MODELMANAGER;
    }
}
