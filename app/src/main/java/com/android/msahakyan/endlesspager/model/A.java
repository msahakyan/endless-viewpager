package com.android.msahakyan.endlesspager.model;

import android.os.Parcel;

/**
 * @author msahakyan
 */
public class A extends SwipeablePage {

    private int type;
    private String title;

    public A() {
        super();
    }

    protected A(Parcel in) {
        super(in);
        type = in.readInt();
        title = in.readString();
    }

    public static final Creator<A> CREATOR = new Creator<A>() {
        @Override
        public A createFromParcel(Parcel in) {
            return new A(in);
        }

        @Override
        public A[] newArray(int size) {
            return new A[size];
        }
    };

    public void setType(@PagerItem.Type int type) {
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
