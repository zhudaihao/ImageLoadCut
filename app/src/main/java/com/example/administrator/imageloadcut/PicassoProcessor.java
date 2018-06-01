package com.example.administrator.imageloadcut;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;

import java.io.File;

/**
 * 有房人
 */

public class PicassoProcessor implements IImageProcessor {

    private Context context;

    public PicassoProcessor(Context context) {
        this.context = context;
    }

    /**
     * 普通图片
     */
    @Override
    public void loadImage(Context context, Object url, ImageView imageView) {
        getRequest(context, url).into(imageView);
    }


    //判断不同加载数据类型
    private RequestCreator getRequest(Context context, Object url) {
        RequestCreator load = null;
        if (url instanceof Integer) {
            load = Picasso.with(context).load((Integer) url);
        } else if (url instanceof String) {
            load = Picasso.with(context).load((String) url);
        } else if (url instanceof File) {
            load = Picasso.with(context).load((File) url);
        } else if (url instanceof Uri) {
            load = Picasso.with(context).load((Uri) url);
        }

        return load;
    }


    @Override
    public void loadImage(Fragment fragment, Object url, ImageView imageView) {
        getRequest(context, url).into(imageView);
    }

    @Override
    public void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder) {
        getRequest(context, url).error(error).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadImage(Fragment fragment, Object url, ImageView imageView, int error, int placeholder) {
        getRequest(context, url).error(error).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadImage(Context context, Object url, ImageView imageView, int error, int placeholder, int isAnimate) {

        Transformation transformation = new Transformation() {
            @Override
            public Bitmap transform(Bitmap source) {
                return null;
            }

            @Override
            public String key() {
                return null;
            }
        };
        getRequest(context, url).error(error)
                .transform(transformation).placeholder(placeholder).into(imageView);


    }

    /**
     * GIF图片
     */

    @Override
    public void loadGIF(Context context, Object url, ImageView imageView) {

    }

    @Override
    public void loadGIF(Fragment fragment, Object url, ImageView imageView) {

    }

    @Override
    public void loadGIF(Context context, Object url, ImageView imageView, int error, int placeholder) {

    }

    @Override
    public void loadGIF(Fragment fragment, Object url, ImageView imageView, int error, int placeholder) {

    }
}
