package com.example.jogadores.seleccao.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.jogadores.R;
import com.example.jogadores.seleccao.adapter.SeleccaoAdapter;
import com.example.jogadores.seleccao.data.MockupSeleccao;

public class SeleccaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccao);

        RecyclerView rv = findViewById(R.id.rv_seleccao);
        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(
                new SeleccaoAdapter(MockupSeleccao.getJogadoresMockup())
        );
    }
}