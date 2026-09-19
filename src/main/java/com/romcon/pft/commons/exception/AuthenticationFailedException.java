package com.romcon.pft.commons.exception;

import com.romcon.pft.commons.error.ErrorCode;

public class AuthenticationFailedException extends ApiException {

    private static final int UNAUTHORIZED = 401;

    public AuthenticationFailedException(ErrorCode errorCode, String detail) {
        super(requireUnauthorized(errorCode), detail);
    }

    private static ErrorCode requireUnauthorized(ErrorCode errorCode) {
        if (errorCode == null || errorCode.getHttpStatus() != UNAUTHORIZED) {
            throw new IllegalArgumentException(
                "AuthenticationFailedException requires an HTTP 401 error code, got: " + errorCode);
        }
        return errorCode;
    }
}