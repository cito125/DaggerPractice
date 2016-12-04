package com.example.andresarango.dagger2.dagger;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by andresarango on 12/3/16.
 */

@Qualifier
@Retention(RUNTIME)
public @interface GithubApiKey {
}
