package com.livedatamvvmretrofit.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.livedatamvvmretrofit.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}