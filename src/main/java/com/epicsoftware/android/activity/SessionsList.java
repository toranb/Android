package com.epicsoftware.android.activity;

import android.app.Activity;
import android.os.Bundle;
import com.epicsoftware.android.async.GetSessionsAsyncTask;
import com.epicsoftware.android.global.NavigationAndTitleHelper;

public class SessionsList extends Activity {
    private NavigationAndTitleHelper navigationAndTitleHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Iowa Code Camp");
        navigationAndTitleHelper = new NavigationAndTitleHelper(this);
        navigationAndTitleHelper.setNavigationAndTitle();
    }

    @Override
    protected void onStart() {
        super.onStart();
        GetSessionsAsyncTask task = new GetSessionsAsyncTask(SessionsList.this, getApplicationContext());
        task.execute(new String[]{""});
    }
}


