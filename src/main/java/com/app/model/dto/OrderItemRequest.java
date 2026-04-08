package com.app.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
