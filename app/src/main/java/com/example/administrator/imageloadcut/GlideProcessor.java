package com.example.administrator.imageloadcut;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * 有房人
 */
public class GlideProcessor implements IImageProcessor {

    /**
     * 普通图
     */
    @Override
    public void loadImage(Context context, Object url, ImageView imageView) {
        Glide.with(context).load(url).crossFade().into(imageView);
    }

    @Override
    public void loadImage(Fragment fragment, Object url, ImageView imageView) {
        Glide.with(fragment).load(url).crossFade().into(imageView);
    }

    @Override
    public void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder) {
        Glide.with(context).load(url).crossFade().error(error).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadImage(Fragment fragment, Object url, ImageView imageView, int error, int placeholder) {
        Glide.with(fragment).load(url).crossFade().error(error).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder, int animate) {
        Glide.with(context).load(url).crossFade().error(error).animate(animate).placeholder(placeholder).into(imageView);
    }


    /**
     * GIF图
     */
    @Override
    public void loadGIF(Context context, Object url, ImageView imageView) {
        Glide.with(context).load(url).asGif().into(imageView);
    }

    @Override
    public void loadGIF(Fragment fragment, Object url, ImageView imageView) {
        Glide.with(fragment).load(url).asGif().into(imageView);
    }

    @Override
    public void loadGIF(Context context, Object url, ImageView imageView, int error, int placeholder) {
        Glide.with(context).load(url).asGif().error(error).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadGIF(Fragment fragment, Object url, ImageView imageView, int error, int placeholder) {
        Glide.with(fragment).load(url).asGif().error(error).placeholder(placeholder).into(imageView);
    }
}
