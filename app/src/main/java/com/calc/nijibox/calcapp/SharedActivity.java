package com.calc.nijibox.calcapp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
    private static SharedPreferences sharedpreferences;
    private static Context mcontext;

    public static final String MyPREFERENCES = "myprefs";
    public static final  String value = "log";

    //insert関数
    public static void insert_shared(Context context,String str){
        mcontext = context;
        sharedpreferences = mcontext.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(value,str);
        editor.apply();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shared);

        //もどるボタン
        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //Sharedpreferencesインスタンスをデフォルト値とともに文字列変換
        SharedPreferences data = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        logd = data.getString(value,"none");

        //ビューにadd
        textView = findViewById(R.id.textView);
        StringBuilder stb = new StringBuilder();
        stb.append(logd);
        textView.setText(stb);
    }

}
