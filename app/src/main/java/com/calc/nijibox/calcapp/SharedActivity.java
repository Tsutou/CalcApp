package com.calc.nijibox.calcapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class SharedActivity extends AppCompatActivity {

    private TextView textView;
    String logd;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shared);

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        SharedPreferences data = getSharedPreferences(btn.MyPREFERENCES, Context.MODE_PRIVATE);
        logd = data.getString(btn.value,"none");

        textView = findViewById(R.id.textView);
        StringBuilder stb = new StringBuilder();
        stb.append(logd);
        textView.setText(stb);
    }

}
