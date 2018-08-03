package com.example.saidi.foodesto.utils;


import android.support.annotation.NonNull;

import java.math.BigDecimal;

public final class NutrimentsUtils {

    public static String getSaltQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double salt = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (salt == 0.0) {
                    return "no salt";
                } else if (salt > 0.0 && salt <= 0.46) {
                    return "little salty";
                } else if (salt > 0.46 && salt <= 0.92) {
                    return "low impact";
                } else if (salt > 0.92 && salt <= 1.62) {
                    return "salty";
                } else {
                    return "too salty";
                }
            case ML:
                if (salt == 0.0) {
                    return "no salt";
                }
                if (salt >= 0.0 && salt <= 0.23) {
                    return "little salty";
                } else if (salt > 0.23 && salt <= 0.7) {
                    return "low impact";
                } else if (salt > 0.7 && salt <= 1.4) {
                    return "salty";
                } else {
                    return "too salty";
                }
            default:
                return "";
        }
    }

    public static String getEnergieQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {

        int energy = Integer.parseInt(quantity);
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (energy == 0) {
                    return "no calories";
                } else if (energy > 0 && energy <= 160) {
                    return "little caloric";
                } else if (energy > 160 && energy <= 320) {
                    return "low impact";
                } else if (energy > 320 && energy <= 560) {
                    return "a little too much calories";
                } else {
                    return "too caloric";
                }
            case ML:
                if (energy == 0) {
                    return "no calories";
                } else if (energy > 0 && energy <= 1) {
                    return "little caloric";
                } else if (energy > 1 && energy <= 14) {
                    return "low impact";
                } else if (energy > 14 && energy <= 35) {
                    return "a little too much calories";
                } else {
                    return "too caloric";
                }
            default:
                return "";
        }
    }

    public static String getProteinsQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
//TODO : change to double instead
        int proteins = Integer.parseInt(quantity);
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (proteins == 0) {
                    return "no proteins";
                } else if (proteins > 0 && proteins <= 8) {
                    return "little of proteins";
                } else {
                    return "nice quantity of proteins";
                }
            case ML:
                if (proteins == 0) {
                    return "no proteins";
                } else if (proteins > 0 && proteins <= 8) {
                    return "little of proteins";
                } else {
                    return "nice quantity of proteins";
                }
            default:
                return "";
        }
    }

    public static String getSugarQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {

        int sugar = Integer.parseInt(quantity);
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (sugar == 0) {
                    return "no sugar";
                } else if (sugar > 0 && sugar <= 9) {
                    return "little of sugar";
                } else if (sugar > 9 && sugar <= 18) {
                    return "low impact";
                } else if (sugar > 18 && sugar <= 31) {
                    return "a little too much of sugar";
                } else {
                    return "too much sugar";
                }
            case ML:
                if (sugar == 0) {
                    return "no sugar";
                } else if (sugar > 0 && sugar <= 2) {
                    return "little of sugar";
                } else if (sugar > 2 && sugar <= 4) {
                    return "low impact";
                } else if (sugar > 4 && sugar <= 7) {
                    return "a little too much of sugar";
                } else {
                    return "too much sugar";
                }
            default:
                return "";
        }
    }

    public static String getCarbohydrateQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {

        int carbohydrate = Integer.parseInt(quantity);
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (carbohydrate == 0) {
                    return "no carbohydrate";
                } else if (carbohydrate > 0 && carbohydrate <= 4) {
                    return "little of carbohydrate";
                } else {
                    return "nice quantity of carbohydrate";
                }
            case ML:
                if (carbohydrate == 0) {
                    return "no carbohydrate";
                } else if (carbohydrate > 0 && carbohydrate <= 4) {
                    return "little of carbohydrate";
                } else {
                    return "nice quantity of carbohydrate";
                }
            default:
                return "";
        }
    }

    public static String getFatQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double fat = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (fat == 0) {
                    return "no fat";
                } else if (fat >= 0 && fat <= 2) {
                    return "little of sugar";
                } else if (fat > 2 && fat <= 4) {
                    return "low impact";
                } else if (fat > 4 && fat <= 7) {
                    return "a little too much of sugar";
                } else {
                    return "too much sugar";
                }
            case ML:
                if (fat == 0) {
                    return "no fat";
                } else if (fat > 0 && fat <= 2) {
                    return "little of sugar";
                } else if (fat > 2 && fat <= 4) {
                    return "low impact";
                } else if (fat > 4 && fat <= 7) {
                    return "a little too much of sugar";
                } else {
                    return "too much sugar";
                }
            default:
                return "";
        }
    }


    private static NutrimentQuantityType getTypeOfMeasurement(@NonNull final String nutrimentDataPer) {
        String substring = nutrimentDataPer.toLowerCase().substring(0, nutrimentDataPer.length() - 1);
        switch (substring) {
            case "g":
                return NutrimentQuantityType.GRAM;
            default:
                return NutrimentQuantityType.ML;
        }
    }

}
