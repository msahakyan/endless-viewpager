package com.android.msahakyan.endlesspager.model;

import android.os.Parcel;

/**
 * @author msahakyan
 */
public class B extends SwipeablePage {

    private int type;
    private String title;

    public B() {
        super();
    }

    protected B(Parcel in) {
        super(in);
        type = in.readInt();
        title = in.readString();
    }

    public static final Creator<B> CREATOR = new Creator<B>() {
        @Override
        public B createFromParcel(Parcel in) {
            return new B(in);
        }

        @Override
        public B[] newArray(int size) {
            return new B[size];
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
