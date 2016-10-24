package com.chornyiya.myfin.main;

import android.support.annotation.NonNull;

import com.chornyiya.myfin.BasePresenter;
import com.chornyiya.myfin.BaseView;
import com.chornyiya.myfin.data.Account;

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void showAccounts();

        void showAddAccount();

        void showIncreaseAccount();

        void showDecreaseAccount();

        void showAccountDetailsUI();

        void showLoadingAccountError();

        void showNoAccounts();

        boolean isActive();
    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void loadAccounts(boolean forceUpdate);

        void addNewAccount();

        void increaseAccount();

        void decreaseAccount();

        void openAccountDetails(@NonNull Account requestedAccount);

    }

}
