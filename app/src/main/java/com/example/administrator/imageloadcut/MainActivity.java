package com.example.administrator.imageloadcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

/**
 * 买房人
 */

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.iv_icon);

        Object url = "http://img0.imgtn.bdimg.com/it/u=2316242837,3672164063&fm=27&gp=0.jpg";
        ImageHelper.instance().loadImage(this, url, imageView);



//        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);


    }
}
