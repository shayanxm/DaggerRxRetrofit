package com.example.daggerwithretrofit;

import android.app.Application;
import com.example.daggerwithretrofit.di.*;

import androidx.lifecycle.ViewModelProvider;

import com.example.daggerwithretrofit.di.DaggerNetComponet;
import com.example.daggerwithretrofit.di.NetComponet;

public class App extends Application {
NetComponet netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponet.builder()
                .applicationModule(new ApplicationModule(this))
                .netModule(new NetModule("https://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponet getNetComponent(){
        return netComponent;
    }
}
