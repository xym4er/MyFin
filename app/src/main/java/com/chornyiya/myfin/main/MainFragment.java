package com.chornyiya.myfin.main;

import android.support.v4.app.Fragment;

public class MainFragment extends Fragment implements MainContract.View {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void showAccounts() {

    }

    @Override
    public void showAddAccount() {

    }

    @Override
    public void showIncreaseAccount() {

    }

    @Override
    public void showDecreaseAccount() {

    }

    @Override
    public void showAccountDetailsUI() {

    }

    @Override
    public void showLoadingAccountError() {

    }

    @Override
    public void showNoAccounts() {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
