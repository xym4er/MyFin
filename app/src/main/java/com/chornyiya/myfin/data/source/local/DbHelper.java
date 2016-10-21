package com.chornyiya.myfin.data.source.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, Contract.DB_NAME, null, Contract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NO EXIST ").append(Contract.ACCOUNT_TABLE_NAME).append(" (")
                .append(Contract.ID_ACCOUNT_COLUMN_NAME).append(" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ")
                .append(Contract.NAME_ACCOUNT_COLUMN_NAME).append(" TEXT NOT NULL, ")
                .append(Contract.TYPE_ACCOUNT_COLUMN_NAME).append(" INTEGER, ")
                .append(Contract.AMOUNT_ACCOUNT_COLUMN_NAME).append(" INTEGER, ")
                .append(Contract.LAST_UPDATE_ACCOUNT_COLUMN_NAME).append(" TEXT);");
        db.execSQL(sql.toString());
        sql.setLength(0);
        sql.trimToSize();

        sql.append("CREATE TABLE IF NO EXIST ").append(Contract.OPERATIONS_TABLE_NAME).append(" (")
                .append(Contract.ID_OPERATIONS_COLUMN_NAME).append(" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ")
                .append(Contract.ACCOUNT_ID_OPERATIONS_COLUMN_NAME).append(" INTEGER NOT NULL, ")
                .append(Contract.CATEGORY_ID_OPERATIONS_COLUMN_NAME).append(" INTEGER NOT NULL, ")
                .append(Contract.AMOUNT_OPERATIONS_COLUMN_NAME).append(" INTEGER NOT NULL, ")
                .append(Contract.DATE_OPERATIONS_COLUMN_NAME).append(" TEXT NOT NULL, ")
                .append(Contract.COMMENT_OPERATIONS_COLUMN_NAME).append(" TEXT);");
        db.execSQL(sql.toString());
        sql.setLength(0);
        sql.trimToSize();

        sql.append("CREATE TABLE IF NO EXIST ").append(Contract.CATEGORY_TABLE_NAME).append(" (")
                .append(Contract.ID_CATEGORY_COLUMN_NAME).append(" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ")
                .append(Contract.PARENT_ID_CATEGORY_COLUMN_NAME).append(" INTEGER, ")
                .append(Contract.NAME_CATEGORY_COLUMN_NAME).append(" TEXT NOT NULL);");
        db.execSQL(sql.toString());
        sql.setLength(0);
        sql.trimToSize();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
