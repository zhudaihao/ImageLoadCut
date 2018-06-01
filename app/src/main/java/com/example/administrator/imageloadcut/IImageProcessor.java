package com.example.administrator.imageloadcut;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

/**
 * 图片抽象层接口
 */

public interface IImageProcessor {

    //加载图片
    void loadImage(Context context, Object url, ImageView imageView);

    void loadImage(Fragment fragment, Object url, ImageView imageView);

    void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder);

    void loadImage(Fragment fragment, Object url, ImageView imageView, int error, int placeholder);

    void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder,int isAnimate);


    //加载GIF图

    void loadGIF(Context context, Object url, ImageView imageView);

    void loadGIF(Fragment fragment, Object url, ImageView imageView);

    void loadGIF(Context context, Object url, ImageView imageView, int error, int placeholder);

    void loadGIF(Fragment fragment, Object url, ImageView imageView, int error, int placeholder);


}
