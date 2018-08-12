package com.example.saidi.foodesto.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import com.example.saidi.foodesto.MainActivity;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.activities.BarCodeActivity;
import com.example.saidi.foodesto.database.models.models.DBProduct;


public class FoodestoAppWidget extends AppWidgetProvider {


    private static final String KEY_PRODUCT = "key_product";
    private static DBProduct mDbProduct;

    static void updateAppWidget(final Context context, AppWidgetManager appWidgetManager,
                                DBProduct dbProduct, int appWidgetId) {

        mDbProduct = dbProduct;
        // Construct the RemoteViews object
        final RemoteViews views = new RemoteViews(context.getPackageName(),
                R.layout.product_widget_provider);
        PendingIntent pendingIntent;
        Intent intent = new Intent(context, BarCodeActivity.class);
        if (dbProduct != null) {
            Intent intentDetail = new Intent(context, MainActivity.class);
            intentDetail.putExtra(KEY_PRODUCT, dbProduct);
            intentDetail.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            pendingIntent = PendingIntent.getActivity(context, 0, intentDetail,
                    PendingIntent.FLAG_CANCEL_CURRENT);
        } else {
            pendingIntent = PendingIntent.getActivity(context, 0, intent,
                    PendingIntent.FLAG_CANCEL_CURRENT);
        }

        views.setOnClickPendingIntent(R.id.widget_container, pendingIntent);
        if (dbProduct != null) {
            views.setTextViewText(R.id.product_title, dbProduct.getProductName());
            views.setTextViewText(R.id.product_subtitle, dbProduct.getBrands());
        } else {
            views.setTextViewText(R.id.product_title, context.getString(R.string.no_product_widget));
        }
        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    public static void updateRecipeWidget(Context context, AppWidgetManager appWidgetManager,
                                          DBProduct dbProduct, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, dbProduct, appWidgetId);
        }
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        FoodestoAppWidgetService.startActionUpdateRecipeWidgets(context, mDbProduct);
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}
