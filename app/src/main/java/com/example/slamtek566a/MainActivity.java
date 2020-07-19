package com.example.slamtek566a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp3 = findViewById (R.id.viewPager3);

        MyAdapter adapter = new MyAdapter (getSupportFragmentManager ());
        vp3.setAdapter   (adapter);


        TabLayout tab = findViewById (R.id.tabLayout2);
        tab.setupWithViewPager (vp3);
        tab.getTabAt (0).setIcon (R.drawable.ic_dashboard);
        tab.getTabAt (1).setIcon (R.drawable.ic_home);
        tab.getTabAt (2).setIcon (R.drawable.ic_about);






    }

}