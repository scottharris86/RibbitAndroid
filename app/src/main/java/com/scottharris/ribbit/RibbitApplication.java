package com.scottharris.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by scottharris on 6/19/15.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        String appId = getString(R.string.application_id);
        String client = getString(R.string.client_key);

        Parse.initialize(this, appId, client);


    }

}
