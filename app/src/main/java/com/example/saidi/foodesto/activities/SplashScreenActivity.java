package com.example.saidi.foodesto.activities;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saidi.foodesto.BuildConfig;
import com.example.saidi.foodesto.MainActivity;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.common.activities.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends BaseActivity {
    private static final String TAG = SplashScreenActivity.class.getSimpleName();
    private static final int SPLASH_SCREEN_DURATION_MS = (BuildConfig.DEBUG ? 500 : 1500);
    @BindView(R.id.splash_icon)
    protected ImageView mSplashIcon;
    @BindView(R.id.app_name)
    protected TextView mAppName;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash_screen;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        mSplashIcon.post(new Runnable() {
            @Override
            public void run() {
                revealAnimation(mSplashIcon);
                revealAnimation(mAppName);
            }
        });
        timer();
    }

    private void timer() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                gotoMainActivity();
            }
        }, SPLASH_SCREEN_DURATION_MS);
    }

    private void gotoMainActivity() {
        // MainActivity
        startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
        finish();
    }

    private void revealAnimation(@NonNull View view) {
        int cx = view.getWidth() / 2;
        int cy = view.getHeight() / 2;
        float radius = (float) Math.hypot(cx, cy);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, radius);
            view.setVisibility(View.VISIBLE);
            animator.start();
        }

    }

}
