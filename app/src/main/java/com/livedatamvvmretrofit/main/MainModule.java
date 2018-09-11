package com.livedatamvvmretrofit.main;

import com.livedatamvvmretrofit.data.DataManager;
import com.livedatamvvmretrofit.data.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    MainViewModel provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new MainViewModel(dataManager, schedulerProvider);
    }

}
