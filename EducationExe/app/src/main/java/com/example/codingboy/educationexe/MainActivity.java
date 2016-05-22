package com.example.codingboy.educationexe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.codingboy.educationexe.firstday.SecondPage;
import com.example.codingboy.educationexe.secondday.SecondPage2;
import com.example.codingboy.educationexe.thirdday.SecondPage3;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView exercise;
    private Button first,second,third,ceremony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exercise= (TextView) findViewById(R.id.exercise);
        first= (Button) findViewById(R.id.first);
        second= (Button) findViewById(R.id.second);
        third= (Button) findViewById(R.id.third);
        ceremony= (Button) findViewById(R.id.ceremony);
        exercise.setText("培训日程");

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        ceremony.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.first:
                Intent intent=new Intent(MainActivity.this,SecondPage.class);
                startActivity(intent);
                finish();
                break;
            case R.id.second:
                Intent intent2=new Intent(MainActivity.this, SecondPage2.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.third:
                Intent intent3=new Intent(MainActivity.this, SecondPage3.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.ceremony:
                Intent intent4=new Intent(MainActivity.this,Ceremony.class);
                startActivity(intent4);
                finish();
            default:
                break;
        }
    }
}
