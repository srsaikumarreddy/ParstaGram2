package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YlyEjbgcAYxKwO2BGAcGkvF927SsL1NrnGaGnb08")
                .clientKey("jggWh0ZZQhpRt7yJfAvGyt4rHaPVrc8KSWShfXD1")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
