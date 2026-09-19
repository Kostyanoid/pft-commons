package com.romcon.pft.commons.exception;

import com.romcon.pft.commons.error.ErrorCode;

public class EntityUpdateException extends ApiException {

    public EntityUpdateException(String entityName, String reason) {
        super(ErrorCode.ENTITY_UPDATE_FAILED, "Entity '" + entityName + "' cannot be updated: " + reason);
    }

    public EntityUpdateException(ErrorCode errorCode, String entityName, String reason) {
        super(errorCode, "Entity '" + entityName + "' cannot be updated: " + reason);
    }
}