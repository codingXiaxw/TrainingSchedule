package com.example.codingboy.educationexe.firstday;

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
public class SecondPagePm extends Activity implements View.OnClickListener
{
    private Button topic3,topic4,person3,person4,back,amClock,pmClock;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpm);
        back= (Button) findViewById(R.id.back);
        topic3= (Button) findViewById(R.id.topic_3);
        person3= (Button) findViewById(R.id.person_3);
        topic4= (Button) findViewById(R.id.topic_4);
        person4= (Button) findViewById(R.id.person_4);
        amClock= (Button) findViewById(R.id.amClock);
        pmClock= (Button) findViewById(R.id.pmClock);

        back.setOnClickListener(this);
        topic3.setOnClickListener(this);
        person3.setOnClickListener(this);
        topic4.setOnClickListener(this);
        person4.setOnClickListener(this);
        amClock.setOnClickListener(this);
        pmClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.back:
                Intent intent=new Intent(SecondPagePm.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.topic_3:
                Intent i3=new Intent(SecondPagePm.this,ShowPhotoActivity.class);
                i3.putExtra("data",3);
                startActivity(i3);
                break;
            case R.id.person_3:
                Intent i13=new Intent(SecondPagePm.this,ShowData.class);
                i13.putExtra("data",13);
                i13.putExtra("id",222);
                startActivity(i13);
                finish();
                break;
            case R.id.topic_4:
                Intent i4=new Intent(SecondPagePm.this,ShowData.class);
                i4.putExtra("data",4);
                i4.putExtra("id",222);
                startActivity(i4);
                finish();
                break;
            case R.id.person_4:
                Intent i14=new Intent(SecondPagePm.this,ShowData.class);
                i14.putExtra("data",14);
                i14.putExtra("id",222);
                startActivity(i14);
                finish();
                break;
            case R.id.amClock:
                Intent intent1=new Intent(SecondPagePm.this,SecondPage.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.pmClock:
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
