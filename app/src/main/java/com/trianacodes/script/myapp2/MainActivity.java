package com.trianacodes.script.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_Evaluar;
    private EditText et_matematicas, et_quimica, et_fisica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Evaluar = findViewById(R.id.tv_estado);
        et_fisica = findViewById(R.id.et_fisica);
        et_matematicas = findViewById(R.id.et_matematicas);
        et_quimica = findViewById(R.id.et_Química);

    }

    public void Evalua(View view){
        int nota_mat = Integer.parseInt(et_matematicas.getText().toString());
        int nota_fis = Integer.parseInt(et_fisica.getText().toString());
        int nota_qui = Integer.parseInt(et_quimica.getText().toString());
        int promedio = (nota_mat + nota_fis + nota_qui) / 3;

        tv_Evaluar.setText("Estado del alumno: ");
        if (promedio < 5){
            tv_Evaluar.setText(tv_Evaluar.getText().toString() + "Suspendido con un " + String.valueOf(promedio));
            // También valdría:
            // tv_Evaluar.setText(tv_Evaluar.getText().toString() + "Suspendido con un " + promedio);
        } else {
            tv_Evaluar.setText(tv_Evaluar.getText().toString() + "Aprobado con un " + String.valueOf(promedio));
        }

    }

}
