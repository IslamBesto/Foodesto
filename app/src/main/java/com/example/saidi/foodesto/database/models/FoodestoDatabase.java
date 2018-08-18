package com.example.saidi.foodesto.database.models;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import android.util.Log;

import com.example.saidi.foodesto.database.models.dao.NutrimentDao;
import com.example.saidi.foodesto.database.models.dao.ProductDao;
import com.example.saidi.foodesto.database.models.models.DBNutriment;
import com.example.saidi.foodesto.database.models.models.DBProduct;

@Database(entities = {DBProduct.class, DBNutriment.class}, version = 1, exportSchema = false)
@TypeConverters({Converter.class})
public abstract class FoodestoDatabase extends RoomDatabase {

    private static final String TAG = FoodestoDatabase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "foodesto";
    private static FoodestoDatabase sFoodestoInstance;

    public static FoodestoDatabase getFoodestoInstance(Context context) {
        if (sFoodestoInstance == null) {
            synchronized (LOCK) {
                Log.d(TAG, "creating new instance of database");
                sFoodestoInstance = Room.databaseBuilder(context.getApplicationContext(),
                        FoodestoDatabase.class, FoodestoDatabase.DATABASE_NAME)
                        // TODO remove that after testing datbase
                        .allowMainThreadQueries()
                        .build();
            }
        }
        Log.d(TAG, "Getting the database instance");
        return sFoodestoInstance;
    }

    public abstract ProductDao productDao();

    public abstract NutrimentDao nutrimentDao();

}
