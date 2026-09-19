package com.romcon.pft.commons.exception;

import com.romcon.pft.commons.error.ErrorCode;

public abstract class ApiException extends RuntimeException {

    protected static final String DEFAULT_ERROR_TYPE = "about:blank";

    protected final String type;
    protected final int status;
    protected final String title;
    protected String detail;
    protected String instance;
    protected String code;

    protected ApiException(String code, String type, int status, String title, String detail) {
        super(detail);
        this.type = type;
        this.status = status;
        this.title = title;
        this.code = code;
        this.detail = detail;
    }

    protected ApiException(String type, ErrorCode errorCode, String detail) {
        super(detail);
        this.type = type;
        this.status = errorCode.getHttpStatus();
        this.title = errorCode.getTitle();
        this.code = errorCode.name();
        this.detail = detail;
    }

    protected ApiException(String code, int status, String title, String detail) {
        super(detail);
        this.type = DEFAULT_ERROR_TYPE;
        this.status = status;
        this.title = title;
        this.code = code;
        this.detail = detail;
    }

    protected ApiException(ErrorCode errorCode, String detail) {
        super(detail);
        this.type = errorCode.getType();
        this.status = errorCode.getHttpStatus();
        this.title = errorCode.getTitle();
        this.code = errorCode.name();
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public Integer getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public String getInstance() {
        return instance;
    }

    public String getCode() {
        return code;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Override
    public String toString() {
        return "[%s]: %s(%s) - %s:%s".formatted(this.getClass().getSimpleName(), code, status, title, detail);
    }
}