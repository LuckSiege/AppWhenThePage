package com.luck.app.page.when_page;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * author：luck
 * project：AppWhenThePage
 * package：com.luck.app.page.when_page
 * email：893855882@qq.com
 * data：2017/2/22
 */
public class PageFragmentAdapter extends FragmentPagerAdapter {
    public List<PageFragment> fragments = new ArrayList<>();

    public PageFragmentAdapter(FragmentManager fm, List<PageFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public PageFragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
