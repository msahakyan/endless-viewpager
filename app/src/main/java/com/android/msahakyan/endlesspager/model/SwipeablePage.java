package com.android.msahakyan.endlesspager.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author msahakyan
 */
public class SwipeablePage implements PagerItem, Parcelable {

    public SwipeablePage() {}

    protected SwipeablePage(Parcel in) {
    }

    public static final Creator<SwipeablePage> CREATOR = new Creator<SwipeablePage>() {
        @Override
        public SwipeablePage createFromParcel(Parcel in) {
            return new SwipeablePage(in);
        }

        @Override
        public SwipeablePage[] newArray(int size) {
            return new SwipeablePage[size];
        }
    };

    @Override
    public void setType(@Type int type) {
    }

    @Override
    public int getType() {
        return TYPE_A;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
