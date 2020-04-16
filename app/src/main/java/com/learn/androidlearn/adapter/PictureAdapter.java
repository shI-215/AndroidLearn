package com.learn.androidlearn.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created with Android Studio.
 *
 * @Auther: Oji
 * @Date: 2020/04/16/20:25
 * @Description:
 */
public class PictureAdapter extends BaseAdapter {
    private Context context;
    private Integer[] picture;

    public PictureAdapter(Context context, Integer[] picture) {
        this.context = context;
        this.picture = picture;
    }

    @Override
    public int getCount() {
        return picture.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(100, 90));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(picture[position]);
        return imageView;
    }
}
