package com.example.saidi.foodesto.utils;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;

import java.util.Locale;

/**
 * StringUtils class, common operations can be executed here.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public final class StringUtils {
    /**
     * String reference type name. Used when searching a string reference from its name.
     */
    private static final String STRING_IDENTIFIER = "string";

    /**
     * Private constructor - avoid class instantiation.
     */
    private StringUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Finds the string resource with the <code>resourceName</code> resource name and returns its
     * value.
     *
     * @param context      the context.
     * @param resourceName the string resource name.
     * @return the string value.
     */
    public static String getStringByResourceName(Context context, String resourceName) {
        return context.getString(context.getResources()
                .getIdentifier(resourceName, STRING_IDENTIFIER, context.getPackageName()));
    }

    /**
     * Set the first character of a text in uppercase.
     *
     * @param text text to set the character in uppercase
     * @return the text with the first character in uppercase.
     */
    public static String capitalize(String text) {
        return capitalize(text, false);
    }

    /**
     * Sets the first character of a text in uppercase.
     *
     * @param text           text to set the character in uppercase
     * @param forceLowerCase true to force the rest of the text in
     *                       lowercase, false to change nothing.
     * @return the text with the first character in uppercase.
     */
    public static String capitalize(String text, boolean forceLowerCase) {
        if (isNullOrEmpty(text)) {
            return null;
        }

        StringBuilder builder = new StringBuilder(2);
        builder.append(text.substring(0, 1).toUpperCase(Locale.US));
        // Avoid crash with one character strings
        if (text.length() > 1) {
            if (forceLowerCase) {
                builder.append(text.substring(1).toLowerCase(Locale.US));
            } else {
                builder.append(text.substring(1));
            }
        }
        return builder.toString();
    }

    /**
     * Check if the a string is null or empty. The string to check is trimmed
     * before the verification is done.
     *
     * @param text string to check.
     * @return true if a string is null or empty, false otherwise
     */
    public static boolean isNullOrEmpty(String text) {
        return (text == null) || TextUtils.isEmpty(text.trim());
    }

    /**
     * Strips HTML tags from a string.
     *
     * @param string to strip
     * @return HTML-tags free string
     */
    public static String htmlStrip(String string) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml(string, Html.FROM_HTML_MODE_LEGACY).toString();
        } else {
            //noinspection deprecation
            return Html.fromHtml(string).toString();
        }
    }

    public static boolean containsIgnoreCase(String s1, String s2) {
        return s1.toLowerCase().contains(s2.toLowerCase());
    }

}
