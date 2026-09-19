package com.romcon.pft.commons.api;

/** Names of the custom HTTP headers shared by the PFT service APIs. */
public final class ApiHeaders {

    public static final String IDEMPOTENCY_KEY = "Idempotency-Key";

    private ApiHeaders() {
        throw new UnsupportedOperationException("Constants class");
    }
}