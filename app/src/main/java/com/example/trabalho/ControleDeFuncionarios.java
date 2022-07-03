package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControleDeFuncionarios extends AppCompatActivity {
    public static final String PREFS_NAME = "memoria";
    SharedPreferences settings;
    int caixa, caixa2, caixa3, caixa4, caixa5, caixa6;
     Button adicionarPedreiro, removerPedreiro, resetarPedreiro, contadorPedreiro;
     Button adicionarPintor, removerPintor, resetarPintor, contadorPintor;
     Button adicionarMarceneiro, removerMarceneiro, resetarMarceneiro, contadorMarceneiro;
     Button adicionarSeralheiro, removerSeralheiro, resetarSeralheiro, contadorSeralheiro;
     Button adicionarEngenheiro, removerEngenheiro, resetarEngenheiro, contadorEngenheiro;
     Button adicionarArquiteto, removerArquiteto, resetarArquiteto, contadorArquiteto;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_de_funcionarios);
        settings = getSharedPreferences(PREFS_NAME, 0);
        caixa = 0;
        caixa2 = 0;
        caixa3 = 0;
        caixa4 = 0;
        caixa5 = 0;
        caixa6 = 0;
        caixa = settings.getInt("caixa", caixa);
        caixa2 = settings.getInt("caixa2", caixa2);
        caixa3 = settings.getInt("caixa3", caixa3);
        caixa4 = settings.getInt("caixa4", caixa4);
        caixa5 = settings.getInt("caixa5", caixa5);
        caixa6 = settings.getInt("caixa6", caixa6);

        adicionarArquiteto = findViewById(R.id.adicionarArq);
        adicionarArquiteto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa6 ++;
                contadorArquiteto.setText(Integer.toString(caixa6));
                settings.edit().putInt("caixa6", caixa6).apply();
            }
        });
        adicionarEngenheiro = findViewById(R.id.adicionarEng);
        adicionarEngenheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa5 ++;
                contadorEngenheiro.setText(Integer.toString(caixa5));
                settings.edit().putInt("caixa5",caixa5).apply();
            }
        });
        adicionarSeralheiro = findViewById(R.id.adicionarSer);
        adicionarSeralheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa4 ++;
                contadorSeralheiro.setText(Integer.toString(caixa4));
                settings.edit().putInt("caixa4", caixa4).apply();
            }
        });
        adicionarMarceneiro = findViewById(R.id.adicionar3);
         adicionarMarceneiro.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 caixa3 ++;
                 contadorMarceneiro.setText(Integer.toString(caixa3));
                 settings.edit().putInt("caixa3", caixa3).apply();
             }
         });
        adicionarPintor = findViewById(R.id.adicionar2);
        adicionarPintor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa2 ++;
                contadorPintor.setText(Integer.toString(caixa2));
                settings.edit().putInt("caixa2", caixa2).apply();
            }
        });
        adicionarPedreiro = findViewById(R.id.adicionar);
        adicionarPedreiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa ++;
                contadorPedreiro.setText(Integer.toString(caixa));
                settings.edit().putInt("caixa", caixa).apply();
            }
        });
        removerArquiteto = findViewById(R.id.removerArq);
        removerArquiteto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa6 --;
                contadorArquiteto.setText(Integer.toString(caixa6));
                settings.edit().putInt("caixa6",caixa6).apply();
            }
        });
        removerEngenheiro = findViewById(R.id.removerEng);
        removerEngenheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa5 --;
                contadorEngenheiro.setText(Integer.toString(caixa5));
                settings.edit().putInt("caixa5", caixa5).apply();
            }
        });
         removerSeralheiro = findViewById(R.id.removerSeralheiro);
         removerSeralheiro.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 caixa4 --;
                 contadorSeralheiro.setText(Integer.toString(caixa4));
                 settings.edit().putInt("caixa4", caixa4).apply();
             }
         });
        removerMarceneiro = findViewById(R.id.remover3);
        removerMarceneiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa3 --;
                contadorMarceneiro.setText(Integer.toString(caixa3));
                settings.edit().putInt("caixa3", caixa3).apply();
            }
        });
        removerPintor = findViewById(R.id.remover2);
        removerPintor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa2 --;
                contadorPintor.setText(Integer.toString(caixa2));
                settings.edit().putInt("caixa2", caixa2).apply();
            }
        });
        removerPedreiro = findViewById(R.id.remover);
        removerPedreiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa --;
                contadorPedreiro.setText(Integer.toString(caixa));
                settings.edit().putInt("caixa", caixa).apply();
            }
        });
        resetarArquiteto = findViewById(R.id.resetarArq);
        resetarArquiteto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorArquiteto.setText(Integer.toString(caixa6));
            }
        });
        resetarEngenheiro = findViewById(R.id.removerSeralheiro);
        resetarEngenheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorEngenheiro.setText(Integer.toString(caixa5));
            }
        });
        resetarSeralheiro = findViewById(R.id.resetarSer);
        resetarSeralheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorSeralheiro.setText(Integer.toString(caixa4));
            }
        });
         resetarMarceneiro = findViewById(R.id.resetar3);
         resetarMarceneiro.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 contadorMarceneiro.setText(Integer.toString(caixa3));
             }
         });
        resetarPintor = findViewById(R.id.resetar2);
        resetarPintor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorPintor.setText(Integer.toString(caixa2));
            }
        });
         resetarPedreiro = findViewById(R.id.resetar);
         resetarPedreiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorPedreiro.setText(Integer.toString(caixa));
            }
        });
        contadorPedreiro = findViewById(R.id.resetar);
        contadorPedreiro.setText(Integer.toString(caixa));
        contadorPintor = findViewById(R.id.resetar2);
        contadorPintor.setText(Integer.toString(caixa2));
        contadorMarceneiro = findViewById(R.id.resetar3);
        contadorMarceneiro.setText(Integer.toString(caixa3));
        contadorSeralheiro = findViewById(R.id.resetarSer);
        contadorSeralheiro.setText(Integer.toString(caixa4));
        contadorEngenheiro = findViewById(R.id.resetarEng);
        contadorEngenheiro.setText(Integer.toString(caixa5));
        contadorArquiteto = findViewById(R.id.resetarArq);
        contadorArquiteto.setText(Integer.toString(caixa6));



    }


}