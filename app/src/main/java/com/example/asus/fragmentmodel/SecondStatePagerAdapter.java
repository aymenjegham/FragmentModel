package com.example.asus.fragmentmodel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 28/09/2018.
 */

public class SecondStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragmentList =new ArrayList<>();
    private final List<String> mFragmentTitleList =new ArrayList<>();


    public SecondStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }


    public  void  addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
