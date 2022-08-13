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

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TentangActivity extends FragmentActivity {
    private List<TentangFragment> mFragTentangList;
    private ViewPager2 viewPager;
    private FragmentStateAdapter pagerAdapter;
    private static final int NUM_PAGES = 3;
    private int pos;
    private boolean isFinalPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pos = 0;
        isFinalPage = false;
        mFragTentangList = new ArrayList<TentangFragment>();
        List<TentangPage> mTentangList = new ArrayList<TentangPage>();
        mTentangList.add(new TentangPage(R.drawable.pic1, "Kelupaan lagi hari ini ngapain?"));
        mTentangList.add(new TentangPage(R.drawable.pic2, "Jangan khawatir, kami menyediakan Catatan Kalendar"));
        mTentangList.add(new TentangPage(R.drawable.pic3, "Dengan Catatan Kalendar ini, Kamu tidak akan lupa lagi!"));

        for (TentangPage x : mTentangList) {
            mFragTentangList.add(new TentangFragment(x));
        }

        setContentView(R.layout.activity_tentang);

        viewPager = findViewById(R.id.tentang_pager2);
        pagerAdapter = new TentangPagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
    }

    public void nextTentang(View view) {
        Button btn = (Button) view;
        if (isFinalPage) {
            Intent intent = new Intent(TentangActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            pos+= 1;
            if (pos == (mFragTentangList.size()-1)) {
                btn.setText("DONE");
                isFinalPage = true;
            } else {
                btn.setText("NEXT");
            }
            viewPager.setCurrentItem(pos);
        }
    }

    public class TentangPagerAdapter extends FragmentStateAdapter {

        public TentangPagerAdapter(FragmentActivity fa){
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            return mFragTentangList.get(position);
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }


}