package com.deliverynow.order.application.usecase;

import com.deliverynow.order.adapters.controller.response.OrderResponse;

public interface ResumeOrderUseCase {

    OrderResponse getResumeOrder(String customerId);
}
