package com.example.andresarango.dagger2.dagger;

import com.example.andresarango.dagger2.database.MyDatabase;
import com.example.andresarango.dagger2.network.GithubApi;
import com.example.andresarango.dagger2.network.GithubApiImpl;
import com.example.andresarango.dagger2.network.Retrofit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andresarango on 12/3/16.
 */

@Module
public class NetworkModule {

    @Singleton
    @Provides
    public GithubApi provideGithubApi(Retrofit retrofit,
                                      MyDatabase database,
                                      @GithubApiKey String apiKey) {
        return new GithubApiImpl(retrofit, database, apiKey);
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofit() {
        return new Retrofit();
    }

    @Singleton
    @GithubApiKey
    @Provides
    String provideGithubApiKey() {
        return "apiKey";
    }
}
