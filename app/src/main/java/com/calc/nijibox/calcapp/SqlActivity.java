package com.calc.nijibox.calcapp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.calc.nijibox.calcapp.btn.logs;

public class SqlActivity extends AppCompatActivity {

    public static void insert_sql(Context context, String str){

        MyOpenHelper helper = new MyOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();

        ContentValues insertValues = new ContentValues();
        insertValues.put("formula", str);
        db.insert("logs", str, insertValues);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        LinearLayout layout = new LinearLayout(SqlActivity.this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        MyOpenHelper helper = new MyOpenHelper(this);
        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor c = db.query("logs", new String[] { "formula" }, null, null, null, null, null);

        boolean mov = c.moveToFirst();

        while(mov){
            TextView textView = new TextView(this);
            textView.setText(String.format("Log:%s", c.getString(0)));
            mov = c.moveToNext();
            layout.addView(textView);
        }

        c.close();
        db.close();

    }

}
