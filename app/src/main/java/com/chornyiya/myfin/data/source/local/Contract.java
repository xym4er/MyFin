package com.chornyiya.myfin.data.source.local;

public class Contract {
    public static String DB_NAME = "main.db";
    public static int DB_VERSION = 1;

    public static String OPERATIONS_TABLE_NAME = "operations";
        public static String ID_OPERATIONS_COLUMN_NAME = "_id";
        public static String ACCOUNT_ID_OPERATIONS_COLUMN_NAME = "accaunt_id";
        public static String CATEGORY_ID_OPERATIONS_COLUMN_NAME = "category_id";
        public static String AMOUNT_OPERATIONS_COLUMN_NAME = "amount";
        public static String DATE_OPERATIONS_COLUMN_NAME = "date";
        public static String COMMENT_OPERATIONS_COLUMN_NAME = "comment";

    public static String ACCOUNT_TABLE_NAME = "accounts";
        public static String ID_ACCOUNT_COLUMN_NAME = "_id";
        public static String TYPE_ACCOUNT_COLUMN_NAME = "type";
        public static String NAME_ACCOUNT_COLUMN_NAME = "name";
        public static String AMOUNT_ACCOUNT_COLUMN_NAME = "amount";
        public static String LAST_UPDATE_ACCOUNT_COLUMN_NAME = "last_update";


    public static String CATEGORY_TABLE_NAME = "categories";
        public static String ID_CATEGORY_COLUMN_NAME = "_id";
        public static String NAME_CATEGORY_COLUMN_NAME = "name";
        public static String PARENT_ID_CATEGORY_COLUMN_NAME = "parent_id";

}
