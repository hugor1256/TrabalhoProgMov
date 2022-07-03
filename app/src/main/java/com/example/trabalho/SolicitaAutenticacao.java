package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SolicitaAutenticacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicita_autenticacao);

    }
    public void SolicitaAutenticacao(View view) {
        startActivity(new Intent(SolicitaAutenticacao.this, SolicitacaoConcluida.class));
    }

}