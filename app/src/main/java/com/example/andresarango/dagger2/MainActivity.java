package com.example.andresarango.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.andresarango.dagger2.network.GithubApi;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    GithubApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getComponent().inject(this);
        api.doSomething();
    }
}
