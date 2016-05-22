package com.example.codingboy.educationexe.secondday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codingboy.educationexe.MainActivity;
import com.example.codingboy.educationexe.R;
import com.example.codingboy.educationexe.ShowData;
import com.example.codingboy.educationexe.ShowPhotoActivity;

/**
 * Created by codingBoy on 16/5/9.
 */
public class SecondPage2 extends Activity implements View.OnClickListener
{
    private Button topic1,topic2,person1,person2,back,amClock,pmClock,pmClock2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2);
        back= (Button) findViewById(R.id.back);
        topic1= (Button) findViewById(R.id.topic_1);
        person1= (Button) findViewById(R.id.person_1);
        topic2= (Button) findViewById(R.id.topic_2);
        person2= (Button) findViewById(R.id.person_2);
        amClock= (Button) findViewById(R.id.amClock);
        pmClock= (Button) findViewById(R.id.pmClock);
        pmClock2= (Button) findViewById(R.id.pmClock2);

        back.setOnClickListener(this);
        topic1.setOnClickListener(this);
        person1.setOnClickListener(this);
        topic2.setOnClickListener(this);
        person2.setOnClickListener(this);
        amClock.setOnClickListener(this);
        pmClock.setOnClickListener(this);
        pmClock2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.back:
                Intent intent=new Intent(SecondPage2.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.topic_1:
                Intent i5=new Intent(SecondPage2.this,ShowData.class);
                i5.putExtra("data",5);
                i5.putExtra("id",333);
                startActivity(i5);
                finish();
                break;
            case R.id.person_1:
                Intent i15=new Intent(SecondPage2.this,ShowData.class);
                i15.putExtra("data",15);
                i15.putExtra("id",333);
                startActivity(i15);
                finish();
                break;
            case R.id.topic_2:
                Intent i6=new Intent(SecondPage2.this,ShowData.class);
                i6.putExtra("data",6);
                i6.putExtra("id",333);
                startActivity(i6);
                finish();
                break;
            case R.id.person_2:
                Intent i16=new Intent(SecondPage2.this,ShowData.class);
                i16.putExtra("data",16);
                i16.putExtra("id",333);
                startActivity(i16);
                finish();
                break;
            case R.id.amClock:
                break;
            case R.id.pmClock:
                Intent intent2=new Intent(SecondPage2.this,SecondPage2Pm.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.pmClock2:
                Intent intent3=new Intent(SecondPage2.this,SecondPage2Pm2.class);
                startActivity(intent3);
                finish();
                break;
            default:
                break;
        }
    }
    @Override
    public void onBackPressed()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
