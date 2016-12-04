package com.example.andresarango.dagger2;

import android.app.Application;

import com.example.andresarango.dagger2.dagger.AppComponent;
import com.example.andresarango.dagger2.dagger.DaggerAppComponent;
import com.example.andresarango.dagger2.dagger.DatabaseModule;
import com.example.andresarango.dagger2.dagger.NetworkModule;

/**
 * Created by andresarango on 12/3/16.
 */

public class MyApplication extends Application {

    AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .networkModule(new NetworkModule())
                .databaseModule(new DatabaseModule())
                .build();
    }

    AppComponent getComponent() {
        return component;
    }
}
