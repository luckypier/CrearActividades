package com.example.crearactividades;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by precuay on 4/9/15.
 */
public class TestService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
