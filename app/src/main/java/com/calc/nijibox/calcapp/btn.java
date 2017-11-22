package com.calc.nijibox.calcapp;

/**
 * Created by nijimac103 on 2017/11/22.
 */

public class btn {
    String Temp;
    String Temp2;
    String Temp3;
    int Temp4;
    int Temp5;

    String NumBtn(String Numbers, String Now){
        Temp = Numbers;

        if(Now == "0"|| Now == ""){
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
                break;
            case 2:
                Temp4 = Integer.parseInt(Temp3) - Integer.parseInt(Now);
                break;
            case 3:
                Temp4 = Integer.parseInt(Temp3) * Integer.parseInt(Now);
                break;
            case 4:
                Temp4 = Integer.parseInt(Temp3) / Integer.parseInt(Now);
                break;
        }

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
