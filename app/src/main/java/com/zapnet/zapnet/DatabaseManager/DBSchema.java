package com.zapnet.zapnet.DatabaseManager;

/**
 * Created by theny on 2/16/2018.
 */

public class DBSchema {
    public static final int VERSION = 1;
    public static final String DATABASE_NAME = "jetshopper_database.db";

    public static final class EventTable {
        public static final String NAME = "event";
        public static final class Cols {
            public static final String TITLE = "title";
            public static final String DESCRIPTION = "description";
            public static final String LOCATION = "location";
            public static final String STARTTIME = "startTime";
            public static final String ENDTIME = "endTime";
            public static final String DATE = "date";
            public static final String LATITUDE = "latitude";
            public static final String LONGITUDE = "longitude";
        }
    }
}
