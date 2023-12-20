package com.example.pokharaclubs;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClubsAdapter extends ArrayAdapter<String> {

    Context context;
    String[] clubname;
    String[] clubaddress;
    String[] clubtype;

    int[] clubimage;

    ClubsAdapter(Context context, String[] clubname, String[] clubtype, String[] clubaddress, int[] clubimage) {
        super(context, R.layout.item_clubs, clubname);
        this.context = context;
        this.clubname = clubname;
        this.clubaddress = clubaddress;
        this.clubtype = clubtype;
        this.clubimage = clubimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v=((Activity)context).getLayoutInflater().inflate(R.layout.item_clubs,null,false);
        TextView tvClubname=v.findViewById(R.id.tvClubName);
        TextView tvClubaddress=v.findViewById(R.id.tvClubAddress);
        TextView tvClubtype=v.findViewById(R.id.tvClubType);
        ImageView ivClubimage=v.findViewById(R.id.ivClubImg);

        tvClubname.setText(clubname[position]);
        tvClubaddress.setText(clubaddress[position]);
        tvClubtype.setText(clubtype[position]);
        ivClubimage.setImageResource(clubimage[position]);

        return v;
    }
}