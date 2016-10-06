package com.github.parallaxeffecthm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/10/6.
 */

public class parallaxeffecthm  extends ListView{
    public parallaxeffecthm(Context context) {
        this(context,null);
    }

    public parallaxeffecthm(Context context, AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public parallaxeffecthm(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
