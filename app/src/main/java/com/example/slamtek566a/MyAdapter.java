package com.example.slamtek566a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super (fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new HOME1 ();
            case 1:
                return new DASHBOARD1  ();
            case 2:
                return new ABOUT1 ();

        }

        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }
}

