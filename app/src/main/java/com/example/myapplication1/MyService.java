package com.example.myapplication1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

    int mStartMode;

    IBinder mBinder;

    boolean mAllowRebind;

    @Override
    public void onCreate() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return mStartMode;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
