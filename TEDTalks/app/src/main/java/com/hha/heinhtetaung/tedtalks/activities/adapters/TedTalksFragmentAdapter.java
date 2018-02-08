package com.hha.heinhtetaung.tedtalks.activities.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5 on 2/8/2018.
 */

public class TedTalksFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;
    private List<String> mTabTitles;

    public TedTalksFragmentAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mTabTitles = new ArrayList<>();

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    /*
    tab title htae poc thone
     */
    public void addTab(String tabTitle, Fragment fragment) {
        mTabTitles.add(tabTitle);
        mFragments.add(fragment);
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles.get(position);
    }
}
