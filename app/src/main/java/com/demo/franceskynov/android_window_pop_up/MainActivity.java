package com.demo.franceskynov.android_window_pop_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPopUp;
    Button btnPopUpByTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopUpByTime = (Button) findViewById(R.id.btnPopUpByTime);
        btnPopUpByTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PopUpImageByTime.class);
                startActivity(intent);
            }
        });

        btnPopUp = (Button) findViewById(R.id.btnPopUp);
        btnPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PopUpImage.class);
                startActivity(intent);
            }
        });
    }
}

