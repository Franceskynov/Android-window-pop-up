package com.demo.franceskynov.android_window_pop_up;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Franceskynov on 5/12/2017.
 */

public class PopUpImageByTime extends Activity {

    private double timeUp = 0.8; //Seconds

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindowbytime);


        timeUp = timeUp * 1000;
        DisplayMetrics dm =  new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width *.8), (int)(height *.6));

        ImageView imageView = (ImageView) findViewById(R.id.imageViewByTime);
        imageView.setImageResource(R.drawable.hztr);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep((long)timeUp);
                    PopUpImageByTime.this.finish();

                }catch (Exception e){
                    Toast.makeText(PopUpImageByTime.this, "", Toast.LENGTH_SHORT).show();
                }
            }
        }).start();
    }
}
