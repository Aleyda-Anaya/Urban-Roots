package com.aleyda.urbanroots;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void iniciarSesion(View view) {

       //metodo para controlar inicio de sesion
    }

    public void registrar(View view) {
        // Abre la pantalla de registro
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}
