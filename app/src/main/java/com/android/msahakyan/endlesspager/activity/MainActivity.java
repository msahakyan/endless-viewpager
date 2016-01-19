package com.android.msahakyan.endlesspager.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.android.msahakyan.endlesspager.R;
import com.android.msahakyan.endlesspager.adapter.CustomPagerAdapter;
import com.android.msahakyan.endlesspager.helper.DummyDataSource;
import com.android.msahakyan.endlesspager.model.SwipeablePage;
import com.android.msahakyan.endlesspager.transformer.ZoomOutPageTransformer;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.view_pager)
    ViewPager mViewPager;

    private CustomPagerAdapter<SwipeablePage> mAdapterViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization ButterKnife
        ButterKnife.bind(this);

        FragmentManager fragmentManager = getSupportFragmentManager();

        if (fragmentManager != null) {
            List<SwipeablePage> itemList = DummyDataSource.getPageList();
            mAdapterViewPager = new CustomPagerAdapter(getSupportFragmentManager(), itemList);
            mViewPager.setAdapter(mAdapterViewPager);

            // This is the number of pages that should be retained to either side of the
            // current page in the view hierarchy in an idle state
            mViewPager.setOffscreenPageLimit(4);

            mViewPager.setCurrentItem(CustomPagerAdapter.PAGE_VIRTUAL_COUNT / 2, false);
        }

        // Attach the page change listener inside the activity
        mViewPager.addOnPageChangeListener(mPageChangeListener);

        // Attach page transformer
        mViewPager.setPageTransformer(false, new ZoomOutPageTransformer());
    }

    private ViewPager.OnPageChangeListener mPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
            // Code goes here
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            // Code goes here
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            // Code goes here
        }
    };
}
