package com.example.saidi.foodesto.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.saidi.foodesto.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by saidi on 25/07/2018.
 */

public class BottomNavigationWithFabView extends FrameLayout {

    BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    @BindView(R.id.fab_button)
    protected FloatingActionButton mFloatingActionButton;

    @BindView(R.id.curve_bottom_navigation_view)
    protected CurvedBottomNavigationView mCurvedBottomNavigationView;

    public BottomNavigationWithFabView(
            @NonNull Context context) {
        super(context);
        init(context);
    }

    public BottomNavigationWithFabView(@NonNull Context context,
                                       @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BottomNavigationWithFabView(@NonNull Context context, @Nullable AttributeSet attrs,
                                       int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    protected void init(Context context) {
        LayoutInflater.from(context).inflate(getLayoutId(), this);
        ButterKnife.bind(this);
    }

    /**
     * method to get concerned layout
     *
     * @return layout id
     */
    public int getLayoutId() {
        return R.layout.view_bottom_navigation_with_fab;
    }

    /**
     * Set Navigation Item Selected Listener
     *
     * @param onNavigationItemSelectedListener Listener of type
     *                                         {@link BottomNavigationView.OnNavigationItemSelectedListener}
     */
    public void setListener(
            BottomNavigationView.OnNavigationItemSelectedListener
                    onNavigationItemSelectedListener) {
        mOnNavigationItemSelectedListener = onNavigationItemSelectedListener;
        mCurvedBottomNavigationView.setOnNavigationItemSelectedListener(
                mOnNavigationItemSelectedListener);
    }

    /**
     * Change floating button color
     *
     * @param color id of color ( R.color.white)
     */
    public void changeFabColor(int color) {
        mFloatingActionButton.setBackgroundTintList(
                ColorStateList.valueOf(getResources().getColor(color)));
    }

    /**
     * Change floating button icon
     *
     * @param IconDrawable drawable id of icon ( R.drawable.icon)
     */
    public void changeFabIcon(int IconDrawable) {
        mFloatingActionButton.setImageResource(IconDrawable);
    }

    /**
     * Change bottom navigation bar menu item icons size
     *
     * @param width        width of item icon on dp
     * @param height       height of item icon on dp
     * @param itemPosition position of the item on the navigation view
     */
    public void changeMenuItemIconSize(int width, int height, int itemPosition) {
        BottomNavigationMenuView menuView =
                (BottomNavigationMenuView) getCurvedBottomNavigationView().getChildAt(0);

        final View iconView = menuView.getChildAt(itemPosition).findViewById(
                android.support.design.R.id.icon);
        final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, width,
                displayMetrics);
        layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, height,
                displayMetrics);
        iconView.setLayoutParams(layoutParams);
    }

    /**
     * Method to add bottom navigation view menu items
     *
     * @param menuItemTitle    title of the menu item on String
     * @param menuItemDrawable drawable id of icon ( R.drawable.icon)
     * @param menuItemId       id of the item to add
     */
    public void addMenuItem(String menuItemTitle, int menuItemDrawable, int menuItemId) {
        Menu menu = mCurvedBottomNavigationView.getMenu();
        menu.add(Menu.NONE, menuItemId, Menu.NONE, menuItemTitle)
                .setIcon(menuItemDrawable);
    }

    /**
     * Method to add bottom navigation view menu items without icon
     *
     * @param menuItemTitle title of the menu item on String
     * @param menuItemId    id of the item to add
     */
    public void addMenuItemWithoutIcon(String menuItemTitle, int menuItemId) {
        Menu menu = mCurvedBottomNavigationView.getMenu();
        menu.add(Menu.NONE, menuItemId, Menu.NONE, menuItemTitle);
    }

    /**
     * Method to get the curved bottom navigation view
     *
     * @return mCurvedBottomNavigationView of type {@link CurvedBottomNavigationView}
     */
    public CurvedBottomNavigationView getCurvedBottomNavigationView() {
        return mCurvedBottomNavigationView;
    }

    @OnClick(R.id.fab_button)
    public void onFabClicked() {
        mCurvedBottomNavigationView.setSelectedItemId(R.id.catalogue_nav_menu_item);
    }

    /**
     * The FAB might loose primary focus to a view beneath (like RecyclerView)
     * if the Fragment got changed. Regain focus after the Fragment changed to fix.
     */
    public void bringsFloatingActionButtonToFront() {
        if (mFloatingActionButton != null) {
            mFloatingActionButton.bringToFront();
        }
    }

}
