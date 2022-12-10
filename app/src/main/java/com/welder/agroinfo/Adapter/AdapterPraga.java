package com.welder.agroinfo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.welder.agroinfo.Model.Praga;
import com.welder.agroinfo.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterPraga extends RecyclerView.Adapter<AdapterPraga.PragaViewHolder> {

    private List<Praga> pragaList = new ArrayList<>();

    public AdapterPraga(List<Praga> usuarioList) {
        this.pragaList = usuarioList;
    }


    @NonNull
    @Override
    public AdapterPraga.PragaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        itemLista = layoutInflater.inflate(R.layout.pragas,parent,false);
        return new PragaViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPraga.PragaViewHolder holder, int position) {

        holder.foto.setImageResource(pragaList.get(position).getFoto());
        holder.nome.setText(pragaList.get(position).getNome());
        holder.mensagem.setText(pragaList.get(position).getResumo());

    }

    @Override
    public int getItemCount() {
        return pragaList.size();
    }

    public  class PragaViewHolder extends RecyclerView.ViewHolder{

        private ImageView foto;
        private TextView nome;
        private TextView mensagem;

        public PragaViewHolder(@NonNull View itemView) {
            super(itemView);

            foto = itemView.findViewById(R.id.circleImageView_praga);
            nome = itemView.findViewById(R.id.nomeinseto);
            mensagem = itemView.findViewById(R.id.pragacultura);
        }
    }


}


