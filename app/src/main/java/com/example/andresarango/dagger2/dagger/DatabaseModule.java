package com.example.andresarango.dagger2.dagger;

import com.example.andresarango.dagger2.database.MyDatabase;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andresarango on 12/3/16.
 */

@Module
public class DatabaseModule {

    @Provides
    public MyDatabase providesDatabase() {
        return new MyDatabase();
    }
}
