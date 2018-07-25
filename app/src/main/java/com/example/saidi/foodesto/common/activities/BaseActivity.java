package com.example.saidi.foodesto.common.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by saidi on 25/07/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
    }

    /**
     * Gets the layout res id.
     *
     * @return the layout res id.
     */
    protected abstract int getLayoutId();
}
