package com.livedatamvvmretrofit;

import com.livedatamvvmretrofit.di.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class App extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends App> applicationInjector() {
        return DaggerApplicationComponent.builder().application(this).create(this);
    }
}
