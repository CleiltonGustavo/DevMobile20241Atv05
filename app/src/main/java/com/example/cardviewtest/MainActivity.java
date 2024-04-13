package com.example.cardviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_news);
        ArrayList<NewsModel> newsList = new ArrayList<>();

        NewsModel news1 = new NewsModel("Emídio Pizzaria", "É caro demais, mas a comida é muito boa, pode confiar!", R.drawable.bluepinkbackground);
        NewsModel news2 = new NewsModel("Ponte Metálica", "Um dos mais lindos cartões postais da cidade, agora revitalizada, a ponte metálica atrai milhões de turistas todos os anos!", R.drawable.bluepinkbackground);
        NewsModel news3 = new NewsModel("Praça da prefeitura", "Nada mais relaxante do que passear enquanto contempla o lindíssimo obelísco de Quixeramobim em frente à prestigiosa Prefeitura Municipal!", R.drawable.bluepinkbackground);

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);

        NewsAdapter newsAdapter = new NewsAdapter(newsList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);
    }
}