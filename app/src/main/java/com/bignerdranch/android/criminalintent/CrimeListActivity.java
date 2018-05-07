package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.widget.TextView;

public class CrimeListActivity extends SingleFragmentActivity {

    private Crime mCrime;
    private TextView mTitleTextView;
    private TextView mDateTextView;

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
