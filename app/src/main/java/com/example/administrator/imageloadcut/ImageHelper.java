package com.example.administrator.imageloadcut;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;


/**
 * 销售员
 */

public class ImageHelper implements IImageProcessor {
    //通过多态 持有有房人对象
    private static IImageProcessor iImageProcessor = null;

    public static void init(IImageProcessor iImageProcessor) {
        ImageHelper.iImageProcessor = iImageProcessor;
    }


    //单利模式
    private ImageHelper() {
    }

    private static ImageHelper imageHelper;

    public static ImageHelper instance() {
        synchronized (ImageHelper.class) {
            if (imageHelper == null) {
                imageHelper = new ImageHelper();
            }
        }

        return imageHelper;

    }

    /**
     * 普通图
     */

    @Override
    public void loadImage(Context context, Object url, ImageView imageView) {
        iImageProcessor.loadImage(context, url, imageView);

    }

    @Override
    public void loadImage(Fragment fragment, Object url, ImageView imageView) {
        iImageProcessor.loadImage(fragment, url, imageView);
    }

    @Override
    public void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder) {
        iImageProcessor.loadImage(context, url, imageView, error, placeholder);
    }

    @Override
    public void loadImage(Fragment fragment, Object url, ImageView imageView, int error, int placeholder) {
        iImageProcessor.loadImage(fragment, url, imageView, error, placeholder);
    }

    @Override
    public void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder, int isAnimate) {
        iImageProcessor.loadImage(context, url, imageView, error, placeholder, isAnimate);
    }

    /**
     * GIF
     */

    @Override
    public void loadGIF(Context context, Object url, ImageView imageView) {
        iImageProcessor.loadImage(context, url, imageView);
    }

    @Override
    public void loadGIF(Fragment fragment, Object url, ImageView imageView) {
        iImageProcessor.loadImage(fragment, url, imageView);
    }

    @Override
    public void loadGIF(Context context, Object url, ImageView imageView, int error, int placeholder) {
        iImageProcessor.loadImage(context, url, imageView, error, placeholder);
    }

    @Override
    public void loadGIF(Fragment fragment, Object url, ImageView imageView, int error, int placeholder) {
        iImageProcessor.loadImage(fragment, url, imageView, error, placeholder);
    }


}
