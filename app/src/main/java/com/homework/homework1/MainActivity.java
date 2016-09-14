package com.homework.homework1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String textishere="default";
        textishere = getIntent().getStringExtra("mytext");
        TextView infoTextView = (TextView)findViewById(R.id.textViewInfo);
        infoTextView.setText("TextView: "+ textishere);
    }

    public void gototwo(View view)
    {
        Intent i = new Intent (MainActivity.this, Main2Activity.class);
        startActivity(i);
    }

    public void sendpls(View view)
    {

    }
}
