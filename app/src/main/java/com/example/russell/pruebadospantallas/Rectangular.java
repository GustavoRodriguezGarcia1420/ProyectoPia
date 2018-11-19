package com.example.russell.pruebadospantallas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangular extends AppCompatActivity {

    float b,y,r,r2,r3,r4,r5,r6,r7;
    TextView TextVResultado;
    TextView TextVResultado2;
    TextView TextVResultado3;
    TextView TextVResultado4;
    TextView TextVResultado5;
    TextView TextVResultado6;
    TextView TextVResultado7;
    EditText eTValorUno, eTValorDos;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangular);

        btn2 = (Button)findViewById(R.id.btn2);
        eTValorUno = (EditText)findViewById(R.id.eTValorUno);
        eTValorDos = (EditText)findViewById(R.id.eTValorDos);
        TextVResultado = (TextView)findViewById(R.id.textVResultado);
        TextVResultado2 = (TextView)findViewById(R.id.textVResultado2);
        TextVResultado3 = (TextView)findViewById(R.id.textVResultado3);
        TextVResultado4 = (TextView)findViewById(R.id.textVResultado4);
        TextVResultado5 = (TextView)findViewById(R.id.textVResultado5);
        TextVResultado6 = (TextView)findViewById(R.id.textVResultado6);
        TextVResultado7 = (TextView)findViewById(R.id.textVResultado7);

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        b = Float.parseFloat(eTValorUno.getText().toString());
                        y = Float.parseFloat(eTValorDos.getText().toString());
                        //////////////////////////////////////////////////////
                        r = b * y;
                        TextVResultado.setText("" + r);
                        //////////////////////////////////////////////////////
                        r2 = b + (2 * y);
                        TextVResultado2.setText("" + r2);
                        //////////////////////////////////////////////////////
                        r3 = (b * y) / (b + (2 * y));
                        TextVResultado3.setText("" + r3);
                        //////////////////////////////////////////////////////
                        r4 = b;
                        TextVResultado4.setText("" + r4);
                        //////////////////////////////////////////////////////
                        r5 = y;
                        TextVResultado5.setText("" + r5);
                        //////////////////////////////////////////////////////
                        r6 = 2;
                        TextVResultado6.setText("" + r6);
                        //////////////////////////////////////////////////////
                        r7 = 0;
                        TextVResultado7.setText("" + r7);
                        //////////////////////////////////////////////////////
                    }catch (Exception e){
                        if (eTValorDos == null) {
                        }
                        if (eTValorUno == null) {
                        }

                    }
                }
            });

    }
}
