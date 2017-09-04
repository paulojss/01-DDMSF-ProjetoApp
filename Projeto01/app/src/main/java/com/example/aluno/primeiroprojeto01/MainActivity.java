package com.example.aluno.primeiroprojeto01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends DebugActivity {

    protected EditText nome;
    protected EditText telefone;
    protected EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibir(View view) {

        nome= (EditText) findViewById(R.id.txtNome);
        telefone = (EditText)findViewById(R.id.txtTelefone);
        email = (EditText) findViewById(R.id.txtEmail);

        String nome1 = nome.getText().toString();
        String telefone1 = telefone.getText().toString();
        String email1 = email.getText().toString();

        String dados = String.format("Dados: %s\n %s\n %s",nome1,telefone1,email1);

       // Toast.makeText(getApplicationContext(),dados,Toast.LENGTH_SHORT).show();
        Intent it = new Intent( this, MostraDadosActivity.class);
        Bundle b = new Bundle();
        b.putString("dados", dados);
        it.putExtras(b);
        startActivity(it);
    }
}
