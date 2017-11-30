package com.calc.nijibox.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import java.util.ArrayList;

public class btn extends AppCompatActivity{

    String Temp;
    String Temp2;
    String Temp3;
    int Temp4;
    int Temp5;
    String log;

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

        //エラーチェックここで
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
            default:
                break;
        }

        //ただのログ書き込み
        logs.add(log);

        //shared preferences挿入
        SharedActivity.insert_shared(context,log);

        //DB挿入
        SqlActivity.insert_sql(context,log);

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
