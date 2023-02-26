package com.example.sigmafitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);



        newArray = new int[]{
                R.id.toetouch_pose,R.id.glutes_pose,R.id.pushups_pose,R.id.tricep_pose,R.id.sideheels_pose,
                R.id.lowerabs_pose,R.id.russian_pose,R.id.chrunches_pose,R.id.alternate_chrunches,R.id.plank_pose,R.id.finisher_pushups

        };
    }

    public void Imagebuttonclicked(View view) {


        for (int i=0;i< newArray.length;i++){

            if (view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(MainActivity3.this,ThirdActivity4.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);


            }
        }
    }
}