package com.baim.projectuas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Hero> listHero;
    private OnItemClickCallback onItemClickCallback;
    public ListHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvType.setText(hero.getType());
        holder.tvTahun.setText(hero.getTahun());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailHeroAdapter.class);
                Bundle bundle = new Bundle();

                bundle.putString("name", hero.getName());
                bundle.putString("detail", hero.getDetail());
                bundle.putString("type", hero.getType());
                bundle.putString("tahun", hero.getTahun());
                bundle.putString("legal", hero.getLegal());
                bundle.putInt("photo", hero.getPhoto());
                intent.putExtras(bundle);
                context.startActivity(intent);
                Toast.makeText(holder.itemView.getContext(), "" + listHero.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public void setOnItemClickCallBack(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvType, tvTahun;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvTahun = itemView.findViewById(R.id.tv_item_tahun);
            tvType = itemView.findViewById(R.id.tv_item_type);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hero data);
    }
}
