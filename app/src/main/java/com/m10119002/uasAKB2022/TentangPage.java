package com.m10119002.uasAKB2022;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class TentangPage {
    private String judul;
    private int ref_pic;

    public TentangPage(int ref_pic, String judul) {
        this.ref_pic = ref_pic;
        this.judul = judul;
    }

    public void setRefPic(int ref_pic) {this.ref_pic = ref_pic;}
    public int getRefPic() {return this.ref_pic;}
    public void setJudul(String judul) {this.judul = judul;}
    public String getJudul() {return this.judul;}
}
