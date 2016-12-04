package com.example.andresarango.dagger2.network;

/**
 * Created by andresarango on 12/3/16.
 */

import android.util.Log;

import com.example.andresarango.dagger2.database.MyDatabase;

/**
 * Some implementation
 */
public class GithubApiImpl implements GithubApi {

    private final String apiKey;

    public GithubApiImpl(Retrofit retrofit, MyDatabase database, String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void doSomething() {
        Log.d("TAG", "doSomething!" + apiKey);
    }
}
