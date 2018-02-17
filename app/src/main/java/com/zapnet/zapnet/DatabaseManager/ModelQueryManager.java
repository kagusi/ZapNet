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
import com.zapnet.zapnet.Model.Event;
import com.zapnet.zapnet.DatabaseManager.DBSchema;

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

    public void createEvent(Event event)
    {
        ContentValues values = getAEventContentvalues(event);
        mDatabase.insert(DBSchema.EventTable.NAME, null, values);
    }

    //Create an event Contentvalues
    private static ContentValues getAEventContentvalues(Event event) {

        ContentValues values = new ContentValues();
        values.put(DBSchema.EventTable.Cols.TITLE, event.getTitle());
        values.put(DBSchema.EventTable.Cols.DESCRIPTION, event.getDesription());
        values.put(DBSchema.EventTable.Cols.LOCATION, event.getLocation());
        values.put(DBSchema.EventTable.Cols.STARTTIME, event.getStartTime());
        values.put(DBSchema.EventTable.Cols.ENDTIME, event.getEndTime());
        values.put(DBSchema.EventTable.Cols.DATE, event.getDate());
        values.put(DBSchema.EventTable.Cols.LATITUDE, event.getLatitude());
        values.put(DBSchema.EventTable.Cols.LONGITUDE, event.getLongitude());
        return values;
    }


    public List<Event> getEvent(String[] date ){

        List<Event> events = new ArrayList<>();

        Cursor cursor = mDatabase.query(
                DBSchema.EventTable.NAME, // table name
                null,           // which columns; null for all
                DBSchema.EventTable.Cols.DATE + "=?",          // where clause, e.g. id=?
                 date,       // where arguments
                null,       // group by
                null,       // having
                null        // order by
        );

        DBCursorWrapper wrapper = new DBCursorWrapper(cursor);

        try {
            wrapper.moveToFirst();
            while(wrapper.isAfterLast() == false) {
                Event event = wrapper.getEvent();
                events.add(event);
                wrapper.moveToNext();
            }
        }
        finally {
            cursor.close();
            wrapper.close();
        }

        return events;

    }
}
