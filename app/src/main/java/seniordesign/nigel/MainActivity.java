package seniordesign.nigel;

/**
 * Created by Fenel on 12/26/2015.
 */

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

import com.parse.Parse;
import com.parse.ParseUser;


public class MainActivity extends Activity {
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Check if application is signed in
        if (ParseUser.getCurrentUser() == null) {
            startActivity(new Intent(this, SignInActivity.class));
        }

        setContentView(R.layout.activity_main);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.pager);
        mViewPager.setAdapter(new NigelFragmentPagerAdapter());
    }

    public class NigelFragmentPagerAdapter extends FragmentPagerAdapter {
        final int PAGE_COUNT = 3;

        public NigelFragmentPagerAdapter() {
            super(getFragmentManager());
        }

        @Override
        public Fragment getItem(int i) {
            return fragment;
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "OBJECT " + (position + 1);
        }
    }