package com.example.crearactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by precuay on 4/8/15.
 */
public class ActividadInfo extends Activity {



    TextView nombre, edad; //Para mostrar en pantalla la información.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_actividad_info);

        nombre = (TextView) findViewById(R.id.mostrarNombre);
        edad = (TextView) findViewById(R.id.mostrarEdad);

        //Obtengo la información de la Actividad anterior y se la asigno a la variable info.
        Intent men = super.getIntent();

        // Para recibir la información.
        String[] info = men.getStringArrayExtra(ActividadCompleja.ACT_INFO);

        //Muestro la información en la interfaz.
        nombre.setText(info[0]);
        edad.setText(super.getString(R.string.mostrar_edad, info[1]));
    }

}
