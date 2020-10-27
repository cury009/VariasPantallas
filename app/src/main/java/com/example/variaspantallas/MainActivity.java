package com.example.variaspantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_NOMBRE = "nombre" ;
    public static final String EXTRA_HABITANTES = "habitantes";
    EditText edt_nombre = null;
    EditText edt_numero = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_nombre = findViewById(R.id.edt_nombre);
        edt_numero = findViewById(R.id.edt_numero);

    }


    public void irActivity2(View view) {
        String nombreCiudad = String.valueOf(edt_nombre.getText());
        int habitantes = Integer.valueOf(String.valueOf(edt_numero.getText()));
        Intent intent = new Intent(this,Activity2.class);
        //--------------------------------------------------------------
        intent.putExtra(EXTRA_NOMBRE, nombreCiudad);
        intent.putExtra(EXTRA_HABITANTES, habitantes);
        startActivity(intent);
    }
}