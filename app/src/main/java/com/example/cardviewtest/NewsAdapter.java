package com.example.cardviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private List<NewsModel> newsList;

    public NewsAdapter(List<NewsModel> newsList){
        this.newsList = newsList;
    }

    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new NewsViewHolder(itemView);
    }

    public void onBindViewHolder(NewsViewHolder holder, int position){
        NewsModel news = newsList.get(position);
        holder.tv_title.setText(news.getTitle());
        holder.tv_subject.setText(news.getDescription());
        holder.card_layout.setBackgroundResource(news.getBackgroundImage());
    }

    public int getItemCount(){
        return newsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv_title, tv_subject;
        ConstraintLayout card_layout;

        public NewsViewHolder(View itemView){
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_card_title);
            tv_subject = itemView.findViewById(R.id.tv_card_subject);
            card_layout = itemView.findViewById(R.id.card_layout);

            tv_title.setOnClickListener(this);
            tv_subject.setOnClickListener(this);
            card_layout.setOnClickListener(this);
        }

        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Você clicou no item: " + tv_title.getText(), Toast.LENGTH_SHORT).show();
        }

    }


}
