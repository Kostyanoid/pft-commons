package com.romcon.pft.commons.exception;

import com.romcon.pft.commons.error.ErrorCode;

public class EntityCreateException extends ApiException {

    public EntityCreateException(String entityName, String reason) {
        super(ErrorCode.ENTITY_CREATE_FAILED, "Entity '" + entityName + "' cannot be created: " + reason);
    }

    public EntityCreateException(ErrorCode errorCode, String entityName, String reason) {
        super(errorCode, "Entity '" + entityName + "' cannot be created: " + reason);
    }
}