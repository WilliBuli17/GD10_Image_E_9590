package com.styephenwilliambuli.gd10_image_e_9590;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int number_tabs;

    public PagerAdapter(FragmentManager fm, int number_tabs) {
        super(fm);
        this.number_tabs = number_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ShaderFragment();
            case 1:
                return new BitmapFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return number_tabs;
    }
}
