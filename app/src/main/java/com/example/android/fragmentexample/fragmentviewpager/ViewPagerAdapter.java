package com.example.android.fragmentexample.fragmentviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.fragmentexample.R;

/**
 * Created by hernandez on 1/15/2017.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    // Array that holds the ids of the images in the resource drawables folder
    int[] image = {R.drawable.koala, R.drawable.penguins, R.drawable.pelican,
                    R.drawable.sealion, R.drawable.crab};

    public ViewPagerAdapter(FragmentManager fm){

        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return MyViewPagerFragment.newInstance(position, image[position]);
    }

    @Override
    public int getCount() {
        return image.length;
    }
}
