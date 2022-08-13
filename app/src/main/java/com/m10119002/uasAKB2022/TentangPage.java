package com.m10119002.uasAKB2022;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class TentangPage {
    private String judul;
    private Bitmap pic;

    private void setB64AsBitmap(String b64_pic) {
        byte[] decodedString = Base64.decode(b64_pic, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        this.pic = decodedByte;
    }

    public TentangPage(String b64_pic, String judul) {
        this.setB64AsBitmap(b64_pic);
        this.judul = judul;
    }

    public void setPic(Bitmap bmp_pic) {this.pic = bmp_pic;}
    public Bitmap getPic() {return this.pic;}
    public void setJudul(String judul) {this.judul = judul;}
    public String getJudul() {return this.judul;}
}
