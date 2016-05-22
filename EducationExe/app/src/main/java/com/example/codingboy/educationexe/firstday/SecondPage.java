package com.example.codingboy.educationexe.firstday;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.codingboy.educationexe.MainActivity;
import com.example.codingboy.educationexe.R;
import com.example.codingboy.educationexe.ShowData;
import com.example.codingboy.educationexe.ShowPhotoActivity;

/**
 * Created by codingBoy on 16/5/9.
 */
public class SecondPage extends Activity implements View.OnClickListener
{
    private Button topic1,topic2,person1,person2,amClock,pmClock;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        back= (Button)findViewById(R.id.back);
        topic1= (Button) findViewById(R.id.topic_1);
        person1= (Button) findViewById(R.id.person_1);
        topic2= (Button) findViewById(R.id.topic_2);
        person2= (Button) findViewById(R.id.person_2);
        amClock= (Button) findViewById(R.id.amClock);
        pmClock= (Button) findViewById(R.id.pmClock);

        back.setOnClickListener(this);
        topic1.setOnClickListener(this);
        person1.setOnClickListener(this);
        topic2.setOnClickListener(this);
        person2.setOnClickListener(this);
        amClock.setOnClickListener(this);
        pmClock.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.back:
                Intent intent=new Intent(SecondPage.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.topic_1:
                Intent i1=new Intent(SecondPage.this, ShowPhotoActivity.class);
                i1.putExtra("data",1);
                startActivity(i1);
                break;
            case R.id.person_1:
                Intent i11=new Intent(SecondPage.this,ShowData.class);
                i11.putExtra("data",11);
                i11.putExtra("id",111);
                startActivity(i11);
                finish();
                break;
            case R.id.topic_2:
                Intent i2=new Intent(SecondPage.this,ShowData.class);
                i2.putExtra("data",2);
                i2.putExtra("id",111);
                startActivity(i2);
                finish();
                break;
            case R.id.person_2:
                Intent i12=new Intent(SecondPage.this,ShowData.class);
                i12.putExtra("data",12);
                i12.putExtra("id",111);
                startActivity(i12);
                finish();
                break;
            case R.id.amClock:
                break;
            case R.id.pmClock:
                Intent intent2=new Intent(SecondPage.this,SecondPagePm.class);
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
