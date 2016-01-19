package com.android.msahakyan.endlesspager.model;

import android.os.Parcel;

/**
 * @author msahakyan
 */
public class C extends SwipeablePage {

    private int type;
    private String title;

    public C() {
        super();
    }

    protected C(Parcel in) {
        super(in);
        type = in.readInt();
        title = in.readString();
    }

    public static final Creator<C> CREATOR = new Creator<C>() {
        @Override
        public C createFromParcel(Parcel in) {
            return new C(in);
        }

        @Override
        public C[] newArray(int size) {
            return new C[size];
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
