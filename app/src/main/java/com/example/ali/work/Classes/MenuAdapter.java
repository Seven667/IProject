package com.example.ali.work.Classes;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.ali.work.R;

import java.util.List;
import java.util.zip.Inflater;

import pl.droidsonroids.gif.GifImageView;

import static android.support.design.R.id.action_bar_container;
import static android.support.design.R.id.start;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private Context context;
    private List<MenuList> menuLists;

    public MenuAdapter(Context context, List<MenuList> menuLists){

        this.context = context;
        this.menuLists = menuLists;
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_menu_project,parent,false);

    return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        final MenuList menuList = menuLists.get(position);
        holder.title.setText(menuList.getTitle());
        holder.description.setText(menuList.getDescription());
        holder.images.setImageDrawable(menuList.getImages());
        holder.gif.setImageDrawable(menuList.getAdvertisingGif());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (menuList.getTitle().equals("برنامه نویسی کار میکنی ؟")){


                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuLists.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder{
        private GifImageView gif;
        private TextView title;
        private TextView description;
        private ImageView images;

        public MenuViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.programming_title);
            description = (TextView)itemView.findViewById(R.id.description_programming);
            images = (ImageView) itemView.findViewById(R.id.programming_logo);
            gif = (GifImageView) itemView.findViewById(R.id.advertising_gif);
        }
    }
}
