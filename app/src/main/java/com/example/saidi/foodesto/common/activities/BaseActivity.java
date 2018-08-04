package com.example.saidi.foodesto.common.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.saidi.foodesto.BaseFragment;

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            return onNavigateUp();
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigateUp() {
        clearBackStack();
        return true;
    }

    // region Action bar


    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        initActionBar();
    }

    /**
     * Enables the up button in the action bar if possible.
     */
    private void initActionBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    /**
     * Enables the up button and sets a title in the action bar if possible.
     *
     * @param titleBarRes the action bar title resource.
     */
    private void initActionBar(@StringRes int titleBarRes) {
        initActionBar();
        if (getSupportActionBar() != null) {
            setActionBarTitle(titleBarRes);
        }
    }

    /**
     * Sets the action bar title if possible.
     *
     * @param titleBarRes the action bar title.
     */
    public void setActionBarTitle(@StringRes int titleBarRes) {
        setActionBarTitle(getString(titleBarRes));
    }

    /**
     * Sets the action bar title if possible.
     *
     * @param title the action bar title
     */
    public void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    /**
     * Gets the layout res id.
     *
     * @return the layout res id.
     */
    protected abstract int getLayoutId();


    /**
     * Replaces a fragment on the screen.
     *
     * @param containerViewId the fragment view anchor.
     * @param fragment        the fragment to add.
     * @param addToBackStack  true to add the transaction to the backstack, false otherwise.
     */
    protected final void replaceFragment(final int containerViewId, final BaseFragment fragment,
                                         final boolean addToBackStack) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(containerViewId, fragment);

        if (addToBackStack) {
            transaction.addToBackStack(null);
        } else {
            transaction.addToBackStack(fragment.toString());
        }
        transaction.commitAllowingStateLoss();
    }

    /**
     * Clears the back stack.
     */
    protected final void clearBackStack() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
