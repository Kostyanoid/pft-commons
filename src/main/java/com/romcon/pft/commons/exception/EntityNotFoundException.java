package com.romcon.pft.commons.exception;

import com.romcon.pft.commons.error.ErrorCode;

public class EntityNotFoundException extends ApiException {

    public EntityNotFoundException(String entityName, String entityId) {
        super(ErrorCode.RESOURCE_NOT_FOUND, "Entity '" + entityName + "' not found with id '" + entityId + "'");
    }
}