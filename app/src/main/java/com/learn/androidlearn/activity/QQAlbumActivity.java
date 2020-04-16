package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;
import com.learn.androidlearn.adapter.PictureAdapter;

public class QQAlbumActivity extends AppCompatActivity {

    private Integer[] picture = {R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello};

    private GridView reseau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_q_album);
        initView();
    }

    private void initView() {
        reseau = (GridView) findViewById(R.id.reseau);

        reseau.setAdapter(new PictureAdapter(this, picture));
    }
}
