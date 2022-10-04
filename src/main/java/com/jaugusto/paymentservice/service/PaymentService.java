package com.jaugusto.paymentservice.service;

import com.jaugusto.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
