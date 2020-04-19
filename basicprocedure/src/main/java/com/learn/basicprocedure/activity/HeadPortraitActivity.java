package com.learn.basicprocedure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.basicprocedure.R;

public class HeadPortraitActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private int[] avatars = {R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello};

    private GridView gv_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_portrait);
        initView();
    }

    private void initView() {
        gv_avatar = (GridView) findViewById(R.id.gv_avatar);

        gv_avatar.setOnItemClickListener(this);

        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return avatars.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView;
                if (convertView == null) {
                    imageView = new ImageView(HeadPortraitActivity.this);
                    imageView.setAdjustViewBounds(true);
                    imageView.setMaxWidth(158);
                    imageView.setMaxHeight(150);
                    imageView.setPadding(5, 5, 5, 5);
                } else {
                    imageView = (ImageView) convertView;
                }
                imageView.setImageResource(avatars[position]);
                return imageView;
            }
        };

        gv_avatar.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle.putInt("imageId", avatars[position]);
        intent.putExtras(bundle);
        setResult(420, intent);
        finish();
    }
}
