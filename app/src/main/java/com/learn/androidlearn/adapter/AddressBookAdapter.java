package com.learn.androidlearn.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.learn.androidlearn.R;

import java.util.List;
import java.util.Map;

/**
 * Created with Android Studio.
 *
 * @Auther: Oji
 * @Date: 2020/04/17/19:33
 * @Description:
 */
public class AddressBookAdapter extends BaseAdapter {
    private Context context;
    private List<Map<String, Object>> list;

    public AddressBookAdapter(Context context, List<Map<String, Object>> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Map<String, Object> map = list.get(position);
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
            viewHolder.item_text = (TextView) convertView.findViewById(R.id.item_text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable((Integer) map.get("image"));
        viewHolder.item_image.setBackground(drawable);
        viewHolder.item_text.setText(map.get("text").toString());
        return convertView;
    }

    static class ViewHolder {
        public ImageView item_image;
        public TextView item_text;
    }
}
