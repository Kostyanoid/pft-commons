package com.romcon.pft.commons.error;

import java.util.Locale;

/**
 * Catalogue of machine-readable error codes shared by every PFT service.
 * <p>
 * The constant name is the value of the {@code code} extension member of an RFC 9457 problem-details
 * response, so it is part of the wire contract: constants are only ever added, never renamed or removed.
 * Each code maps to exactly one HTTP status, a default {@code title} and a problem {@code type} URI
 * derived from the constant name ({@code urn:pft:problem:<kebab-case-name>}).
 */
public enum ErrorCode {

    // -------- Common --------
    VALIDATION_FAILED(400, "Request validation failed"),
    MALFORMED_REQUEST(400, "Malformed request"),
    MISSING_REQUIRED_HEADER(400, "Required header is missing"),
    AUTHENTICATION_REQUIRED(401, "Authentication required"),
    ACCESS_DENIED(403, "Access denied"),
    RESOURCE_NOT_FOUND(404, "Resource not found"),
    METHOD_NOT_ALLOWED(405, "Method not allowed"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported media type"),
    TOO_MANY_REQUESTS(429, "Too many requests"),
    INTERNAL_ERROR(500, "Internal server error"),
    NOT_IMPLEMENTED(501, "Not implemented"),
    SERVICE_UNAVAILABLE(503, "Service temporarily unavailable"),

    // -------- CRUD --------
    ENTITY_CREATE_FAILED(409, "Cannot create"),
    ENTITY_UPDATE_FAILED(409, "Cannot update"),

    // -------- User domain --------
    INVALID_CREDENTIALS(401, "Invalid e-mail or password"),
    INVALID_REFRESH_TOKEN(401, "Invalid refresh token"),
    USER_ARCHIVED(401, "User is archived"),
    EMAIL_ALREADY_REGISTERED(409, "E-mail is already registered"),

    // -------- Operation domain --------
    ACCOUNT_ARCHIVED(409, "Account is archived"),
    CATEGORY_ARCHIVED(409, "Category is archived"),
    IDEMPOTENCY_CONFLICT(409, "Idempotency key reused with a different request"),
    IMMUTABLE_FIELD(422, "Field cannot be changed"),
    CROSS_USER_REFERENCE(422, "Referenced resource belongs to another user");

    private static final String TYPE_PREFIX = "urn:pft:problem:";

    private final int httpStatus;
    private final String title;
    private final String type;

    ErrorCode(int httpStatus, String title) {
        this.httpStatus = httpStatus;
        this.title = title;
        this.type = TYPE_PREFIX + name().toLowerCase(Locale.ROOT).replace('_', '-');
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}