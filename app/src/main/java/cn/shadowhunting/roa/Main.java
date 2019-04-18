package cn.shadowhunting.roa;

import android.app.Activity;
import android.os.Bundle;

import com.tencent.bugly.Bugly;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bugly.init(getApplicationContext(),"5bbc4bd82e",false);
    }
}
