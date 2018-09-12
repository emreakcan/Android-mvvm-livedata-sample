package com.livedatamvvmretrofit.main;

import android.arch.lifecycle.MutableLiveData;

import com.livedatamvvmretrofit.base.BaseViewModel;
import com.livedatamvvmretrofit.data.DataManager;
import com.livedatamvvmretrofit.data.SchedulerProvider;
import com.livedatamvvmretrofit.data.User;

import java.util.List;

public class MainViewModel extends BaseViewModel<MainView> {

    private final MutableLiveData<List<User>> userData;


    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        userData = new MutableLiveData<>();
    }

    public void loadQuestionCards() {
        getCompositeDisposable().add(getDataManager()
                .getQuestionCardData()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(userList -> {
                    if (userList != null) {
                        userData.setValue(userList);
                    }
                }, throwable -> {

                }));
    }

}
