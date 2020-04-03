package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_Nome ="com.exemple.dadospessoais.nome";
    public static final String EXTRA_NUMBER ="com.exemple.dadospessoais.telefone";
    public static final String EXTRA_EMAIL ="com.exemple.dadospessoais.email";
    public static final String EXTRA_IDADE ="com.exemple.dadospessoais.idade";
    public static final String EXTRA_PESO ="com.exemple.dadospessoais.peso";
    public static final String EXTRA_ALTURA ="com.exemple.dadospessoais.peso";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnviarDados (View view) {
        Intent intent = new Intent (this, DisplayDados.class);

        EditText TextNome = (EditText) findViewById(R.id.TextNome);
        EditText TextPhone = (EditText) findViewById(R.id.TextPhone);
        EditText TextEmail = (EditText) findViewById(R.id.TextEmail);
        EditText TextIdade = (EditText) findViewById(R.id.TextIdade);
        EditText TextPeso = (EditText) findViewById(R.id.TextPeso);
        EditText TextAltura = (EditText) findViewById(R.id.TextAltura);

        String nome = TextNome.getText().toString();
        String telefone = TextPhone.getText().toString();
        String email = TextEmail.getText().toString();
        Integer idade = Integer.parseInt(TextIdade.getText().toString());
        Float peso = Float.parseFloat(TextPeso.getText().toString());
        Float altura = Float.parseFloat(TextAltura.getText().toString());


        intent.putExtra(EXTRA_Nome, nome);
        intent.putExtra(EXTRA_NUMBER, telefone);
        intent.putExtra(EXTRA_EMAIL, email);
        intent.putExtra(EXTRA_IDADE, idade);
        intent.putExtra(EXTRA_PESO, peso);
        intent.putExtra(EXTRA_ALTURA, altura);

        startActivity(intent);
    }
}
