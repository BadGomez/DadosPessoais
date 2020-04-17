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
    public static final String EXTRA_ALTURA ="com.exemple.dadospessoais.altura";

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
        String strIdade = TextIdade.getText().toString();
        String strPeso = TextPeso.getText().toString();
        String strAltura = TextAltura.getText().toString();



        if (nome.length() <= 0){
            TextNome.setError(getString(R.string.nome_obrigatorio));
            TextNome.requestFocus();
            return;
        }

        if (telefone.length() < 9){
            TextPhone.setError(getString(R.string.telefone_invalido));
            TextPhone.requestFocus();
            return;
        }

         if (email.length() <= 0){
            TextEmail.setError(getString(R.string.email_invalido));
            TextEmail.requestFocus();
            return;
        }

        int idade;
        try{
            idade = Integer.parseInt(strIdade);
            }catch(NumberFormatException e){
            TextIdade.setError(getString(R.string.idade_obrigatorio));
            TextIdade.requestFocus();
            return;
       }

       if(idade < 18) {
           TextIdade.setError(getString(R.string.idade_minima_obrigatoria));
           TextIdade.requestFocus();
           return;
       }

        float peso;
        try{
            peso = Float.parseFloat(strPeso);
        }catch(NumberFormatException e){
            TextPeso.setError(getString(R.string.peso_invalido));
            TextPeso.requestFocus();
            return;
        }

        float altura;
        try{
            altura = Float.parseFloat(strAltura);
        }catch(NumberFormatException e){
            TextAltura.setError(getString(R.string.altura_invalida));
            TextAltura.requestFocus();
            return;
        }


        intent.putExtra(EXTRA_Nome, nome);
        intent.putExtra(EXTRA_NUMBER, telefone);
        intent.putExtra(EXTRA_EMAIL, email);
        intent.putExtra(EXTRA_IDADE, idade);
        intent.putExtra(EXTRA_PESO, peso);
        intent.putExtra(EXTRA_ALTURA, altura);
        startActivity(intent);
    }
}
