package com.example.serviceexample;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

/****
 * The below example is showing with standard Service.
 */
/*public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Service", "Service is created");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Service", "Service is started");
        //stopSelf(); //stop service if it was previously started.
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service", "Service is stopped");
    }
    
}
 */

/****
 * The below example is showing with Intent Service.
 */
public class ServiceExample extends IntentService {

    /**
     * @param name
     * @deprecated
     */
    public ServiceExample() {
        super("name");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Service", "onHandleIntent method worked");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Service", "Service is created");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Service", "Service is started");
        //stopSelf(); //stop service if it was previously started.
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service", "Service is stopped");
    }

}
