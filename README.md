# pft-commons

Shared, dependency-free Java library for the Personal Finance Tracker services: the RFC 9457
error-code catalogue (`ErrorCode`), the `ApiException` hierarchy and cross-service API constants.

It is deliberately **not** a Spring Boot starter. Each service keeps its own
`@RestControllerAdvice`; a shared one, if ever needed, is a separate starter depending on this library.

## Build and publish locally

```bash
./gradlew build publishToMavenLocal
```

Consumers add `mavenLocal()` to their repositories and depend on `com.romcon.pft:pft-commons:0.2.0`.