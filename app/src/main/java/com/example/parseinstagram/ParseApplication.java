package com.example.parseinstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hmz-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("hmzMasterKey")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://hmz-instagram-codepath.herokuapp.com/parse").build());
    }
}
