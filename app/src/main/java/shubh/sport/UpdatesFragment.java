package shubh.sport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shubh.sport.Updates.Ministry;
import shubh.sport.Updates.Updates;

/**
 * Created by $hubh on 2/18/2018.
 */


public class UpdatesFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        getActivity().setTitle("Updates");
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
                    return Updates.newInstance(1);
                case 1:
                    return Ministry.newInstance(1);
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
                    return "Updates";
                case 1:
                    return "Sports Ministry";
                default:
                    return null;
            }
        }
    }
}