package com.wos.live.plugindemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * M0 第七步的最小假插件：一个 Activity，界面上就显示一行文字 "Hello Plugin"。
 */
public class HelloPluginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_plugin);
    }
}
