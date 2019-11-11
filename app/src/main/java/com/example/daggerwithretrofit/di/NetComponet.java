package com.example.daggerwithretrofit.di;

import com.example.daggerwithretrofit.MainActivity;

import dagger.Component;

@Component(modules = {ApplicationModule.class,NetModule.class})
public interface NetComponet {
    void InjectMainActivity(MainActivity mainActivity);
}
