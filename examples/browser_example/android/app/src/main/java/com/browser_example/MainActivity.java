package com.browser_example;

import android.content.Intent;

import com.facebook.react.ReactActivity;

import io.branch.rnbranch.RNBranchModule;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "browser_example";
    }

    //*
    @Override
    protected void onStart() {
        super.onStart();
        RNBranchModule.initSession(getIntent().getData(), this);
    }
    // */

    /*
    @Override
    protected void onResume() {
        super.onResume();
        RNBranchModule.initSession(getIntent().getData(), this);
    }

    // */

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
