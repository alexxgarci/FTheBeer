import android.app.Application;

import com.parse.Parse;

/**
 * Created by Alex on 20/10/16.
 */

public class App extends Application {
    public void onCreate() {
        Parse.initialize(this);
    }
}
