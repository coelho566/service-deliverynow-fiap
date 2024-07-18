package com.deliverynow.order.domain.gateway;

import com.deliverynow.order.domain.entity.Order;
import com.deliverynow.order.infrastructure.rest.response.QrCodeResponse;

public interface ProcessPaymentGateway {

    QrCodeResponse processPayment(Order order);
}
