package com.m10119002.uasAKB2022;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class TentangFragment extends Fragment {

    private Bitmap pic;
    private String judul;

    public TentangFragment(TentangPage tentangPage) {
        this.pic = tentangPage.getPic();
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


        return rootView;
    }
}