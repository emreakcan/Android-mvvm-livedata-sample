package com.livedatamvvmretrofit.main;

import com.livedatamvvmretrofit.base.BaseViewModel;
import com.livedatamvvmretrofit.data.DataManager;
import com.livedatamvvmretrofit.data.SchedulerProvider;

public class MainViewModel extends BaseViewModel<MainView> {
    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
