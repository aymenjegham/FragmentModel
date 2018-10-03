package com.example.asus.fragmentmodel;

import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SecondStatePagerAdapter mSecondPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mSecondPagerAdapter =new SecondStatePagerAdapter(getSupportFragmentManager());
        mViewPager =(ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
    }
    private void setupViewPager(ViewPager viewPager){
         SecondStatePagerAdapter adapter =new SecondStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"Fragnt2");
        adapter.addFragment(new Fragment2(),"Fragm1");
        adapter.addFragment(new Fragment3(),"Fragment3");
        viewPager.setAdapter(adapter);
    }


    public  void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
