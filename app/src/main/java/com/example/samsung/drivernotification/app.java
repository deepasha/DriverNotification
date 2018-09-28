package com.example.samsung.drivernotification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

/**
 * Created by Samsung on 9/29/2018.
 */

public class app extends Application {



    public static final String CHANNEL_1_ID = "GPS ON";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();


    }

    private void createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID,
                    "gps on",
                    NotificationManager.IMPORTANCE_HIGH


            );
            channel1.setVibrationPattern(new long[]{1000,1000,1000,1000,1000});
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);

        }

    }


    }

