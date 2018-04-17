package shubh.sport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shubh.sport.Player.Player;
import shubh.sport.Sports.fragments.Sports;

/**
 * Created by $hubh on 2/18/2018.
 */


public class SportsFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        getActivity().setTitle("Sports");
        View view = inflater.inflate(R.layout.tabs, container, false);
        ViewPager mViewPager = view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        return view;
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }


        @Override
        public Fragment getItem(int day)
        {

            switch (day)
            {
                case 0:
                    return Sports.newInstance(1);
                case 1:
                    return Player.newInstance(1);
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int day)
        {

            switch (day) {
                case 0:
                    return "Olympic Sports";
                case 1:
                    return "Players";
                default:
                    return null;
            }
        }
    }
}