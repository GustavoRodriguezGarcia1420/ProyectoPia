package com.example.russell.pruebadospantallas;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRectangular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRectangular = (Button)findViewById(R.id.btn);

        btnRectangular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent (getBaseContext(), Rectangular.class);
                startActivity(i);

            }
        });

    }
}
