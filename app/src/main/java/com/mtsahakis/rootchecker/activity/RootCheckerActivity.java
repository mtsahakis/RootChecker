package com.mtsahakis.rootchecker.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mtsahakis.rootchecker.R;
import com.mtsahakis.rootchecker.util.RootChecker;

public class RootCheckerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_checker);

        TextView text = (TextView)findViewById(R.id.text);
        boolean isRooted = RootChecker.isRooted(this);
        if(isRooted) {
            text.setText(R.string.device_is_rooted);
        } else {
            text.setText(R.string.device_is_not_rooted);
        }
    }
}
