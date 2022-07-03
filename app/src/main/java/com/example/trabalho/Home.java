package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void ControleDeFuncionarios(View view) {
            startActivity(new Intent(Home.this, ControleDeFuncionarios.class));

    }
    public void CadastroDeFuncionarios(View view) {
        startActivity(new Intent(Home.this, CRUD.class));

    }
    public void CadastroDeMateriais(View view) {
        startActivity(new Intent(Home.this, ControleDeMateriais.class));

    }
}