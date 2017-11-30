package com.calc.nijibox.calcapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    String Number = "0";
    String relay  = "";
    boolean tow = false;
    private TextView counter_text;

    private Button push_btnAdd;
    private Button push_btnSub;
    private Button push_btnMulti;
    private Button push_btnDiv;

    private Button push_buttonEqual;
    private Button push_buttonAc;
    private Button push_log;
    private Button push_shared;
    private Button push_sql;

    private Button push_btn0;
    private Button push_btn1;
    private Button push_btn2;
    private Button push_btn3;
    private Button push_btn4;
    private Button push_btn5;
    private Button push_btn6;
    private Button push_btn7;
    private Button push_btn8;
    private Button push_btn9;

    btn BT = new btn();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         counter_text = (TextView) findViewById(R.id.editText);
         push_btnAdd = (Button) findViewById(R.id.buttonAddition);
         push_btnSub = (Button) findViewById(R.id.buttonSubtract);
         push_btnMulti = (Button) findViewById(R.id.buttonMulti);
         push_btnDiv = (Button) findViewById(R.id.buttonDivision);

         push_buttonEqual = (Button) findViewById(R.id.buttonEqual);
         push_buttonAc = (Button) findViewById(R.id.buttonAllClear);
         push_log = (Button) findViewById(R.id.buttonLog);
         push_shared = (Button) findViewById(R.id.buttonShared);
         push_sql = (Button) findViewById(R.id.buttonSql);

         push_btn0 = (Button) findViewById(R.id.button0);
         push_btn1 = (Button) findViewById(R.id.button1);
         push_btn2 = (Button) findViewById(R.id.button2);
         push_btn3 = (Button) findViewById(R.id.button3);
         push_btn4 = (Button) findViewById(R.id.button4);
         push_btn5 = (Button) findViewById(R.id.button5);
         push_btn6 = (Button) findViewById(R.id.button6);
         push_btn7 = (Button) findViewById(R.id.button7);
         push_btn8 = (Button) findViewById(R.id.button8);
         push_btn9 = (Button) findViewById(R.id.button9);


        //Intentを取得
        Intent intent = getIntent();
        //intentから指定キーの文字列を取得する
        String data = intent.getStringExtra("history");
        counter_text.setText(data);

        push_btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "0" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn1.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 Number = BT.NumBtn( "1" , Number);
                 counter_text.setText(relay + Number);
            }
         });

        push_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "2" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "3" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "4" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "5" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "6" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "7" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "8" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Number = BT.NumBtn( "9" , Number);
                counter_text.setText(relay + Number);
            }
        });

        push_btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tow){
                    Number = BT.Equal(MainActivity.this,Number);
                    BT.Temp(Number, 1);
                    relay = Number + "+";
                    Number = "";
                    counter_text.setText(relay + Number);
                }else {
                    BT.Temp(Number, 1);
                    tow = true;
                    relay = Number + "+";
                    Number = "";
                    counter_text.setText(relay + Number);
                }
            }
        });

        push_btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tow){
                    Number = BT.Equal(MainActivity.this,Number);
                    BT.Temp(Number, 2);
                    relay = Number + "-";
                    Number = "";
                    counter_text.setText(relay + Number);
                }else {
                    BT.Temp(Number, 2);
                    tow = true;
                    relay = Number + "-";
                    Number = "";
                    counter_text.setText(relay + Number);
                }
            }
        });


        push_btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tow){
                    Number = BT.Equal(MainActivity.this,Number);
                    BT.Temp(Number, 3);
                    relay = Number + "×";
                    Number = "";
                    counter_text.setText(relay + Number);
                }else {
                    BT.Temp(Number, 3);
                    tow = true;
                    relay = Number + "×";
                    Number = "";
                    counter_text.setText(relay + Number);
                }
            }
        });

        push_btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tow){
                    Number = BT.Equal(MainActivity.this,Number);
                    BT.Temp(Number, 4);
                    relay = Number + "÷";
                    Number = "";
                    counter_text.setText(relay + Number);
                }else {
                    BT.Temp(Number, 4);
                    tow = true;
                    relay = Number + "÷";
                    Number = "";
                    counter_text.setText(relay + Number);
                }
            }
        });


        push_buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number = BT.Equal(MainActivity.this,Number);
                tow = false;
                counter_text.setText(Number);
            }
        });

        push_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), LogActivity.class);
                startActivity(intent);
            }
        });

        push_shared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SharedActivity.class);
                startActivity(intent);
            }
        });

        push_sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SqlActivity.class);
                startActivity(intent);
            }
        });

        push_buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT.Clear();
                Number = "0";
                relay = "";
                counter_text.setText(Number);
            }
        });


    }
}
