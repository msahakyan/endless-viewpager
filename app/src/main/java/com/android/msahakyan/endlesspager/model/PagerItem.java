package com.android.msahakyan.endlesspager.model;

import android.support.annotation.IntDef;

/**
 * @author msahakyan
 */
public interface PagerItem {

    int TYPE_A = 0;
    int TYPE_B = 1;
    int TYPE_C = 2;
    int TYPE_D = 3;

    @IntDef({TYPE_A, TYPE_B, TYPE_C, TYPE_D})
    public @interface Type {
    }

    void setType(@Type int type);

    @Type
    int getType();

    String getTitle();

    void setTitle(String title);
}
