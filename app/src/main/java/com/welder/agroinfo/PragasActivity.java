package com.welder.agroinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.welder.agroinfo.Adapter.AdapterPraga;
import com.welder.agroinfo.Model.Praga;
import com.welder.agroinfo.RecycleListClick.RecycleListClick;

import java.util.ArrayList;
import java.util.List;

public class PragasActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPragas;
    private List<Praga> pragaList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pragas);

        recyclerViewPragas = findViewById(R.id.recyclepragas);

        recyclerViewPragas.setLayoutManager(new LinearLayoutManager(PragasActivity.this, LinearLayoutManager.VERTICAL,false));  //Define o Formato da Lista
        recyclerViewPragas.setHasFixedSize(true); //melhora o desempenho da lista
        AdapterPraga adapterPraga = new AdapterPraga(pragaList);
        recyclerViewPragas.setAdapter(adapterPraga);

        Praga();

        recyclerViewPragas.addOnItemTouchListener(new RecycleListClick(getApplicationContext(), recyclerViewPragas,
                new RecycleListClick.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        Praga praga = pragaList.get(position);

                        Toast.makeText(getApplicationContext(), "Inseto" + praga.getNome(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                        Praga praga = pragaList.get(position);

                        Toast.makeText(getApplicationContext(), "Inseto" + praga.getNome(), Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }));

    }

    public void Praga(){

        Praga inseto1 = new Praga(R.drawable.inseto1, "Cigarrinha", "Cana-Capim-Soja");
        pragaList.add(inseto1);

        Praga inseto2 = new Praga(R.drawable.inseto2, "Carrapato", "Bovinos-Equinos-Ouvideos");
        pragaList.add(inseto2);

    }



}