package com.calc.nijibox.calcapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.widget.TextViewCompat;
import android.util.Log;

import java.util.ArrayList;

public class btn extends AppCompatActivity{

    Context mcontext;
    String Temp;
    String Temp2;
    String Temp3;
    int Temp4;
    int Temp5;
    String log;

    private static SharedPreferences sharedpreferences;

    public static final String MyPREFERENCES = "myprefs";
    public static final  String value = "log";

    public static ArrayList<String> logs = new ArrayList<>();

    String NumBtn(String Numbers, String Now){
        Temp = Numbers;

        if(Now.equals("0") || Now.equals("")){
            Temp = Numbers;
        }else{
            Temp = Now + Temp;
        }
        return Temp;
    }

    //前回の計算結果
    void Temp(String oldNum, int swift) {
        Temp3 = oldNum;
        Temp5 = swift;
    }

    String Equal(Context context,String Now){
        mcontext = context;

        sharedpreferences = mcontext.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        switch(Temp5){
            case 1:
                Temp4 = Integer.parseInt(Temp3) + Integer.parseInt(Now);
                log = Temp3 + " " + "+" + " " + Now + " " + "="+ " " + Temp4 + "\n";
                break;
            case 2:
                Temp4 = Integer.parseInt(Temp3) - Integer.parseInt(Now);
                log = Temp3 + " " + "-" + " " + Now + " " + "="+ " " + Temp4 + "\n";
                break;
            case 3:
                Temp4 = Integer.parseInt(Temp3) * Integer.parseInt(Now);
                log = Temp3 + " " + "×" + " " + Now + " " + "="+ " " + Temp4 + "\n";
                break;
            case 4:
                Temp4 = Integer.parseInt(Temp3) / Integer.parseInt(Now);
                log = Temp3 + " " + "÷" + " " + Now + " " + "="+ " " + Temp4 + "\n";
                break;
        }

        logs.add(log);

        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(value,log);
        editor.apply();
        return String.valueOf(Temp4);

    }

    void Clear(){
        Temp = "";
        Temp2 = "";
        Temp3 = "";
        Temp4 = 0;
        Temp5 = 0;
    }

}
