package com.zapnet.zapnet.DatabaseManager;

/**
 * Created by theny on 2/16/2018.
 */
import android.database.Cursor;
import android.database.CursorWrapper;
import com.zapnet.zapnet.Model.Event;

public class DBCursorWrapper extends CursorWrapper {
    Cursor cursor;
    public DBCursorWrapper(Cursor cursor) {
        super(cursor);
        this.cursor = cursor;
    }

    public Event getAccount() {
        String title = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.TITLE));
        String description = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.DESCRIPTION));
        String location = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.LOCATION));
        String startTime = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.STARTTIME));
        String endTime = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.ENDTIME));
        String date = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.DATE));

        String latitude = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.LATITUDE));
        String longitude = cursor.getString(cursor.getColumnIndex(DBSchema.EventTable.Cols.LONGITUDE));


        return new Event(startTime, endTime, title, description, location, date);
    }
}
