package com.github.superlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/10/6.
 */

public class ParallaxEffect extends ListView {
    public ParallaxEffect(Context context) {
        this(context,null);
    }

    public ParallaxEffect(Context context, AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public ParallaxEffect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
