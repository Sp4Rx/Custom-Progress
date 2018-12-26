package io.github.sp4rx.customprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;


/**
 * Created by Sp4Rx on 12/27/18.
 */
public class MyProgressView extends LinearLayout {
    private int progress;
    private View v1, v2, v3, v4, v5;

    public MyProgressView(Context context) {
        super(context);
        init();
    }

    public MyProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        final TypedArray attributes = getContext().obtainStyledAttributes(attrs, R.styleable.MyProgressView, 0, 0);
        this.progress = attributes.getInt(R.styleable.MyProgressView_progress, 0);
        attributes.recycle();
        init();
    }

    public MyProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        final TypedArray attributes = getContext().obtainStyledAttributes(attrs, R.styleable.MyProgressView, defStyleAttr, 0);
        this.progress = attributes.getInt(R.styleable.MyProgressView_progress, 0);
        attributes.recycle();
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.custom_progress, this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);
        v4 = findViewById(R.id.v4);
        v5 = findViewById(R.id.v5);

        setProgress(progress);
    }

    public void setProgress(int progress) {
        resetColor();

        if (progress >= 1) {
            setV1Color();
        }

        if (progress >= 2) {
            setV2Color();
        }
        if (progress >= 3) {
            setV3Color();
        }
        if (progress >= 4) {
            setV4Color();
        }
        if (progress >= 5) {
            setV5Color();
        }

    }

    private void resetColor() {
        v1.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        v2.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        v3.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        v4.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        v5.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
    }


    public void setV1Color() {
        v1.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color1));
    }

    public void setV2Color() {
        v2.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color2));
    }

    public void setV3Color() {
        v3.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color3));
    }

    public void setV4Color() {
        v4.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color4));
    }

    public void setV5Color() {
        v5.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color5));
    }
}
