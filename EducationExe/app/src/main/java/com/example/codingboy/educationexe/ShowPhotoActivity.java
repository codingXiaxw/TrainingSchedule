package com.example.codingboy.educationexe;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewSwitcher;

/**
 * Created by codingBoy on 16/5/20.
 */
public class ShowPhotoActivity extends Activity implements ViewSwitcher.ViewFactory,View.OnTouchListener
{
    private ImageSwitcher imageSwitcher;
    private int[] imgIds;
    private int currentposition;
    private float downX;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageswitcher);

        getData();

        imageSwitcher= (ImageSwitcher) findViewById(R.id.imageSwitcher1);
        imageSwitcher.setFactory(this);
        imageSwitcher.setOnTouchListener(this);





        currentposition=0;
        imageSwitcher.setImageResource(imgIds[currentposition]);
    }




    public void getData()
    {
        int data=getIntent().getIntExtra("data",0);
        switch (data)
        {
            case 1:
                imgIds= new int[]{R.drawable.zhang1,  R.drawable.zhang3, R.drawable.zhang4, R.drawable.zhang5,
                        R.drawable.zhang7, R.drawable.zhang8, R.drawable.zhang9, R.drawable.zhang10, R.drawable.zhang11, R.drawable.zhang12,
                        R.drawable.zhang13, R.drawable.zhang14, R.drawable.zhang15, R.drawable.zhang16, R.drawable.zhang17, R.drawable.zhang18,
                        R.drawable.zhang20, R.drawable.zhang21, R.drawable.zhang22, R.drawable.zhang23, R.drawable.zhang24, R.drawable.zhang25,
                        R.drawable.zhang26, R.drawable.zhang27, R.drawable.zhang28, R.drawable.zhang29, R.drawable.zhang30, R.drawable.zhang31,
                        R.drawable.zhang32};
                break;
            case 3:
                imgIds=new int[]{R.drawable.dong1,R.drawable.dong2,R.drawable.dong3,
                        R.drawable.dong8,R.drawable.dong9,R.drawable.dong10,R.drawable.dong11,
                        R.drawable.dong19,R.drawable.dong24,
                        R.drawable.dong33,
                        R.drawable.dong38,R.drawable.dong39,R.drawable.dong42,
                        R.drawable.dong44,R.drawable.dong45,R.drawable.dong46};
                break;
            case 9:
                imgIds=new int[]{R.drawable.yang1,R.drawable.yang2,R.drawable.yang3,R.drawable.yang4,R.drawable.yang5,R.drawable.yang6,
                        R.drawable.yang7,R.drawable.yang8,R.drawable.yang9,R.drawable.yang10};
                break;
            case 40:
                imgIds=new int[]{R.drawable.guo1,R.drawable.guo2,R.drawable.guo3,R.drawable.guo4,R.drawable.guo5,R.drawable.guo6,R.drawable.guo7,
                        R.drawable.guo8,
                        R.drawable.guo9,R.drawable.guo10,R.drawable.guo11,R.drawable.guo12,R.drawable.guo13,R.drawable.guo14,R.drawable.guo15,
                        R.drawable.guo16,R.drawable.guo17,R.drawable.guo18,R.drawable.guo19,R.drawable.guo20,R.drawable.guo21,R.drawable.guo22,
                        R.drawable.guo23,R.drawable.guo24,R.drawable.guo25,R.drawable.guo26,R.drawable.guo27,R.drawable.guo28,R.drawable.guo29,
                        R.drawable.guo30,R.drawable.guo31,R.drawable.guo32,R.drawable.guo33,R.drawable.guo34,R.drawable.guo35,R.drawable.gup37,R.drawable.gup38};
                break;
            case 50:
                imgIds=new int[]{R.drawable.liu1,R.drawable.liu2,R.drawable.liu3,R.drawable.liu4,R.drawable.liu5,R.drawable.liu6,R.drawable.liu7,
                        R.drawable.liu8,R.drawable.liu9,R.drawable.liu10,R.drawable.liu11,R.drawable.liu12,R.drawable.liu13,R.drawable.liu14,R.drawable.liu15,
                        R.drawable.liu16,R.drawable.liu17,R.drawable.liu18,R.drawable.liu19,R.drawable.liu20,R.drawable.liu21,R.drawable.liu22,R.drawable.liu23,
                        R.drawable.liu24,R.drawable.liu25,R.drawable.liu26,R.drawable.liu27,R.drawable.liu28,R.drawable.liu29,R.drawable.liu30,R.drawable.liu31,
                        R.drawable.liu32,R.drawable.liu33,R.drawable.liu34,R.drawable.liu35,R.drawable.liu36,R.drawable.liu37};
                break;
            default:
                break;


        }
    }






    @Override
    public View makeView() {
        final ImageView i=new ImageView(this);
        i.setBackgroundColor(0xff000000);
        i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return i;
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                downX=event.getX();
                break;
            case MotionEvent.ACTION_UP:
            {
                float lastX=event.getX();
                if (lastX>downX)
                {
                    if (currentposition>0)
                    {
                        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(ShowPhotoActivity.this, R.anim.left_in));
                        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(ShowPhotoActivity.this, R.anim.right_out));
                        currentposition--;
                        imageSwitcher.setImageResource(imgIds[currentposition % imgIds.length]);
                    }else
                    {
                        Toast.makeText(this,"已经是第一张",Toast.LENGTH_SHORT).show();
                    }
                }
                if (lastX<downX)
                {
                    if (currentposition<imgIds.length-1)
                    {
                        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(getApplication(), R.anim.right_in));
                        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(getApplication(),R.anim.left_out));
                        currentposition++;
                        imageSwitcher.setImageResource(imgIds[currentposition]);

                    }else
                    {
                        Toast.makeText(getApplication(),"已经是最后一张",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;
        }

        return true;
    }

    @Override
    public void onBackPressed()
    {
        finish();
    }
}