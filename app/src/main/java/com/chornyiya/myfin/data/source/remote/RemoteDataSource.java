package com.chornyiya.myfin.data.source.remote;

import android.support.annotation.NonNull;

import com.chornyiya.myfin.data.Account;
import com.chornyiya.myfin.data.Operation;
import com.chornyiya.myfin.data.source.DataSource;

/**
 * Created by y.chornyi on 21.10.2016.
 */

public class RemoteDataSource implements DataSource {
    private static RemoteDataSource INSTANCE;
    public static RemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource();
        }
        return INSTANCE;
    }

    @Override
    public void getAccounts(@NonNull LoadAccountsCallback callback) {

    }

    @Override
    public void getCategory(@NonNull LoadCategoriesCallback callback) {

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
