package seniordesign.nigel;

/**
 * Created by Fenel on 12/26/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseUser;

public class DispatchActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, R.string.parse_app_id, R.string.parse_client_key);

        //Check if application is signed in
        if (ParseUser.getCurrentUser() != null) {
            startActivity(new Intent(this, MainActivity.class));
        } else {
            startActivity(new Intent(this, SignInActivity.class));
        }
    }
}
