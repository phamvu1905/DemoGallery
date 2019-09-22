package com.example.example4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer>  list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add(R.drawable.car3);
        list.add(R.drawable.car4);

        final ImageView imageView = (ImageView)findViewById(R.id.image_car);
        Gallery gallery = (Gallery)findViewById(R.id.gallery_car);
        MyAdapter adapter = new MyAdapter(list, MainActivity.this);

        gallery.setAdapter(adapter);
        gallery.setOnClickListener(new AdapterView.OnItemClickListener();

    }
}
