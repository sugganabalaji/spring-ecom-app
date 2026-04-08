package com.app.model.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(
        String orderId,
        String quantity,
        String email,
        String status,
        LocalDate orderDate,
        List<OrderItemResponse> items
) {}
