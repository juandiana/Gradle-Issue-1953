package com.example.jdiana.myapplication;

import android.content.Context;

import com.squareup.picasso.Picasso;

public class MyAppClass {
    private Context mContext;
    private Picasso mPicasso;

    public MyAppClass(Context context) {
        mContext = context;
    }

    public void doSomething() {
        mPicasso = new Picasso.Builder(mContext).build();
    }

    public void doSomethingElse() {
        mPicasso.shutdown();
    }
}
