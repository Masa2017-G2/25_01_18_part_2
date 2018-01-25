package com.sheygam.masa_g2_25_01_18_part_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gregorysheygam on 25/01/2018.
 */

public class PagerFragment extends Fragment{
    private ViewPager pager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pager_fragment,container,false);
        pager = view.findViewById(R.id.my_pager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        MyAdapter adapter = new MyAdapter(getActivity().getSupportFragmentManager());
        MyAdapter adapter = new MyAdapter(getChildFragmentManager());
        pager.setAdapter(adapter);
    }

    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return MyPage.newInstance("Page " + position);
        }

        @Override
        public int getCount() {
            return 20;
        }
    }

}
