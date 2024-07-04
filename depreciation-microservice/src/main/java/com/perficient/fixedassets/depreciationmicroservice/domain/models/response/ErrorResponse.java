package com.perficient.fixedassets.depreciationmicroservice.domain.models.response;

public record ErrorResponse(
        String code,
        String errorMessage
) {
}