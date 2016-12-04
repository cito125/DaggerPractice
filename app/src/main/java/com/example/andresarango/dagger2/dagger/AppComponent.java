package com.example.andresarango.dagger2.dagger;

import com.example.andresarango.dagger2.MainActivity;
import com.example.andresarango.dagger2.SecondActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by andresarango on 12/3/16.
 */

@Singleton
@Component(modules = { NetworkModule.class, DatabaseModule.class })
public interface AppComponent {

    void inject(MainActivity activity);

    void inject(SecondActivity activity);
}
