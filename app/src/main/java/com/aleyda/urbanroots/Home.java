package com.aleyda.urbanroots;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private Button btnCategorias, btnEstadisticas, btnConsejos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCategorias = findViewById(R.id.btnCategorias);
        btnEstadisticas = findViewById(R.id.btnEstadisticas);
        btnConsejos = findViewById(R.id.btnConsejos);

        btnCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la pantalla de Categorias
                Intent intent = new Intent(Home.this, Categorias.class);
                startActivity(intent);
            }
        });

        btnEstadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la pantalla de Estadisticas
                Intent intent = new Intent(Home.this, Estadisticas.class);
                startActivity(intent);
            }
        });

        btnConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la pantalla de recomendaciones
                Intent intent = new Intent(Home.this, Recomendaciones.class);
                startActivity(intent);
            }
        });
    }
}

