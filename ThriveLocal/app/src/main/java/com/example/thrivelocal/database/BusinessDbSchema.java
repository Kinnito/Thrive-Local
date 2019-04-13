package com.example.thrivelocal.database;

public class BusinessDbSchema {
    public static final class BusinessTable {
        public static final String NAME = "businesses";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String COUNTRY = "country";
            public static final String GOOD = "good";
            public static final String CHILD = "child_labor";
            public static final String FORCED = "forced_labor";
        }
    }
}
