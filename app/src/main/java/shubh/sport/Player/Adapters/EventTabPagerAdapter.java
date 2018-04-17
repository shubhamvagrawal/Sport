package shubh.sport.Player.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import shubh.sport.Player.PlayerDetails;

public class EventTabPagerAdapter extends FragmentPagerAdapter {

    public EventTabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new PlayerDetails();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
