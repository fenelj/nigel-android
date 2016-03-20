package seniordesign.nigel;

/**
 * Created by Fenel on 1/16/2016.
 */

import android.app.Application;

import com.parse.Parse;

public class NigelActivity extends Application {
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        //Parse.initialize(this, getString(R.string.parse_app_id), getString(R.string.parse_client_key));
    }
}