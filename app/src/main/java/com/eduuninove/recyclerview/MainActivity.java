package com.eduuninove.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.eduuninove.recyclerview.pojo.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa p1 = new Pessoa("Mia K", "Atriz", 30);
        Pessoa p2 = new Pessoa("Tripa Seca", "Pirata", 60);
        Pessoa p3 = new Pessoa("Alexandre Frota", "Deputado", 50);
        Pessoa p4 = new Pessoa("Gretchen", "Esposa profissional", 80);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        iniciaRecyclerView();
    }

    private  void iniciaRecyclerView(){
        RecyclerView rv = findViewById(R.id.recycler_pessoas);
        RecyclerViewAdapter adaptador = new RecyclerViewAdapter(this, pessoas);
        rv.setAdapter(adaptador);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}