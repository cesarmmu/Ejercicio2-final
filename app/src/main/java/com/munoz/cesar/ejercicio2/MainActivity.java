package com.munoz.cesar.ejercicio2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int desde = 0;
    private int hasta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt = (EditText) findViewById(R.id.editText);
        txt.setText("Texto de prueba, puede escribir uno y modificar el color y el tamaño");
        EditText pi = (EditText) findViewById(R.id.editText2);
        desde = getResources().getInteger(R.integer.inicial);
        pi.setText(Integer.toString(desde));
        EditText ul = (EditText) findViewById(R.id.editText3);
        hasta = getResources().getInteger(R.integer.ultima);
        ul.setText(Integer.toString(hasta));
    }

    public void Color(View v){
        EditText txt = (EditText) findViewById(R.id.editText);

        int color = txt.getCurrentTextColor();

        if (color == Color.GREEN){
            txt.setTextColor(Color.BLACK);
        }else{
            txt.setTextColor(Color.GREEN);
        }
    }

    public void Negrita(View v){
        EditText txt = (EditText) findViewById(R.id.editText);

        Typeface tipo =txt.getTypeface();

        if (tipo.isBold()){
            txt.setTypeface(null, Typeface.NORMAL);
        }else {
            txt.setTypeface(null, Typeface.BOLD);
        }
    }

    public void Seleccion(View v){
        EditText txt = (EditText) findViewById(R.id.editText);
        Editable ed = txt.getText();
        EditText ini = (EditText) findViewById(R.id.editText2);
        String texto1 = ini.getText().toString();
        desde = Integer.parseInt(texto1);
        EditText fin = (EditText) findViewById(R.id.editText3);
        String texto2 = fin.getText().toString();
        hasta = Integer.parseInt(texto2);

        ed.setSpan(new StyleSpan(Typeface.BOLD), desde, hasta, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

    public void Tamaño(View v){
        EditText txt = (EditText) findViewById(R.id.editText);
        float tamaño = txt.getTextSize();
        if(tamaño == 10){
            txt.setTextSize(24);
        }else{
            txt.setTextSize(10);
        }

    }
}
