package com.example.saidi.foodesto;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.common.activities.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created by saidi on 26/07/2018.
 */

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    /**
     * Gets the parent activity, as a BaseActivity (so you can access its special methods)
     *
     * @return the parent activity.
     */
    @Nullable
    public BaseActivity getBaseActivity() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return (BaseActivity) getActivity();
        }
        return null;
    }

    @Nullable
    public MainActivity getMainActivity() {
        final BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            return (MainActivity) baseActivity;
        }
        return null;
    }

    /**
     * Gets the layout res id.
     *
     * @return the layout res id.
     */
    protected abstract int getLayoutId();
}
