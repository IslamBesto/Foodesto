package com.example.saidi.foodesto.utils;


import android.support.annotation.NonNull;

import java.math.BigDecimal;

public final class NutrimentsUtils {

    public static String getSaltQualiity(@NonNull final String quantity, @NonNull final NutrimentQuantityType nutrimentQuantityType) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double doubleValue = decimalQuantity.doubleValue();
        switch (nutrimentQuantityType) {
            case GRAM:
                if (doubleValue >= 0.0 && doubleValue <= 0.46) {
                    return "little salty";
                } else if (doubleValue > 0.46 && doubleValue <= 0.92) {
                    return "low impact";
                } else if (doubleValue > 0.92 && doubleValue <= 1.62) {
                    return "salty";
                } else {
                    return "too salty";
                }
            case ML:
                if (doubleValue >= 0.0 && doubleValue <= 0.23) {
                    return "little salty";
                } else if (doubleValue > 0.23 && doubleValue <= 0.7) {
                    return "low impact";
                } else if (doubleValue > 0.7 && doubleValue <= 1.4) {
                    return "salty";
                } else {
                    return "too salty";
                }
            default:
                return "";
        }
    }
}
