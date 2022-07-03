package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, senha;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.user);
        senha = (EditText) findViewById(R.id.senha);
        btn = (Button) findViewById(R.id.btn);
    }
    public void clicaBotao(View view) {
        if(user.getText().toString().equals("Admin") && senha.getText().toString().equals("123"))
            startActivity(new Intent(MainActivity.this, Home.class));
        else
            Toast.makeText(this,"Verifique o preenchimento dos campos, ou o usuário nao esta autenticado no sistema", Toast.LENGTH_SHORT).show();
    }
    public void solicitaAutenticacao(View view) {
            startActivity(new Intent(MainActivity.this, SolicitaAutenticacao.class));
    }

}