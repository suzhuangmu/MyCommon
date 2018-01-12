package com.mycommon.su.bean;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by su on 2017/12/28.
 */

public class PersonalDesBean implements Serializable {

    String des;
    Drawable drawable;

    public PersonalDesBean(String des, Drawable drawable){
        this.des = des;
        this.drawable = drawable;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
