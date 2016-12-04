package com.example.andresarango.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.andresarango.dagger2.network.GithubApi;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    GithubApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ((MyApplication) getApplication()).getComponent().inject(this);
    }
}
