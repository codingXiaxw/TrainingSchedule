package com.example.codingboy.educationexe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by codingBoy on 16/5/20.
 */
public class Ceremony extends Activity {

    private ImageView text;
    private Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ceremony);

        text= (ImageView) findViewById(R.id.ceremony);
        backbtn= (Button) findViewById(R.id.back);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Ceremony.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        text.setImageResource(R.drawable.ceremony);

    }
    @Override
    public void onBackPressed()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
