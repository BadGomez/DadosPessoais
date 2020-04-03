package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dados);

        Intent intent = getIntent();

        String nome = intent.getStringExtra(MainActivity.EXTRA_Nome);
        String telefone = intent.getStringExtra(MainActivity.EXTRA_NUMBER);
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        Integer idade = intent.getIntExtra(MainActivity.EXTRA_IDADE, 0);
        Float peso = intent.getFloatExtra(MainActivity.EXTRA_PESO,0);
        Float altura = intent.getFloatExtra(MainActivity.EXTRA_ALTURA,0);


        TextView textViewNome = findViewById(R.id.textViewNome);
        TextView textViewtelefone = findViewById(R.id.textViewtelefone);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewIdade = findViewById(R.id.textViewIdade);
        TextView textViewPeso = findViewById(R.id.textViewPeso);
        TextView textViewAltura = findViewById(R.id.textViewAltura);


        textViewNome.setText(nome);
        textViewtelefone.setText(telefone);
        textViewEmail.setText(email);
        textViewIdade.setText(String.valueOf(idade));
        textViewPeso.setText(String.valueOf(peso));
        textViewAltura.setText(String.valueOf(altura));
    }
}





