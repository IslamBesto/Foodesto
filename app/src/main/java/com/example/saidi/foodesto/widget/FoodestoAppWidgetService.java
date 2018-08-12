package com.example.saidi.foodesto.widget;

import android.app.IntentService;
import android.app.Notification;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;

import com.example.saidi.foodesto.database.models.models.DBProduct;


public class FoodestoAppWidgetService extends IntentService {
    private static final String KEY_PRODUCT = "key_product";

    public FoodestoAppWidgetService(String name) {
        super(name);
    }

    public FoodestoAppWidgetService() {
        super("FoodestoAppWidgetService");
    }

    public static void startActionUpdateRecipeWidgets(Context context, DBProduct dbProduct) {
        Intent intent = new Intent(context, FoodestoAppWidgetService.class);
        intent.putExtra(KEY_PRODUCT, dbProduct);
        ContextCompat.startForegroundService(context, intent);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        startForeground(1, new Notification());
        if (intent != null) {
            DBProduct dbProduct = (DBProduct) intent.getSerializableExtra(KEY_PRODUCT);
            handleActionChangeRecipe(dbProduct);
        }
    }

    private void handleActionChangeRecipe(DBProduct dbProduct) {
        final AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        final int[] appWidgetIds = appWidgetManager.getAppWidgetIds(
                new ComponentName(this, FoodestoAppWidget.class));
        FoodestoAppWidget.updateRecipeWidget(getBaseContext(), appWidgetManager, dbProduct,
                appWidgetIds);
    }
}
