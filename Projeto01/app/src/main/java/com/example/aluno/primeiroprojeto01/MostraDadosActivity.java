package com.example.aluno.primeiroprojeto01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MostraDadosActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_dados);

        Bundle args = getIntent().getExtras();
        String dados = args.getString("dados");
    }
}
