package shubh.sport.Player.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import shubh.sport.Sports.fragments.EventContact;
import shubh.sport.Sports.fragments.EventDetails;
import shubh.sport.Sports.fragments.EventRules;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new EventDetails();
            case 1:
                return new EventRules();
            case 2:
                return new EventContact();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
