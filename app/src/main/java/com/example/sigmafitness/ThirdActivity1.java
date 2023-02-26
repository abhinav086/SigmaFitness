package com.example.sigmafitness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity1 extends AppCompatActivity {

    String buttonValue;
    public   Button countdownButton;
    private CountDownTimer countDownTimer;
    public   TextView countdownText;
    private boolean timeRunning;
    public long timeLeftinMills = 60000;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third1);


        Intent intent = getIntent();
        buttonValue = intent.getStringExtra("value");


        int intvalue = Integer.parseInt(buttonValue);
        switch (intvalue){

            case 1:
                setContentView(R.layout.activity_aa);
                break;
            case 2:
                setContentView(R.layout.activity_bb);
                break;
            case 3:
                setContentView(R.layout.activity_cc);
                break;
            case 4:
                setContentView(R.layout.activity_dd);
                break;
            case 5:
                setContentView(R.layout.activity_ee);
                break;
            case 6:
                setContentView(R.layout.activity_ff);
                break;
            case 7:
                setContentView(R.layout.activity_gg);
                break;
            case 8:
                setContentView(R.layout.activity_hh);
                break;
            case 9:
                setContentView(R.layout.activity_ii);
                break;
            case 10:
                setContentView(R.layout.activity_jj);
                break;
            case 11:
                setContentView(R.layout.activity_kk);
                break;

        }

        countdownButton = findViewById(R.id.startbutton);
        countdownText = findViewById(R.id.time);


        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     startStop();

            }
        });

    }
    public void startStop(){
        if (timeRunning){
            stopTimer();
        }else {
            startTimer();
        }

    }

    public void startTimer(){
        countDownTimer = new CountDownTimer(timeLeftinMills,1000) {
            @Override
            public void onTick(long c) {
                timeLeftinMills = c;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();

        countdownButton.setText("PAUSE");
        timeRunning = true;
    }

    public void stopTimer(){
        countDownTimer.cancel();
        countdownButton.setText("START");
        timeRunning = false;
    }

    @SuppressLint("SuspiciousIndentation")
    public void updateTimer(){
        int minutes = (int) timeLeftinMills / 600000;
        int seconds = (int) timeLeftinMills % 600000 / 1000;

        String timeLeftText;
        timeLeftText = "" + minutes;
        timeLeftText +=":";
        if (seconds<10)timeLeftText +="0";
                timeLeftText +=seconds;
                countdownText.setText(timeLeftText);
    }

}