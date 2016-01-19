package com.android.msahakyan.endlesspager.adapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.msahakyan.endlesspager.fragment.FragmentA;
import com.android.msahakyan.endlesspager.fragment.FragmentB;
import com.android.msahakyan.endlesspager.fragment.FragmentC;
import com.android.msahakyan.endlesspager.fragment.FragmentD;
import com.android.msahakyan.endlesspager.helper.BundleKey;
import com.android.msahakyan.endlesspager.model.PagerItem;

import java.util.List;

/**
 * @author msahakyan
 */
public class CustomPagerAdapter<T extends PagerItem & Parcelable> extends FragmentStatePagerAdapter {

    public static final int PAGE_VIRTUAL_COUNT = 1000000;
    private List<T> mItems;

    public CustomPagerAdapter(FragmentManager fragmentManager, List<T> items) {
        super(fragmentManager);
        mItems = items;
    }

    /**
     * Returns total number of pages
     *
     * @return <code>int</code>
     */
    @Override
    public int getCount() {
        return PAGE_VIRTUAL_COUNT;
    }

    /**
     * Returns the fragment to display for that page
     *
     * @param position real position
     * @return <code>android.support.v4.app.Fragment</code>
     */
    @Override
    public Fragment getItem(int position) {
        int actualPosition = getActualPosition(position);
        switch (mItems.get(actualPosition).getType()) {
            case PagerItem.TYPE_A:
                return instantiateFragmentA(actualPosition);
            case PagerItem.TYPE_B:
                return instantiateFragmentB(actualPosition);
            case PagerItem.TYPE_C:
                return instantiateFragmentC(actualPosition);
            case PagerItem.TYPE_D:
                return instantiateFragmentD(actualPosition);
            default:
                throw new UnsupportedOperationException();
        }
    }

    private Fragment instantiateFragmentA(int position) {
        Fragment fragmentA = FragmentA.newInstance();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BundleKey.EXTRA_ARGUMENT, mItems.get(position));
        fragmentA.setArguments(bundle);

        return fragmentA;
    }

    private Fragment instantiateFragmentB(int position) {
        Fragment fragmentB = FragmentB.newInstance();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BundleKey.EXTRA_ARGUMENT, mItems.get(position));
        fragmentB.setArguments(bundle);

        return fragmentB;
    }

    /**
     * @param position actual position
     * @return
     */
    private Fragment instantiateFragmentC(int position) {
        Fragment fragmentC = FragmentC.newInstance();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BundleKey.EXTRA_ARGUMENT, mItems.get(position));
        fragmentC.setArguments(bundle);

        return fragmentC;
    }

    private Fragment instantiateFragmentD(int position) {
        Fragment fragmentD = FragmentD.newInstance();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BundleKey.EXTRA_ARGUMENT, mItems.get(position));
        fragmentD.setArguments(bundle);

        return fragmentD;
    }

    /**
     * Returns the page title for the top indicator
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page (" + (position - PAGE_VIRTUAL_COUNT / 2) + ")";
    }

    /**
     * Returns actual position of the page (possible values for this example: 0, 1, 2, 3)
     *
     * @param position real position of the page
     * @return <code>int</code>
     */
    private int getActualPosition(int position) {
        return position % mItems.size();
    }
}
