package com.example.jogadores.seleccao.data;

import com.example.jogadores.R;
import com.example.jogadores.seleccao.model.Jogador;

import java.util.ArrayList;
import java.util.List;

public class MockupSeleccao {
    public static List<Jogador> getJogadoresMockup() {
        ArrayList<Jogador> arJogadores = new ArrayList<>();

        arJogadores.add(
                new Jogador("Cristiano Ronaldo",
                        R.drawable.criostiano)
        );

        arJogadores.add(
                new Jogador("Pepe",
                        R.drawable.pepe)
        );
        arJogadores.add(
                new Jogador("Joao Cancelo",
                        R.drawable.cancelo)
        );
        arJogadores.add(
                new Jogador("Diogo Dias",
                        R.drawable.diogo)
        );

        return arJogadores;
    }
}
