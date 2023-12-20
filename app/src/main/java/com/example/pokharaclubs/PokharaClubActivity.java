package com.example.pokharaclubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PokharaClubActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokhara_club);

        gridView=findViewById(R.id.gvClubs);
        String[] clubnames={"Club Amsterdam","Busy bee & bar","Dreamland Club","Prive Nepal","Paradiso Club"};
        String[] clubaddress={"Lakeside Marg","Baidam Road","Lakeside Road","Barani Chowk","Lake Side Road"};
        String[] clubtype={"Nightclub and Bar","Bar and Music Bar","Night Club","Lonuge and bar","NightClub and bar"};
        String[] clubtonightEvents={"DJ Shan and DJ Rocky on the Floor to bang the night",
                "Live Music Performace by 'The Pokhara band' from 8pm to 11 pm",
                "Karaoke night with a chance to win prizes for the best performacr from 8pm to 12pm",
                "Glow in the dark party with neon face painting and blacklight drinks from 10pm to 2 pm",
                "Musicial Night with Singer Rajesh"};
        int[] clubimages = {R.drawable.allthatjazz,R.drawable.amsterdam,R.drawable.dreamland,R.drawable.prive,R.drawable.th};
        ClubsAdapter myadapter=new ClubsAdapter(this,clubnames,clubtype,clubaddress,clubimages);
        gridView.setAdapter(myadapter);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent intent=new Intent(PokharaClubActivity.this,ClubsDetailActivity.class);
               intent.putExtra("CLUBNAME",clubnames[i]);
               intent.putExtra("CLUBTYPE",clubtype[i]);
               intent.putExtra("CLUBADDRESS",clubaddress[i]);
               intent.putExtra("CLUBTONIGHTEVENT",clubtonightEvents[i]);
               intent.putExtra("CLUBIMAGE",clubimages[i]);
               startActivity(intent);
           }
       });


    }
}