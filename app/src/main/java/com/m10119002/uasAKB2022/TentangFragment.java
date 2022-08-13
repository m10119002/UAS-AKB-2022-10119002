package com.m10119002.uasAKB2022;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TentangFragment extends Fragment {

    private int ref_pic;
    private String judul;

    public TentangFragment(TentangPage tentangPage) {
        this.ref_pic = tentangPage.getRefPic();
        this.judul = tentangPage.getJudul();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tentang, container, false);

        ImageView iv_pic = (ImageView) rootView.findViewById(R.id.tentang_imageview);
        iv_pic.setImageDrawable(ResourcesCompat.getDrawable(getResources(), this.ref_pic, null));
        TextView tv_judul = (TextView) rootView.findViewById(R.id.tentang_textview);
        tv_judul.setText(this.judul);

        return rootView;
    }
}