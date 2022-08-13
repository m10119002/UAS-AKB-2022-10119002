package com.m10119002.uasAKB2022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TentangActivity extends FragmentActivity {
    private List<TentangFragment> mFragTentangList;
    private ViewPager2 viewPager;
    private FragmentStateAdapter pagerAdapter;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pos = 0;
        mFragTentangList = new ArrayList<TentangFragment>();
        List<TentangPage> mTentangList = new ArrayList<TentangPage>();
        mTentangList.add(new TentangPage(getResources().getString(R.string.pic1), "Judul 1"));
        mTentangList.add(new TentangPage(getResources().getString(R.string.pic2), "Judul 2"));
        mTentangList.add(new TentangPage(getResources().getString(R.string.pic3), "Judul 3"));

        for (TentangPage x : mTentangList) {
            mFragTentangList.add(new TentangFragment(x));
        }

        setContentView(R.layout.activity_tentang);

        viewPager = findViewById(R.id.tentang_pager2);
        pagerAdapter = new TentangPagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
    }

    public void nextTentang() {

    }

    public class TentangPagerAdapter extends FragmentStateAdapter {

        public TentangPagerAdapter(FragmentActivity fa){
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            pos = position;
            return mFragTentangList.get(position);
        }

        @Override
        public int getItemCount() {
            return mFragTentangList.size();
        }
    }


}