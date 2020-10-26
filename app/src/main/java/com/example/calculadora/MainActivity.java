package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button //Numeros
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnp,
            //Funciones
            btnclr,btnborr,btnce, btnmister,btnmac,btnmmas,btnmmenos,btnbandams,
       //Operaciones
          btnsum, btnres, btnmul, btndiv, btnig;
    TextView label;
    String res, n1, n2, ide;
    Double doble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //-------------------------INICIA OPERACIONES------------------------------------

        btnsum = findViewById(R.id.mas);
        btnsum.setOnClickListener(funciones);

        btnres = findViewById(R.id.menos);
        btnres.setOnClickListener(funciones);

        btndiv = findViewById(R.id.entre);
        btndiv.setOnClickListener(funciones);

        btnmul = findViewById(R.id.por);
        btnmul.setOnClickListener(funciones);
        //-------------------------TERMINA OPERACIONES-------------------------------------

        //-------------------------INICIA FUNCIONES-------------------------------------
        btnclr = findViewById(R.id.clear);
        btnclr.setOnClickListener(funciones);

        btnborr = findViewById(R.id.borr);
        btnborr.setOnClickListener(funciones);

        btnmac = findViewById(R.id.mac);
        btnmac.setOnClickListener(funciones);

        btnmister = findViewById(R.id.mister);
        btnmister.setOnClickListener(funciones);

        btnmmas = findViewById(R.id.mmas);
        btnmmas.setOnClickListener(funciones);

        btnmmenos = findViewById(R.id.mmenos);
        btnmmenos.setOnClickListener(funciones);

        btnbandams = findViewById(R.id.bandams);
        btnbandams.setOnClickListener(funciones);

        btnce = findViewById(R.id.ce);
        btnce.setOnClickListener(funciones);

        btnig = findViewById(R.id.igual);
        btnig.setOnClickListener(peraciones);
        //-------------------------TERMINA FUNCIONES-------------------------------------

        //--------------------------INICIA NUMEROS----------------------------------------
        btn1 = findViewById(R.id.uno);

        btn2 = findViewById(R.id.dos);

        btn3 = findViewById(R.id.tres);

        btn4 = findViewById(R.id.cuatro);

        btn5 = findViewById(R.id.cinco);

        btn6 = findViewById(R.id.seis);

        btn7 = findViewById(R.id.siete);

        btn8 = findViewById(R.id.ocho);

        btn9 = findViewById(R.id.nueve);

        btn0 = findViewById(R.id.cero);

        btnp = findViewById(R.id.punto);
        //--------------------------TERMINA NUMEROS----------------------------------------

    }
    View.OnClickListener funciones = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button operacion = (Button) v;
            ide  = operacion.getText().toString();
            res = label.getText().toString();
            n1 = res;
            String texto = operacion.getText().toString();
            switch (v.getId()) {
                case R.id.mas:
                    label.setText("");
                    break;
                case R.id.por:
                    label.setText("");
                    break;
                case R.id.clear:
                    label.setText("");
                    break;
                    //Investigar como implementar estas funciones
                case R.id.mac:
                    label.setText("");
                    break;
                case R.id.mister:
                    label.setText("");
                    break;
                case R.id.mmas:
                    label.setText("");
                    break;
                case R.id.menos:
                    label.setText("");
                    break;
                case R.id.entre:
                    label.setText("");
                    break;
                case R.id.mmenos:
                    label.setText("");
                    break;
                case R.id.bandams:
                    label.setText("");
                    break;
                    //Hasta Aqui
                case R.id.borr:
                    label.setText("");
                    break;
                case R.id.ce:
                    label.setText("");
                    break;
            };
        }
    };

    View.OnClickListener peraciones = new View.OnClickListener() {
        @Override
        public void onClick(View vh) {
            Button operacion = (Button) vh;
            String texto = operacion.getText().toString();
            n2 = label.getText().toString();
            doble = Double.parseDouble(n1) + Double.parseDouble(n2);

            switch (ide) {
                case "/": doble = Double.parseDouble(n1) / Double.parseDouble(n2);
                    label.setText(doble.toString());
                    break;
                case "*": doble = Double.parseDouble(n1) * Double.parseDouble(n2);
                    label.setText(doble.toString());
                    break;
                case "-": doble = Double.parseDouble(n1) - Double.parseDouble(n2);
                    label.setText(doble.toString());
                    break;
                case "+": doble = Double.parseDouble(n1) + Double.parseDouble(n2);
                    label.setText(doble.toString());
                    break;

            };
        }
    };

    }
