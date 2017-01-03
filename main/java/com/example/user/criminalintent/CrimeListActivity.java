package com.example.user.criminalintent;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;



/**
 * Created by user on 03/01/2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
