package com.chornyiya.myfin.data.source.local;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;

import com.chornyiya.myfin.data.Account;
import com.chornyiya.myfin.data.Category;
import com.chornyiya.myfin.data.Operation;
import com.chornyiya.myfin.data.source.DataSource;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class LocalDataSource implements DataSource {

    private static LocalDataSource INSTANCE;

    private DbHelper dbHelper;

    private LocalDataSource(@NonNull Context context) {
        checkNotNull(context);
        dbHelper = new DbHelper(context);
    }

    public static LocalDataSource getInstance(@NonNull Context context) {
        if (INSTANCE == null) {
            INSTANCE = new LocalDataSource(context);
        }
        return INSTANCE;
    }

    @Override
    public void getAccounts(@NonNull LoadAccountsCallback callback) {
        List<Account> accounts = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] colums = {
                Contract.ID_ACCOUNT_COLUMN_NAME,
                Contract.TYPE_ACCOUNT_COLUMN_NAME,
                Contract.NAME_ACCOUNT_COLUMN_NAME,
                Contract.AMOUNT_ACCOUNT_COLUMN_NAME,
                Contract.LAST_UPDATE_ACCOUNT_COLUMN_NAME
        };

        Cursor c = db.query(Contract.ACCOUNT_TABLE_NAME, colums, null, null, null, null, null);
        if (c != null && c.getCount() > 0) {
            while (c.moveToNext()) {
                int itemId = c.getInt(c.getColumnIndexOrThrow(Contract.ID_ACCOUNT_COLUMN_NAME));
                String name = c.getString(c.getColumnIndexOrThrow(Contract.NAME_ACCOUNT_COLUMN_NAME));
                String type = c.getString(c.getColumnIndexOrThrow(Contract.TYPE_ACCOUNT_COLUMN_NAME));
                int amount = c.getInt(c.getColumnIndexOrThrow(Contract.AMOUNT_ACCOUNT_COLUMN_NAME));
                String lastUpdate = c.getString(c.getColumnIndexOrThrow(Contract.LAST_UPDATE_ACCOUNT_COLUMN_NAME));
                Account account = new Account(itemId, type, name, amount, lastUpdate);
                accounts.add(account);
            }
        }

        if (c != null) {
            c.close();
        }

        db.close();

        if (accounts.isEmpty()) {
            callback.onDataNoAvailable();
        } else {
            callback.onLoaded(accounts);
        }
    }

    @Override
    public void getCategory(@NonNull LoadCategoriesCallback callback) {
        List<Category> categories = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] columns = {
                Contract.ID_CATEGORY_COLUMN_NAME,
                Contract.NAME_CATEGORY_COLUMN_NAME,
                Contract.PARENT_ID_CATEGORY_COLUMN_NAME,
        };

        Cursor c = db.query(Contract.CATEGORY_TABLE_NAME, columns, null, null, null, null, null);
        if (c != null && c.getCount() > 0){
            while (c.moveToNext()){
                int id = c.getInt(c.getColumnIndexOrThrow(Contract.ID_CATEGORY_COLUMN_NAME));
                String name = c.getString(c.getColumnIndexOrThrow(Contract.NAME_CATEGORY_COLUMN_NAME));
                int parentId = c.getInt(c.getColumnIndexOrThrow(Contract.PARENT_ID_CATEGORY_COLUMN_NAME));

                Category category = new Category(id,name,parentId);
                categories.add(category);
            }
        }

        if (c!=null){
            c.close();
        }
        db.close();
        if (categories.isEmpty()){
            callback.onDataNoAvailable();
        }else {
            callback.onLoaded(categories);
        }
    }

    @Override
    public void getOperations(@NonNull LoadOperationsCallback callback) {

    }

    @Override
    public void getAccount(@NonNull String accountId, @NonNull GetAccountCallback callback) {

    }

    @Override
    public void getOperation(@NonNull String operationId, @NonNull GetOperationCallback callback) {

    }

    @Override
    public void saveOperation(@NonNull Operation operation) {

    }

    @Override
    public void saveAccount(@NonNull Account account) {

    }

    @Override
    public void refreshAccounts() {

    }

    @Override
    public void increaseAccount(@NonNull String accountId, int amount) {

    }

    @Override
    public void decreaseAccount(@NonNull String accountId, int amount) {

    }

    @Override
    public void deleteAccount(@NonNull String accountId) {

    }

    @Override
    public void deleteOperation(@NonNull String operationId) {

    }
}
