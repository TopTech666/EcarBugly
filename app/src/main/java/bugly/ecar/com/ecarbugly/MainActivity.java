package bugly.ecar.com.ecarbugly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.bugly.crashreport.CrashReport;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrashReport.testJavaCrash();//搞事情，搞个测试bug
    }
}
