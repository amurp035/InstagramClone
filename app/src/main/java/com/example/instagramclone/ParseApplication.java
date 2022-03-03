package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Z4aFej8LATmp7sILFdpfRVemkoMNMdNhp4d68GYV")
                .clientKey("fHWeGMYd1pQ70WIfwKqZFv7bdYviIytzwXZeGyRj")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
