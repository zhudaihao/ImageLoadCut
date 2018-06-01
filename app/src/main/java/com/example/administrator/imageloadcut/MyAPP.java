package com.example.administrator.imageloadcut;

import android.app.Application;

/**
 * Created by Administrator on 2018\5\31 0031.
 */

public class MyAPP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
       ImageHelper.init(new GlideProcessor());

//        ImageHelper.init(new PicassoProcessor(this));
    }
}
