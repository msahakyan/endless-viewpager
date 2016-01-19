package com.android.msahakyan.endlesspager.model;

import android.os.Parcel;

/**
 * @author msahakyan
 */
public class D extends SwipeablePage {

    private int type;
    private String title;

    public D() {
        super();
    }

    protected D(Parcel in) {
        super(in);
        type = in.readInt();
        title = in.readString();
    }

    public static final Creator<D> CREATOR = new Creator<D>() {
        @Override
        public D createFromParcel(Parcel in) {
            return new D(in);
        }

        @Override
        public D[] newArray(int size) {
            return new D[size];
        }
    };

    public void setType(@Type int type) {
        this.type = type;
    }


    public int getType() {
        return this.type;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(type);
        dest.writeString(title);
    }
}
