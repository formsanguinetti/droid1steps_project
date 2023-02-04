package com.example.jogadores.seleccao.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jogadores.R;
import com.example.jogadores.seleccao.model.Jogador;
import com.github.abdularis.civ.CircleImageView;

import java.util.List;

public class SeleccaoAdapter  extends RecyclerView.Adapter<SeleccaoAdapter.VHJogador> {

    List<Jogador> jogadores;

    public SeleccaoAdapter(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @NonNull
    @Override
    public VHJogador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.jogador, parent, false);

        return new VHJogador(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VHJogador holder, int position) {
        Jogador jog = jogadores.get(position);

        holder.getTvNome().setText(jog.getNome());
        holder.getcPicture().setImageResource(jog.getPicture());
    }

    @Override
    public int getItemCount() {
        return jogadores.size();
    }

    public class VHJogador extends RecyclerView.ViewHolder {
        TextView tvNome;
        CircleImageView cPicture;

        public VHJogador(@NonNull View itemView) {
            super(itemView);
            cPicture = itemView.findViewById(R.id.cv_picture);
            tvNome = itemView.findViewById(R.id.tv_nome);
        }

        public void setNome(String nome) {
            tvNome.setText(nome);
        }

        public TextView getTvNome() {
            return tvNome;
        }

        public CircleImageView getcPicture() {
            return cPicture;
        }
    }
}
