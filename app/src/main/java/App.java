import android.app.Application;

import com.parse.Parse;

/**
 * Created by Alex on 20/10/16.
 */

public class App extends Application {
    public void onCreate() {
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aca0ff6ee321d614ffeaf3f27dff9efe78a8be35")
                .clientKey(null)
                .server("http://192.168.191.127:1337/parse/") // The trailing slash is important.


        .build()
        );
    }
}
