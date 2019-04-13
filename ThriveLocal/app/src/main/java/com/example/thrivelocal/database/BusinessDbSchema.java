package com.example.thrivelocal.database;

public class BusinessDbSchema {
    public static final class BusinessTable {
        public static final String NAME = "businesses";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String NAME = "name";
            public static final String CITY = "city";
            public static final String STATE = "state";
        }
    }
}
