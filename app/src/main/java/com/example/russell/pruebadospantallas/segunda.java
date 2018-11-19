package com.example.russell.pruebadospantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    float v1, v2,guarda;
    TextView TextVResultado;
    EditText eTValorUno, eTValorDos;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextVResultado = (TextView)findViewById(R.id.textVResultado);
        eTValorUno = (EditText)findViewById(R.id.eTValorUno);
        eTValorDos = (EditText)findViewById(R.id.eTValorDos);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v1 = Float.parseFloat(eTValorUno.getText().toString());
                v2 = Float.parseFloat(eTValorDos.getText().toString());
                guarda = v1 * v2;
                TextVResultado.setText(""+guarda);

            }
        });

    }
}
