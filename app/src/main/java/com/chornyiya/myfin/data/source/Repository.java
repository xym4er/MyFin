package com.chornyiya.myfin.data.source;

import android.content.Context;
import android.support.annotation.NonNull;

import com.chornyiya.myfin.data.Account;
import com.chornyiya.myfin.data.Operation;
import com.chornyiya.myfin.data.source.local.LocalDataSource;
import com.chornyiya.myfin.data.source.remote.RemoteDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

public class Repository implements DataSource {

    private static Repository INSTANCE = null;

    private final DataSource remoteDataSource;

    private final DataSource localDataSource;

    private Repository(@NonNull DataSource tasksRemoteDataSource,
                            @NonNull DataSource tasksLocalDataSource) {
        remoteDataSource = checkNotNull(tasksRemoteDataSource);
        localDataSource = checkNotNull(tasksLocalDataSource);
    }

    public static Repository getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new Repository(RemoteDataSource.getInstance(), LocalDataSource.getInstance(context));
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
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
