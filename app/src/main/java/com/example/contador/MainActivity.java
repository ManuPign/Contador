package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button BotonSumar;
    private Button BotonRestar;
    private Button BotonZoommas;
    private Button BotonZoommenos;
    private Button BotonOcultar;
    private Button BotonReset;
    private TextView contador;
    int numero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = (TextView)findViewById(R.id.numero);// resorce location

        BotonSumar = (Button) findViewById(R.id.botonSumar);
        BotonSumar.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              numero++;

                                              contador.setText(Long.toString(numero));
                                          }
                                      });


        BotonRestar = (Button) findViewById(R.id.botonRestar);
        BotonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numero > 0) {
                    numero--;

                    contador.setText(Long.toString(numero));
                }
            }
        });
        BotonZoommas = (Button) findViewById(R.id.botonZoommas);
        BotonZoommenos = (Button) findViewById(R.id.botonZoommenos);
        BotonOcultar = (Button) findViewById(R.id.botonOcultar);
        BotonReset = (Button) findViewById(R.id.botonReset);
        BotonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = 0;

                contador.setText(Long.toString(numero));
            }
        });
    }
}


