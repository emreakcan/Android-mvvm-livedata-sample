package com.livedatamvvmretrofit.di;

import android.app.Application;

import com.livedatamvvmretrofit.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class,ActivityBuilder.class, AndroidSupportInjectionModule.class})
public interface ApplicationComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {

        @BindsInstance
        public abstract Builder application(Application application);

    }
}
