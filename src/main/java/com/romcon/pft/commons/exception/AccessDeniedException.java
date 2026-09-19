package com.romcon.pft.commons.exception;

import com.romcon.pft.commons.error.ErrorCode;

public class AccessDeniedException extends ApiException {

    public AccessDeniedException(String detail) {
        super(ErrorCode.ACCESS_DENIED, detail);
    }
}