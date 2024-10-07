package com.example.samsung_1_7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class NewView extends View {
    Paint paint = new Paint();
    int N = 100;
    float[] x = new float[N];
    float[] y = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];

    public NewView(Context context) {
        super(context);
        for (int i = 0; i < N; i++) {
            x[i] = (float) (Math.random() * 500);
            y[i] = (float) (Math.random() * 500);
            vx[i] = (float) (Math.random() * 6 - 3);
            vy[i] = (float) (Math.random() * 6 - 3);
        }
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);
        }

        for (int i = 0; i < N; i++) {
            x[i] += vx[i];
            y[i] += vy[i];
        }

        invalidate();
    }
}
