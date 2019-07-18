package com.alvintegutwo.andelaproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity  {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button buttonName1,buttonName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonName1= findViewById(R.id.button1);
        buttonName1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,AboutALC.class);
                startActivity(i);
            }
        });
        buttonName2= findViewById(R.id.button2);
        buttonName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,MyProfile.class);
                startActivity(j);
            }
        });

    }


}
