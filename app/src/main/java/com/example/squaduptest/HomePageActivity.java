package com.example.squaduptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.*;

import com.example.squaduptest.HomePageButtons.*;

public class HomePageActivity extends AppCompatActivity {

    Button btnCreateEvent;
    Button btnBrowseEvent;

    Button btnSettings;
    Button btnFriendsList;
    Button btnPastEvents;
    Button btnProfile;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreateEvent = (Button)findViewById(R.id.btnCreateEvent);                                     //CREATE EVENT
        btnCreateEvent.setOnClickListener(new View.OnClickListener() {
           @Override
                public void onClick(View v){
               intent = new Intent(HomePageActivity.this, CreateEvent.class);
               startActivity(intent);
           }
        });

        btnBrowseEvent = (Button)findViewById(R.id.btnBrowseEvent);                                     //BROWSE EVENTS
        btnBrowseEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(HomePageActivity.this, BrowseEvents.class);
                startActivity(intent);
            }
        });

        btnSettings = (Button)findViewById(R.id.btnSettings);                                     //SETTINGS
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(HomePageActivity.this, Settings.class);
                startActivity(intent);
            }
        });

        btnFriendsList = (Button)findViewById(R.id.btnFriendList);                                     //FRIENDS LIST
        btnFriendsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(HomePageActivity.this, FriendsList.class);
                startActivity(intent);
            }
        });

        btnPastEvents = (Button)findViewById(R.id.btnPastEvents);                                     //PAST EVENTS
        btnPastEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(HomePageActivity.this, PastEvents.class);
                startActivity(intent);
            }
        });

        btnProfile = (Button)findViewById(R.id.btnProfile);                                     //PROFILE
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(HomePageActivity.this, Profile.class);
                startActivity(intent);
            }
        });

    }
}
