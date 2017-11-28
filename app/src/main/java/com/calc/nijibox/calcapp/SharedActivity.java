package com.calc.nijibox.calcapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class SharedActivity extends AppCompatActivity {

    private static SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "myprefs";
    public static final  String value = "log";
    private EditText editText;
    private TextView textWrite, textRead;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shared);
    }

}
