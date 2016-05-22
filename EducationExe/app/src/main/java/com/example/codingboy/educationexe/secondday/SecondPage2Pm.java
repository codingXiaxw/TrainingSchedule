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
public class SecondPage2Pm extends Activity implements View.OnClickListener
{
    private Button topic3,topic4,topic5,person3,person4,person5,back,amClock,pmClock,pmClock2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2pm);
        back= (Button) findViewById(R.id.back);
        topic3= (Button) findViewById(R.id.topic_3);
        person3= (Button) findViewById(R.id.person_3);
        topic4= (Button) findViewById(R.id.topic_4);
        person4= (Button) findViewById(R.id.person_4);
        topic5= (Button) findViewById(R.id.topic_5);
        person5= (Button) findViewById(R.id.person_5);
        amClock= (Button) findViewById(R.id.amClock);
        pmClock= (Button) findViewById(R.id.pmClock);
        pmClock2= (Button) findViewById(R.id.pmClock2);

        back.setOnClickListener(this);
        topic3.setOnClickListener(this);
        person3.setOnClickListener(this);
        topic4.setOnClickListener(this);
        person4.setOnClickListener(this);
        topic5.setOnClickListener(this);
        person5.setOnClickListener(this);
        amClock.setOnClickListener(this);
        pmClock.setOnClickListener(this);
        pmClock2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.back:
                Intent intent=new Intent(SecondPage2Pm.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.topic_3:
                Intent i7=new Intent(SecondPage2Pm.this,ShowData.class);
                i7.putExtra("data",7);
                i7.putExtra("id",444);
                startActivity(i7);
                finish();
                break;
            case R.id.person_3:
                Intent i17=new Intent(SecondPage2Pm.this,ShowData.class);
                i17.putExtra("data",17);
                i17.putExtra("id",444);
                startActivity(i17);
                finish();
                break;
            case R.id.topic_4:
                Intent i8=new Intent(SecondPage2Pm.this,ShowData.class);
                i8.putExtra("data",8);
                i8.putExtra("id",444);
                startActivity(i8);
                finish();
                break;
            case R.id.person_4:
                Intent i18=new Intent(SecondPage2Pm.this,ShowData.class);
                i18.putExtra("data",18);
                i18.putExtra("id", 444);
                startActivity(i18);
                finish();
                break;
            case R.id.topic_5:
                Intent i9=new Intent(SecondPage2Pm.this,ShowPhotoActivity.class);
                i9.putExtra("data",9);
                startActivity(i9);
                break;
            case R.id.person_5:
                Intent i19=new Intent(SecondPage2Pm.this,ShowData.class);
                i19.putExtra("data",19);
                i19.putExtra("id",444);
                startActivity(i19);
                finish();
                break;
            case R.id.amClock:
                Intent intent1=new Intent(SecondPage2Pm.this,SecondPage2.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.pmClock:
                break;
            case R.id.pmClock2:
                Intent intent2=new Intent(SecondPage2Pm.this,SecondPage2Pm2.class);
                startActivity(intent2);
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
