package com.livedatamvvmretrofit.di;

import android.app.Application;
import android.content.Context;

import com.livedatamvvmretrofit.data.AppDataManager;
import com.livedatamvvmretrofit.data.AppSchedulerProvider;
import com.livedatamvvmretrofit.data.DataManager;
import com.livedatamvvmretrofit.data.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}
