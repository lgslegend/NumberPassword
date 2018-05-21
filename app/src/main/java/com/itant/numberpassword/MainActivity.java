package com.itant.numberpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.itant.npassword.NumberPassword;
import com.itant.npassword.OnPasswordChangeListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPassword np_test = findViewById(R.id.np_test);
        np_test.setOnPasswordChangeListener(new OnPasswordChangeListener() {
            @Override
            public void onPasswordChange(String currentPassword) {
                Log.i("np", currentPassword);
            }
        });
    }
}