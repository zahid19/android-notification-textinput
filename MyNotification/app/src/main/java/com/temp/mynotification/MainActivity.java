package com.temp.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView et ;
    String NOTIFICATION_CHANNEL_ID = "101" ;
    int notificationId = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et );
    }

    public void showNotify(View view) {
        NotifyContent.title = "MyNotify";
        //NotifyContent.content= "Good Morning . How are you";
        NotifyContent.content= et.getText().toString();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            CharSequence name = "NOTIF2019";
            String description = "This is basic of notify";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;


            NotificationChannel channel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, name , importance);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder notifybuilder = new NotificationCompat.Builder( this , NOTIFICATION_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle( NotifyContent.title)
                .setContentText(NotifyContent.content)
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setWhen(System.currentTimeMillis());

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationId++;
        notificationManager.notify(notificationId, notifybuilder.build());
    }
}//END OF CLASS
/*
PURPOSE: GET INPUT FROM TEXTBOX AND SHOW TEXT IN NOTIFICATION

ANDROID STUDIO 3.4.2

DATE: NOVEMBER-2019
 */
