package com.example.daggerwithretrofit.di;

import android.app.Application;

import com.example.daggerwithretrofit.App;

import dagger.Module;
import dagger.Provides;
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }
    @Provides
    Application provideApplication(){

        return application;

    }
}
