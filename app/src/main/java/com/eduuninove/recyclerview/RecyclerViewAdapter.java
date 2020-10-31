package com.eduuninove.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.eduuninove.recyclerview.pojo.Pessoa;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context contexto;
    private ArrayList<Pessoa> listaPessoas;



    public RecyclerViewAdapter(Context contexto, ArrayList<Pessoa> listaPessoas) {
        this.contexto = contexto;
        this.listaPessoas = listaPessoas;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.tvNome.setText(listaPessoas.get(position).getNome());
        holder.tvIdade.setText(String.valueOf(listaPessoas.get(position).getAdade()));
        holder.tvProfissao.setText(listaPessoas.get(position).getProfissao());
    }

    @Override
    public int getItemCount() {
        return listaPessoas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNome, tvIdade,tvProfissao;
        ConstraintLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNome = itemView.findViewById(R.id.tv_nome);
            tvIdade = itemView.findViewById(R.id.tv_idade);
            tvProfissao = itemView.findViewById(R.id.tv_profissao);
            layout = itemView.findViewById(R.id.layout_parent);
        }
    }
}
