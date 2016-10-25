package com.chornyiya.myfin.data.source;

import android.support.annotation.NonNull;

import com.chornyiya.myfin.data.Account;
import com.chornyiya.myfin.data.Category;
import com.chornyiya.myfin.data.Operation;

import java.util.List;

public interface DataSource {
    interface LoadAccountsCallback {
        void onLoaded(List<Account> accounts);

        void onDataNoAvailable();
    }

    interface LoadCategoriesCallback {
        void onLoaded(List<Category> categories);

        void onDataNoAvailable();
    }

    interface LoadOperationsCallback {
        void onLoaded(List<Operation> operations);

        void onDataNoAvailable();
    }

    interface GetAccountCallback {
        void onLoaded(Account account);

        void onDataNotAvailable();
    }

    interface GetOperationCallback {
        void onLoaded(Operation operation);

        void onDataNoAvailable();
    }

    void getAccounts(@NonNull LoadAccountsCallback callback);

    void getCategory(@NonNull LoadCategoriesCallback callback);

    void getOperations(@NonNull LoadOperationsCallback callback);

    void getAccount(@NonNull String accountId, @NonNull GetAccountCallback callback);

    void getOperation(@NonNull String operationId, @NonNull GetOperationCallback callback);

    void saveOperation(@NonNull Operation operation);

    void saveAccount(@NonNull Account account);

    void refreshAccounts();

    void increaseAccount(@NonNull String accountId, int amount);

    void decreaseAccount(@NonNull String accountId, int amount);

    void deleteAccount(@NonNull String accountId);

    void deleteOperation(@NonNull String operationId);

}
