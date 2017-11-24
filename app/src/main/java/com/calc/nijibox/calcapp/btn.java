package com.calc.nijibox.calcapp;


import android.support.v4.widget.TextViewCompat;
import android.util.Log;

import java.util.ArrayList;

public class btn {
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

    String Equal(String Now){

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
