package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to map
        TextView text = (TextView) findViewById(R.id.adress) ;
        text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "https://www.google.com/maps/place/Raqamli+texnologiyalar+markazi/@40.4409548,71.7168688,15z/data=!4m5!3m4!1s0x0:0xeab111eca5cb68cb!8m2!3d40.4409548!4d71.7168688" ) );

                startActivity( browse );
            }
        });

        //make a call
        text = (TextView) findViewById(R.id.phone) ;
        text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+998"+732542404));
                startActivity(callIntent);
            }
        });

        //link to website
        text = (TextView) findViewById(R.id.site) ;
        text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "http://mrtm.uz/" ) );

                startActivity( browse );
            }
        });


        //link to facebook
        ImageView img = (ImageView) findViewById(R.id.icon4);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "https://www.facebook.com/rtm.margilan" ) );

                startActivity( browse );
            }
        });

        //link to instagram
        img = (ImageView) findViewById(R.id.icon5);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "https://www.instagram.com/rtm_margilan/" ) );

                startActivity( browse );
            }
        });

        //link to telegram
        img = (ImageView) findViewById(R.id.icon6);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "https://t.me/rtm_margilan" ) );

                startActivity( browse );
            }
        });

        //link to youtube
        img = (ImageView) findViewById(R.id.icon7);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "https://www.youtube.com/channel/UCHFQRFFeyJgcSkKLRFczyfw" ) );

                startActivity( browse );
            }
        });
    }
}