package com.example.saidi.foodesto.utils;


import android.support.annotation.NonNull;

import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.NutrimentQuality;
import com.example.saidi.foodesto.models.NutrimentType;
import com.example.saidi.foodesto.models.SeverityType;

import java.math.BigDecimal;

public final class NutrimentsUtils {

    public static NutrimentQuality getPropertieQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer, @NonNull final NutrimentType nutrimentType) {
        switch (nutrimentType) {
            case FIBER:
                return getFiberQuality(quantity, nutrimentDataPer);
            case PROTEINS:
                return getProteinsQuality(quantity, nutrimentDataPer);
            case ENERGIE:
                return getEnergieQuality(quantity, nutrimentDataPer);
            case SUGAR:
                return getSugarQuality(quantity, nutrimentDataPer);
            case FAT:
                return getFatQuality(quantity, nutrimentDataPer);
            case SALT:
                return getSaltQuality(quantity, nutrimentDataPer);
            default:
                return new NutrimentQuality();
        }
    }

    private static NutrimentQuality getSaltQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double salt = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (salt == 0.0) {
                    return new NutrimentQuality("no salt", SeverityType.GOOD);
                } else if (salt > 0.0 && salt <= 0.46) {
                    return new NutrimentQuality("little salty", SeverityType.GOOD);
                } else if (salt > 0.46 && salt <= 0.92) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (salt > 0.92 && salt <= 1.62) {
                    return new NutrimentQuality("salty", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too salty", SeverityType.BAD);
                }
            case ML:
                if (salt == 0.0) {
                    return new NutrimentQuality("no salt", SeverityType.GOOD);
                }
                if (salt >= 0.0 && salt <= 0.23) {
                    return new NutrimentQuality("little salty", SeverityType.GOOD);
                } else if (salt > 0.23 && salt <= 0.7) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (salt > 0.7 && salt <= 1.4) {
                    return new NutrimentQuality("salty", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too salty", SeverityType.BAD);
                }
            default:
                return new NutrimentQuality();
        }
    }

    private static NutrimentQuality getEnergieQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double energy = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (energy == 0) {
                    return new NutrimentQuality("no calories", SeverityType.GOOD);
                } else if (energy > 0 && energy <= 160) {
                    return new NutrimentQuality("little caloric", SeverityType.GOOD);
                } else if (energy > 160 && energy <= 320) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (energy > 320 && energy <= 560) {
                    return new NutrimentQuality("a little too much calories", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too caloric", SeverityType.BAD);
                }
            case ML:
                if (energy == 0) {
                    return new NutrimentQuality("no calories", SeverityType.GOOD);
                } else if (energy > 0 && energy <= 1) {
                    return new NutrimentQuality("little caloric", SeverityType.GOOD);
                } else if (energy > 1 && energy <= 14) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (energy > 14 && energy <= 35) {
                    return new NutrimentQuality("a little too much calories", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too caloric", SeverityType.BAD);
                }
            default:
                return new NutrimentQuality();
        }
    }

    private static NutrimentQuality getProteinsQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double proteins = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (proteins == 0) {
                    return new NutrimentQuality("no proteins", SeverityType.MEDIOCR);
                } else if (proteins > 0 && proteins <= 8) {
                    return new NutrimentQuality("little of proteins", SeverityType.LOW_IMPACT);
                } else {
                    return new NutrimentQuality("excellent quantity of proteins", SeverityType.GOOD);
                }
            case ML:
                if (proteins == 0) {
                    return new NutrimentQuality("no proteins", SeverityType.MEDIOCR);
                } else if (proteins > 0 && proteins <= 8) {
                    return new NutrimentQuality("little of proteins", SeverityType.LOW_IMPACT);
                } else {
                    return new NutrimentQuality("excellent quantity of proteins", SeverityType.GOOD);
                }
            default:
                return new NutrimentQuality();
        }
    }

    private static NutrimentQuality getSugarQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double sugar = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (sugar == 0) {
                    return new NutrimentQuality("no sugar", SeverityType.GOOD);
                } else if (sugar > 0 && sugar <= 9) {
                    return new NutrimentQuality("little of sugar", SeverityType.GOOD);
                } else if (sugar > 9 && sugar <= 18) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (sugar > 18 && sugar <= 31) {
                    return new NutrimentQuality("a little too much of sugar", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too much sugar", SeverityType.BAD);
                }
            case ML:
                if (sugar == 0) {
                    return new NutrimentQuality("no sugar", SeverityType.GOOD);
                } else if (sugar > 0 && sugar <= 2) {
                    return new NutrimentQuality("little of sugar", SeverityType.GOOD);
                } else if (sugar > 2 && sugar <= 4) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (sugar > 4 && sugar <= 7) {
                    return new NutrimentQuality("a little too much of sugar", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too much sugar", SeverityType.BAD);
                }
            default:
                return new NutrimentQuality();
        }
    }

    private static NutrimentQuality getFiberQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double fiber = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (fiber == 0) {
                    return new NutrimentQuality("no fiber", SeverityType.MEDIOCR);
                } else if (fiber > 0 && fiber <= 4) {
                    return new NutrimentQuality("little of fiber", SeverityType.LOW_IMPACT);
                } else {
                    return new NutrimentQuality("excellent quantity of fiber", SeverityType.GOOD);
                }
            case ML:
                if (fiber == 0) {
                    return new NutrimentQuality("no fiber", SeverityType.MEDIOCR);
                } else if (fiber > 0 && fiber <= 4) {
                    return new NutrimentQuality("little of fiber", SeverityType.LOW_IMPACT);
                } else {
                    return new NutrimentQuality("excellent quantity of fiber", SeverityType.GOOD);
                }
            default:
                return new NutrimentQuality();
        }
    }

    private static NutrimentQuality getFatQuality(@NonNull final String quantity, @NonNull final String nutrimentDataPer) {
        BigDecimal decimalQuantity = new BigDecimal(quantity);
        double fat = decimalQuantity.doubleValue();
        switch (getTypeOfMeasurement(nutrimentDataPer)) {
            case GRAM:
                if (fat == 0) {
                    return new NutrimentQuality("no fat", SeverityType.GOOD);
                } else if (fat >= 0 && fat <= 2) {
                    return new NutrimentQuality("little of fat", SeverityType.GOOD);
                } else if (fat > 2 && fat <= 4) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (fat > 4 && fat <= 7) {
                    return new NutrimentQuality("a little too much of fat", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too much fat", SeverityType.BAD);
                }
            case ML:
                if (fat == 0) {
                    return new NutrimentQuality("no fat", SeverityType.GOOD);
                } else if (fat > 0 && fat <= 2) {
                    return new NutrimentQuality("little of fat", SeverityType.GOOD);
                } else if (fat > 2 && fat <= 4) {
                    return new NutrimentQuality("low impact", SeverityType.LOW_IMPACT);
                } else if (fat > 4 && fat <= 7) {
                    return new NutrimentQuality("a little too much of fat", SeverityType.MEDIOCR);
                } else {
                    return new NutrimentQuality("too much fat", SeverityType.BAD);
                }
            default:
                return new NutrimentQuality();
        }
    }

    public static int getGradeBackGround(@NonNull String grade) {
        switch (grade.toLowerCase()) {
            case "a":
                return R.drawable.bg_circle_green;
            case "b":
                return R.drawable.bg_circle_green_dark;
            case "c":
                return R.drawable.bg_circle_yellow;
            case "d":
                return R.drawable.bg_circle_pink;
            case "e":
                return R.drawable.bg_circle_red;
            default:
                return R.drawable.bg_circle_green;

        }
    }

    private static NutrimentQuantityType getTypeOfMeasurement(@NonNull final String nutrimentDataPer) {
        String substring = nutrimentDataPer.toLowerCase().substring(nutrimentDataPer.length() - 1, nutrimentDataPer.length());
        switch (substring) {
            case "g":
                return NutrimentQuantityType.GRAM;
            default:
                return NutrimentQuantityType.ML;
        }
    }

}
