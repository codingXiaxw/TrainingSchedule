package com.example.codingboy.educationexe.thirdday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codingboy.educationexe.MainActivity;
import com.example.codingboy.educationexe.R;
import com.example.codingboy.educationexe.ShowData;
import com.example.codingboy.educationexe.ShowPhotoActivity;
import com.example.codingboy.educationexe.secondday.SecondPage2Pm;

/**
 * Created by codingBoy on 16/5/9.
 */
public class SecondPage3 extends Activity implements View.OnClickListener
{
    private Button topic1,topic2,person1,person2,back;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second3);
        back= (Button) findViewById(R.id.back);
        topic1= (Button) findViewById(R.id.topic_1);
        person1= (Button) findViewById(R.id.person_1);
        topic2= (Button) findViewById(R.id.topic_2);
        person2= (Button) findViewById(R.id.person_2);

        back.setOnClickListener(this);
        topic1.setOnClickListener(this);
        person1.setOnClickListener(this);
        topic2.setOnClickListener(this);
        person2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.back:
                Intent intent=new Intent(SecondPage3.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.topic_1:
                Intent i40=new Intent(SecondPage3.this,ShowPhotoActivity.class);
                i40.putExtra("data",40);
                startActivity(i40);
                break;
            case R.id.person_1:
                Intent i24=new Intent(SecondPage3.this,ShowData.class);
                i24.putExtra("data",24);
                i24.putExtra("id",666);
                startActivity(i24);
                finish();
                break;
            case R.id.topic_2:
                Intent i50=new Intent(SecondPage3.this,ShowPhotoActivity.class);
                i50.putExtra("data",50);
                startActivity(i50);
                break;
            case R.id.person_2:
                Intent i25=new Intent(SecondPage3.this,ShowData.class);
                i25.putExtra("data",25);
                i25.putExtra("id",666);
                startActivity(i25);
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
