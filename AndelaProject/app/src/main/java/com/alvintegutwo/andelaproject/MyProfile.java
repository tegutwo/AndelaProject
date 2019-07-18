package com.alvintegutwo.andelaproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfile extends Activity {
    ImageView a;
    TextView names,track,country,email,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myprofile);
        names = findViewById(R.id.textName);
        track = findViewById(R.id.track);
        country = findViewById(R.id.Country);
        email = findViewById(R.id.Email);
        phone = findViewById(R.id.PhoneNumber);
        a= findViewById(R.id.profileImg);
        names.setText("ALVIN TEGUTWO");
        track.setText("TRACK :  ANDROID DEVELOPMENT");
        country.setText("COUNTRY:   KENYA");
        email.setText("EMAIL: alvintegutwo@gmail.com");
            phone.setText("NUMBER: 0704249323");
        a.setImageResource(R.drawable.alvin);



    }
}
