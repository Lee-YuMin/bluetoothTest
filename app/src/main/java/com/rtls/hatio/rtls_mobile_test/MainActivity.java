package com.rtls.hatio.rtls_mobile_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent i = new Intent(this, DeviceScanActivity.class);
//        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent i = new Intent(this, DeviceScanActivity.class);
        startActivity(i);
    }
}
