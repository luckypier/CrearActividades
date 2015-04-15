package com.example.crearactividades;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ActividadSimple extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_simple);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.getMenuInflater().inflate(R.menu.menu_actividad_simple, menu);
        return true;
    }

    public void pasarActividad2(View v) {
        System.out.println("Test de logcat");
        Intent act = new Intent(this, ActividadCompleja.class);
        super.startActivity(act);

    }
}
