package com.jassgrouptics.cursoandroidbasico.modulouno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jassgrouptics.cursoandroidbasico.R;

public class MiniCalculadoraActivity
        extends AppCompatActivity
implements View.OnClickListener {

    private EditText txtA;
    private EditText txtB;
    private EditText txtResultado;
    private Button btnSuma;
    private Button btnResta;
    private Button btnMultiplicacion;
    private Button btnDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_calculadora);

        //inflate, inflado, inflar
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtResultado = findViewById(R.id.txtResultado);

        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);


        //asignar el oyente al objeto
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMultiplicacion.setOnClickListener(this);
        btnDivision.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Log.v("Clicks",String.valueOf(view.getId()));

        if(view.getId() == R.id.btnSuma){
            Log.v("Clicks","Hiciste click sobre el boton suma");

            int resultado,a,b;

            String auxA = this.txtA.getText().toString();
            a = Integer.parseInt(auxA);

            String auxB = this.txtB.getText().toString();
            b = Integer.parseInt(auxB);

            resultado = a + b;

            txtResultado.setText(String.valueOf(resultado));

        }else if(view.getId() == R.id.btnResta){
            Log.v("Clicks","Hiciste click sobre el boton Resta");
        }else if(view.getId() == R.id.btnMultiplicacion){
            Log.v("Clicks","Hiciste click sobre el boton Multiplicacion");
        }else if(view.getId() == R.id.btnDivision){
            Log.v("Clicks","Hiciste click sobre el boton Division");
        }

    }
}
