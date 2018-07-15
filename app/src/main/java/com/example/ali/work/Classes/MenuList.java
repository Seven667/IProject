package com.example.ali.work.Classes;

import android.graphics.drawable.Drawable;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;


public class MenuList {
    private Drawable images;
    private String title;
    private String description;
    private GifDrawable advertisingGif;

    public Drawable getImages() {
        return images;
    }

    public void setImages(Drawable images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public GifDrawable getAdvertisingGif() {
        return advertisingGif;
    }

    public void setAdvertisingGif(GifDrawable advertisingGif) {
        this.advertisingGif = advertisingGif;
    }
}