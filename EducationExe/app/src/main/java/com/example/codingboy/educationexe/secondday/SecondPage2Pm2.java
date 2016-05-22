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
 * Created by codingBoy on 16/5/10.
 */
public class SecondPage2Pm2 extends Activity implements View.OnClickListener
{
    private Button topic3,topic4,topic5,back,amClock,pmClock,pmClock2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2pm2);
        back= (Button) findViewById(R.id.back);
        topic3= (Button) findViewById(R.id.topic_3);
        topic4= (Button) findViewById(R.id.topic_4);
        topic5= (Button) findViewById(R.id.topic_5);
        amClock= (Button) findViewById(R.id.amClock);
        pmClock= (Button) findViewById(R.id.pmClock);
        pmClock2= (Button) findViewById(R.id.pmClock2);

        back.setOnClickListener(this);
        topic3.setOnClickListener(this);
        topic4.setOnClickListener(this);
        topic5.setOnClickListener(this);
        amClock.setOnClickListener(this);
        pmClock.setOnClickListener(this);
        pmClock2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.back:
                Intent intent=new Intent(SecondPage2Pm2.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.topic_3:
                Intent i10=new Intent(SecondPage2Pm2.this,ShowData.class);
                i10.putExtra("data",10);
                i10.putExtra("id",555);
                startActivity(i10);
                finish();
                break;
            case R.id.topic_4:
                Intent i20=new Intent(SecondPage2Pm2.this,ShowData.class);
                i20.putExtra("data",20);
                i20.putExtra("id",555);
                startActivity(i20);
                finish();
                break;

            case R.id.topic_5:
                Intent i30=new Intent(SecondPage2Pm2.this,ShowData.class);
                i30.putExtra("data",30);
                i30.putExtra("id",555);
                startActivity(i30);
                finish();
                break;

            case R.id.amClock:
                Intent intent1=new Intent(SecondPage2Pm2.this,SecondPage2.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.pmClock:
                Intent intent2=new Intent(SecondPage2Pm2.this,SecondPage2Pm.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.pmClock2:
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
