package com.learn.androidlearn.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.learn.androidlearn.R;

/**
 * Created with Android Studio.
 *
 * @Auther: Oji
 * @Date: 2020/04/13/13:59
 * @Description:
 */
public class RabbitView extends View {
    public float X;
    public float Y;

    public RabbitView(Context context) {
        super(context);
        X = 100;
        Y = 100;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap, X, Y, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
