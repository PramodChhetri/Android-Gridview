package com.example.pokharaclubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubsDetailActivity extends AppCompatActivity {

    TextView etClubname,etClubaddress,etClubtype,etClubTonightEvent;
    ImageView ivClubimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_detail);

        String clubname = getIntent().getStringExtra("CLUBNAME");
        String clubtype = getIntent().getStringExtra("CLUBTYPE");
        String clubaddress = getIntent().getStringExtra("CLUBADDRESS");
        String clubtonightEvent=getIntent().getStringExtra("CLUBTONIGHTEVENT");
        int clubimagesrc=getIntent().getIntExtra("CLUBIMAGE",0);

        etClubname = findViewById(R.id.tvDClubName);
        etClubtype = findViewById(R.id.tvDClubType);
        etClubaddress = findViewById(R.id.tvDClubAddress);
        etClubTonightEvent=findViewById(R.id.tvEvents);
        ivClubimage = findViewById(R.id.ivDClubImg);

        etClubname.setText(clubname);
        etClubaddress.setText("Address : "+clubaddress);
        etClubtype.setText(clubtype);
        etClubTonightEvent.setText("Tonight Events : "+clubtonightEvent);

        ivClubimage.setImageResource(clubimagesrc);

    }
}