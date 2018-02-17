package com.zapnet.zapnet.DatabaseManager;

/**
 * Created by theny on 2/16/2018.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, DBSchema.DATABASE_NAME, null, DBSchema.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DBSchema.EventTable.NAME
                + "(eventid integer primary key autoincrement, "
                + DBSchema.EventTable.Cols.TITLE + ", "
                + DBSchema.EventTable.Cols.DESCRIPTION + ", "
                + DBSchema.EventTable.Cols.LOCATION + ", "
                + DBSchema.EventTable.Cols.STARTTIME + ", "
                + DBSchema.EventTable.Cols.ENDTIME + ", "
                + DBSchema.EventTable.Cols.DATE + ", "
                + DBSchema.EventTable.Cols.LATITUDE + ", "
                + DBSchema.EventTable.Cols.LONGITUDE + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
