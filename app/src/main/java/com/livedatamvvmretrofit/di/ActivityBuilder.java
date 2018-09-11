package com.livedatamvvmretrofit.di;

import com.livedatamvvmretrofit.main.MainActivity;
import com.livedatamvvmretrofit.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMainActivity();

}
