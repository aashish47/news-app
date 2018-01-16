package com.example.hp.techie.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.techie.R;
import com.example.hp.techie.activity.webViewActivity;
import com.example.hp.techie.models.Article;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Hp on 10/8/2017.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.AlbumViewHolder>{
    Context context;

    public ArticleAdapter(Context context) {
        this.context = context;
    }

    ArrayList<Article> article= new ArrayList<>();

    public void updateArticle(ArrayList<Article> article){
        this.article = article;
        notifyDataSetChanged();
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return new AlbumViewHolder(li.inflate(R.layout.list_view_news,parent,false));
    }

    @Override
    public void onBindViewHolder(final AlbumViewHolder holder, final int position) {
        holder.tvTitle.setText(article.get(position).getTitle());
        Picasso.with(context).load(article.get(position).getUrlToImage()).into(holder.ivPicture);
        holder.ivPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(
                        new Intent(context,webViewActivity.class).
                                putExtra("URL",article.get(position).getUrl()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return article.size();
    }

    class AlbumViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView ivPicture;
        public AlbumViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvNewsTitle);
            ivPicture = itemView.findViewById(R.id.ivPicture);
        }
    }
}
