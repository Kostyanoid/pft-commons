package com.romcon.pft.commons.constants;

/** Regular expressions shared by the request validation of the PFT service APIs. */
public final class PatternConstants {

    /** ISO 4217 alphabetic currency code. */
    public static final String CURRENCY_CODE_PATTERN = "^[A-Z]{3}$";

    private PatternConstants() {
        throw new UnsupportedOperationException("Constants class");
    }
}