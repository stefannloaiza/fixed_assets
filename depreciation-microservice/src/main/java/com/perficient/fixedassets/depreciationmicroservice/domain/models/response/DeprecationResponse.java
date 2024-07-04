package com.perficient.fixedassets.depreciationmicroservice.domain.models.response;

import org.springframework.http.HttpStatus;

import java.util.List;

public record DeprecationResponse(
        String message,
        HttpStatus status,
        List<ErrorResponse> error
) {
}
