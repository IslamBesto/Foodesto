package com.example.saidi.foodesto.database.models;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.saidi.foodesto.database.models.models.DBNutriment;
import com.example.saidi.foodesto.database.models.models.DBProduct;

import java.util.List;

public enum DatabaseFacade {
    INSTANCE;

    private FoodestoDatabase mFoodestoDatabase;

    private static void callInBackground(@NonNull final Runnable runnable) {
        // Running in background while not having Room.allowMainThreadQueries() hides the logs!
        synchronized (DatabaseFacade.class) {
            runnable.run();
        }
    }

    private static <T> void notify(@NonNull final DatabaseCallback<T> callback, @Nullable final T result) {
        // Will always be on MainThread (AKA UIThread)
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                callback.databaseCallback(result);
            }
        });
    }

    public void init(@NonNull Context context) {
        mFoodestoDatabase = FoodestoDatabase.getFoodestoInstance(context);
    }

    // Product
    public void getProducts(@Nullable final DatabaseCallback<List<DBProduct>> callback) {
        callInBackground(new Runnable() {
            @Override
            public void run() {
                final List<DBProduct> dbProducts = mFoodestoDatabase.productDao().getProducts();
                if (callback != null) {
                    DatabaseFacade.notify(callback, dbProducts);
                }
            }
        });
    }

    public void insertProduct(@NonNull final DBProduct dbProduct, @Nullable final DatabaseCallback<Long> callback) {
        callInBackground(new Runnable() {
            @Override
            public void run() {
                mFoodestoDatabase.productDao().insert(dbProduct);
                if (callback != null) {
                    Long lastProductAdded = mFoodestoDatabase.productDao().getLastProductAdded();
                    DatabaseFacade.notify(callback, lastProductAdded);
                }
            }
        });
    }

    // Nutriment
    public void getNutriments(@NonNull final DatabaseCallback<List<DBNutriment>> callback) {
        callInBackground(new Runnable() {
            @Override
            public void run() {
                final List<DBNutriment> nutriment = mFoodestoDatabase.nutrimentDao().getNutriment();
                DatabaseFacade.notify(callback, nutriment);

            }
        });
    }

    public void insertNutriment(@NonNull final DBNutriment dbNutriment, @Nullable final DatabaseCallback<Long> callback) {
        callInBackground(new Runnable() {
            @Override
            public void run() {
                mFoodestoDatabase.nutrimentDao().insert(dbNutriment);
                if (callback != null) {
                    Long lastNutrimentAdded = mFoodestoDatabase.nutrimentDao().getLastNutrimentAdded();
                    DatabaseFacade.notify(callback, lastNutrimentAdded);
                }
            }
        });
    }

    public interface DatabaseCallback<T> {

        void databaseCallback(@Nullable T result);

    }
}
