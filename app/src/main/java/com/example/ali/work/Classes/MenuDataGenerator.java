package com.example.ali.work.Classes;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import com.example.ali.work.R;

import java.util.ArrayList;
import java.util.List;

import pl.droidsonroids.gif.GifDrawable;


public class MenuDataGenerator {

    public  static List<MenuList> getData(Context context){
        List<MenuList> menuLists = new ArrayList<>();
        for(int i=1 ; i<=4; i++){
            MenuList menuList = new MenuList();
            switch (i) {
                case 1:
                menuList.setAdvertisingGif(GifDrawable.createFromResource(context.getResources(),R.drawable.advertising));
                menuList.setTitle("برنامه نویسی کار میکنی ؟");
                menuList.setDescription("پروژه های مربوط به برنامه نویسی به زبان های مختلف");
                menuList.setImages(ResourcesCompat.getDrawable(context.getResources(), R.drawable.programming_logo,null));
                break;
                case 2:
                    menuList.setAdvertisingGif(GifDrawable.createFromResource(context.getResources(),R.drawable.advertising));
                menuList.setTitle("طراح یا گرافیست هستی ؟");
                menuList.setDescription("پروژه های مربوط به طراحی , انیمیشن و گرافیک");
                menuList.setImages(ResourcesCompat.getDrawable(context.getResources(), R.drawable.design_logo,null));
                break;
                case 3:
                    menuList.setAdvertisingGif(GifDrawable.createFromResource(context.getResources(),R.drawable.advertising));
                menuList.setTitle("نویسنده یا مترجمی؟");
                menuList.setDescription("پروژه های مربوط به نویسندگی و ترجمه");
                menuList.setImages(ResourcesCompat.getDrawable(context.getResources(), R.drawable.writing_and_traslating_logo,null));
                break;
                case 4:
                    menuList.setAdvertisingGif(GifDrawable.createFromResource(context.getResources(),R.drawable.advertising));
                menuList.setTitle("نرم افزار خاصی بلدی؟");
                menuList.setDescription("انجام پروزه هایی که نیاز به تسلط به نرم افزار خاصی دارند");
                menuList.setImages(ResourcesCompat.getDrawable(context.getResources(), R.drawable.app_logo,null));
                break;
            }
            menuLists.add(menuList);
        }
        return menuLists;
    }
}
