package com.example.crearactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

/**
 * Created by precuay on 4/8/15.
 */
public class ActividadCompleja extends Activity {

    EditText name, age;


    // Ruta y Nombre de la activad a la cual voy a enviar la info
    final static String ACT_INFO = "com.example.crearactividades.ACTIVIDADINFO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_compleja);

        name = (EditText) super.findViewById(R.id.nombre);
        age = (EditText) super.findViewById(R.id.edad);


    }

    public void pasarActividadInfo(View v){

        String[] info = new String[2];
        //Obtengo lo que hay en las cajas de texto.
        info[0] = name.getText().toString();
        info[1] = age.getText().toString();

        //Creo y asigno la información a enviar.
        Intent act = new Intent(this, ActividadInfo.class);
        act.putExtra(ACT_INFO, info);

        super.startActivity(act);

    }

}