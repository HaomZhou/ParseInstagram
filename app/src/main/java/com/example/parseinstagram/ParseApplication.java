package com.example.parseinstagram;

import android.app.Application;

import com.parse.Parse;
<<<<<<< HEAD
import com.parse.ParseObject;
=======
>>>>>>> 7c95a72a8c3c87e2af703df48fb8039c6dde1132

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
<<<<<<< HEAD
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hmz-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("hmzMasterKey")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://hmz-instagram-codepath.herokuapp.com/parse").build());
=======
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hmz-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("hmzMasterKey")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://hmz-instagram-codepath.herokuapp.com/parse").build());
>>>>>>> 7c95a72a8c3c87e2af703df48fb8039c6dde1132
    }
}
